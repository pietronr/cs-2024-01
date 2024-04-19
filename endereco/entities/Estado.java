package endereco.entities;

import java.util.ArrayList;
import java.util.List;

public class Estado {

    private String sigla;
    public String nome;
    public Pais pais;
    private List<Cidade> cidades;

    public Estado(Pais pais) {
        this.pais = pais;
        this.cidades = new ArrayList<>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public void removerCidade(Cidade cidade) {
        cidades.remove(cidade);
    }
}
