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
public class Terrenos extends Imoveis{
    
  private int id;
  private double comprimento;
  private double largura; 
  private double area;
  private int enderecos_id;
   private int proprietario_id;
   private int imoveis_id;
  private Enderecos enderecos;
  private Proprietarios proprietarios;
  private Imoveis imoveis;

    public int getEnderecos_id() {
        return enderecos_id;
    }

    public void setEnderecos_id(int enderecos_id) {
        this.enderecos_id = enderecos_id;
    }

    public int getProprietario_id() {
        return proprietario_id;
    }

    public void setProprietario_id(int proprietario_id) {
        this.proprietario_id = proprietario_id;
    }

    public int getImoveis_id() {
        return imoveis_id;
    }

    public void setImoveis_id(int imoveis_id) {
        this.imoveis_id = imoveis_id;
    }

    public Terrenos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    public Proprietarios getProprietarios() {
        return proprietarios;
    }

    public void setProprietarios(Proprietarios proprietarios) {
        this.proprietarios = proprietarios;
    }

    public Imoveis getImoveis() {
        return imoveis;
    }

    public void setImoveis(Imoveis imoveis) {
        this.imoveis = imoveis;
    }
    

    @Override
    public String toString() {
        return "Terrenos{" + "id=" + id + ", comprimento=" + comprimento + ", largura=" + largura + ", area=" + area + ", enderecos=" + enderecos + ", proprietarios=" + proprietarios + ", imoveis=" + imoveis + '}';
    }
  
  

    
}
