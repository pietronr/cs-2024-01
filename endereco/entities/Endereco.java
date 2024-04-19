package endereco.entities;

import endereco.enums.*;
import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    public Bairro bairro;
    public TipoEndereco tipoEndereco;
    public Logradouro logradouro;
    public List<PessoaFisica> pessoas;

    public Endereco(Integer numero, String complemento, Integer cep, Bairro bairro, TipoEndereco tipoEndereco, Logradouro logradouro) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro;
        this.pessoas = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public List<PessoaFisica> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaFisica> pessoas) {
        this.pessoas = pessoas;
    }

    public void adicionarPessoa(PessoaFisica pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(PessoaFisica pessoa) {
        pessoas.remove(pessoa);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' + 
                ", tipoEndereco=" + tipoEndereco +
                '}';
    }
}
