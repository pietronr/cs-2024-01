package endereco.entities;

import endereco.enums.TipoLogradouro;
import java.util.ArrayList;
import java.util.List;

public class Logradouro {
    private String nome;
    public TipoLogradouro tipoLogradouro;
    public List<Endereco> enderecos;

    public Logradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void removerEndereco(Endereco endereco) {
        enderecos.remove(endereco);
    }
}
