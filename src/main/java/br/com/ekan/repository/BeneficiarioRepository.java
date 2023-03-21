package br.com.ekan.repository;

import br.com.ekan.modelo.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

//	List<Beneficiario> findByCursoNome(String nomeCurso);

}
