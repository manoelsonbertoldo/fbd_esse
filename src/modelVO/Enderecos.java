/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelVO;

/**
 *
 * @author manoelson
 */
public class Enderecos {
    private int id;
    private String cep;
    private String rua;
    private int numero;
    private int municipios_id;
    private Municipios municipios;

    public int getMunicipios_id() {
        return municipios_id;
    }

    public void setMunicipios_id(int municipios_id) {
        this.municipios_id = municipios_id;
    }

    public Enderecos() {
    }

    @Override
    public String toString() {
        return "Enderecos{" + "id=" + id + ", cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", municipios=" + municipios + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Municipios getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipios municipios) {
        this.municipios = municipios;
    }
    
    
    
    
}
