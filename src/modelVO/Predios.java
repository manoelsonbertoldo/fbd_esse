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
public class Predios {
  private int id;
  private String nome;
  private int enderecos_id;
  private Enderecos enderecos;

    public int getEnderecos_id() {
        return enderecos_id;
    }

    public void setEnderecos_id(int enderecos_id) {
        this.enderecos_id = enderecos_id;
    }

    public Predios() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Predios{" + "id=" + id + ", nome=" + nome + ", enderecos=" + enderecos + '}';
    }
  
  
}
