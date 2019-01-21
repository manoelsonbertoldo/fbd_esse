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
public class Municipios {
    private int id;
    private String descricao;
    private Estados estado;
private int estados_id;

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public int getEstados_id() {
        return estados_id;
    }

    public void setEstados_id(int estados_id) {
        this.estados_id = estados_id;
    }
    public Municipios() {
    }

    @Override
    public String toString() {
        return "Municipios{" + "id=" + id + ", descricao=" + descricao + ", estado=" + estado + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstados() {
        return estado;
    }

    public void setEstados(Estados estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
