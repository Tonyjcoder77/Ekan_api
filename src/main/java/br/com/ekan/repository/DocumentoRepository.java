package br.com.ekan.repository;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.modelo.Documento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    List<Documento> findByBeneficiario_Id(Long Id);

}
