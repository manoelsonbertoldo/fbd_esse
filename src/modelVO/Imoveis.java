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
public class Imoveis {
    private int id;
    private String rgi;
    private double valor;

    public Imoveis() {
    }

    @Override
    public String toString() {
        return "Imoveis{" + "id=" + id + ", rgi=" + rgi + ", valor=" + valor + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRgi() {
        return rgi;
    }

    public void setRgi(String rgi) {
        this.rgi = rgi;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
