package endereco.entities;

import endereco.enums.*;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    public Bairro bairro;
    public TipoEndereco tipoEndereco;

    public Endereco(Integer numero, String complemento, Integer cep, Bairro bairro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
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
