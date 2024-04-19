package endereco.entities;
import endereco.enums.*;

public class Endereco {
    private String numero;
    private String complemento;
    private String cep;
    public Bairro bairro;
    public TipoEndereco tipoEndereco;

    // Construtor
    public Endereco(String numero, String complemento, String cep, Bairro bairro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
    }

    // Getters e setters para numero, complemento, cep, bairro e tipoEndereco
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
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

    // Método toString para representar o endereço como uma String
    @Override
    public String toString() {
        return "Endereco{" +
                "numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", tipoEndereco=" + tipoEndereco +
                '}';
    }
}

