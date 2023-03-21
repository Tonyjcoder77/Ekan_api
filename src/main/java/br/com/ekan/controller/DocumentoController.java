package br.com.ekan.controller;

import br.com.ekan.controller.dto.BeneficiarioDto;
import br.com.ekan.controller.dto.DocumentoDto;
import br.com.ekan.controller.form.BeneficiarioForm;
import br.com.ekan.controller.form.DocumentoForm;
import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.modelo.Documento;
import br.com.ekan.repository.BeneficiarioRepository;
import br.com.ekan.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Documentos")
public class DocumentoController {
	
	@Autowired
	private DocumentoRepository documentoRepository;
	@Autowired
	private BeneficiarioRepository beneficiarioRepository;

	@GetMapping("/Todos")
	public List<DocumentoDto> lista() {
			List<Documento> documentos = documentoRepository.findAll();

			return DocumentoDto.converter(documentos);
	}

	@GetMapping("/{id}")
	public List<DocumentoDto> lista(@PathVariable Long id) {
		List<Documento> documentos = documentoRepository.findByBeneficiario_Id(id);

		return DocumentoDto.converter(documentos);
	}

	@PostMapping("/Cadastrar/{id}")
	@Transactional
	public ResponseEntity<?> cadastrar(@PathVariable Long id, @RequestBody @Valid DocumentoForm form) {
		Optional<Beneficiario> optional = beneficiarioRepository.findById(id);
		if (optional.isPresent()) {
			Documento documento = form.converter(optional.get().getId(), beneficiarioRepository);
			documentoRepository.save(documento);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}
