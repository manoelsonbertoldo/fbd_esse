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
public class Apartamentos extends Imoveis{
    private int id;
    private int quartos;
    private int banheiros;
    private int salas;
    private int cozihas;
    private int garagens;
    private double area;
    private int enderecos_id;
    private int proprietario_id;
    private int imoveis_id;
    private Predios predios;

    public Predios getPredios() {
        return predios;
    }

    public void setPredios(Predios predios) {
        this.predios = predios;
    }
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
    

    public Apartamentos() {
    }

    @Override
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSalas() {
        return salas;
    }

    public void setSalas(int salas) {
        this.salas = salas;
    }

    public int getCozihas() {
        return cozihas;
    }

    public void setCozihas(int cozihas) {
        this.cozihas = cozihas;
    }

    public int getGaragens() {
        return garagens;
    }

    public void setGaragens(int garagens) {
        this.garagens = garagens;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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
    
    
    
    
}
