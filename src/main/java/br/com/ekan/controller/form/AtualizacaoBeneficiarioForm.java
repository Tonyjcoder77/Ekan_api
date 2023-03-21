package br.com.ekan.controller.form;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.repository.BeneficiarioRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class AtualizacaoBeneficiarioForm {
    @NotNull @NotEmpty
    private String nome;
    @NotNull @NotEmpty
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Beneficiario atualizar(Long id, BeneficiarioRepository beneficiarioRepository) {
        Beneficiario bn =  beneficiarioRepository.getOne(id);
        bn.setNome(this.nome);
        bn.setTelefone(this.telefone);
        bn.setDataNascimento(this.dataNascimento);
        bn.setDataAtualizacao(LocalDate.now());
        return bn;
    }

}
