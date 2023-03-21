package br.com.ekan.controller.dto;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.modelo.Documento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DocumentoDto {

    private Long id;
    private String tipoDocumento;
    private String descricao;
    private LocalDate dataInclusao;
    private LocalDate dataAtualizacao;

    public DocumentoDto(Documento documento) {
        this.id = documento.getId();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataInclusao = documento.getDataInclusao();
        this.dataAtualizacao = documento.getDataAtualizacao();
    }

    public Long getId() {
        return id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public static List<DocumentoDto> converter(List<Documento> documentos) {
        return documentos.stream().map(DocumentoDto::new).collect(Collectors.toList());
    }

}
