package br.com.ekan.controller.form;

import br.com.ekan.modelo.Beneficiario;
import br.com.ekan.repository.BeneficiarioRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class BeneficiarioForm {
    @NotNull @NotEmpty
    private String nome;
    @NotNull @NotEmpty
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
//    private LocalDate dataInclusao;
//    private LocalDate dataAtualizacao;
    @NotNull @NotEmpty
    private String email;
    @NotNull @NotEmpty
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
//    public void setDataInclusao(LocalDate dataInclusao) {
//        this.dataInclusao = dataInclusao;
//    }
//    public void setDataAtualizacao(LocalDate dataAtualizacao) {
//        this.dataAtualizacao = dataAtualizacao;
//    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Beneficiario converter() {
        Beneficiario bn =  new Beneficiario();
        bn.setNome(this.nome);
        bn.setTelefone(this.telefone);
        bn.setDataNascimento(this.dataNascimento);
        bn.setDataInclusao(LocalDate.now());
        bn.setDataAtualizacao(LocalDate.now());
        bn.setEmail(this.email);
        bn.setSenha(this.senha);
        return bn;
    }

}
