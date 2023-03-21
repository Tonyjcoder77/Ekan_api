package br.com.ekan.controller.form;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.modelo.Documento;
import br.com.ekan.repository.BeneficiarioRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DocumentoForm {
    @NotNull @NotEmpty
    private String tipoDocumento;
    @NotNull @NotEmpty
    private String descricao;
//    private LocalDate dataInclusao;
//    private LocalDate dataAtualizacao;
//    private Beneficiario beneficiario;


    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public void setDataInclusao(LocalDate dataInclusao) {
//        this.dataInclusao = dataInclusao;
//    }
//
//    public void setDataAtualizacao(LocalDate dataAtualizacao) {
//        this.dataAtualizacao = dataAtualizacao;
//    }
//
//    public void setBeneficiario(Beneficiario beneficiario) {
//        this.beneficiario = beneficiario;
//    }
    public Documento converter(Long id, BeneficiarioRepository beneficiarioRepository) {
        Beneficiario bn =  beneficiarioRepository.getOne(id);
        Documento doc =  new Documento();
        doc.setTipoDocumento(this.tipoDocumento);
        doc.setDescricao(this.descricao);
        doc.setDataInclusao(LocalDate.now());
        doc.setDataAtualizacao(LocalDate.now());
        doc.setBeneficiario(bn);
        return doc;
    }

}
