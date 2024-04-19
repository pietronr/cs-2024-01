package endereco.entities;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    public String nome;
    private List<Estado> estados;

    public Pais() {
        this.estados = new ArrayList<>();
    }

    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }

    public void removerEstado(Estado estado) {
        estados.remove(estado);
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}