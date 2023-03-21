package br.com.ekan.controller.dto;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.modelo.Documento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BeneficiarioDto {

	private Long id;
	private String nome;
	private String telefone;
	private LocalDate dataNascimento;
	private List<Documento> documentos = new ArrayList<>();

	public BeneficiarioDto(Beneficiario beneficiario) {
		this.id = beneficiario.getId();
		this.nome = beneficiario.getNome();
		this.telefone = beneficiario.getTelefone();
		this.dataNascimento = beneficiario.getDataNascimento();
		this.documentos = beneficiario.getDocumentos();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public static List<BeneficiarioDto> converter(List<Beneficiario> beneficiarios) {
		return beneficiarios.stream().map(BeneficiarioDto::new).collect(Collectors.toList());
	}
}
