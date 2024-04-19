package endereco.entities;

public class Cidade {
    private String nome;
    public Estado estado;

    public Cidade(Estado estado) {
        this.estado = estado;
    }

    // Método getter para obter o objeto Pais
    public Estado getEstado() {
        return estado;
    }

    // Método setter para definir o objeto Pais
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
