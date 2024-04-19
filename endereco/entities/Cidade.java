package endereco.entities;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    public Estado estado;
    public List<Bairro> bairros;

    public Cidade(Estado estado) {
        this.estado = estado;
        this.bairros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    public void adicionarBairro(Bairro bairro) {
        bairros.add(bairro);
    }

    public void removerBairro(Bairro bairro) {
        bairros.remove(bairro);
    }
}
