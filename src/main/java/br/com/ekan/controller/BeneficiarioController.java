package br.com.ekan.controller;

import br.com.ekan.controller.dto.BeneficiarioDto;
import br.com.ekan.controller.form.AtualizacaoBeneficiarioForm;
import br.com.ekan.controller.form.BeneficiarioForm;
import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.repository.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Beneficiarios")
public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioRepository beneficiarioRepository;

	@GetMapping
	public List<BeneficiarioDto> lista() {
			List<Beneficiario> beneficiarios = beneficiarioRepository.findAll();

			return BeneficiarioDto.converter(beneficiarios);
	}

	@PostMapping
	@Transactional
	public ResponseEntity<?> cadastrar(@RequestBody @Valid BeneficiarioForm form) {
		Beneficiario beneficiario = form.converter();
		beneficiarioRepository.save(beneficiario);

		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<BeneficiarioDto>
	       atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoBeneficiarioForm form) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Optional<Beneficiario> optional = beneficiarioRepository.findById(id);
		if (optional.isPresent()) {
			Beneficiario beneficiario = form.atualizar(id, beneficiarioRepository);
			beneficiarioRepository.save(beneficiario);
			return ResponseEntity.ok(new BeneficiarioDto(beneficiario));
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Beneficiario> optional = beneficiarioRepository.findById(id);
		if (optional.isPresent()) {
			beneficiarioRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}
