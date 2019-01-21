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
public class Vendas {
    private int id;
    private String data;
    private int nota_Fiscal;
    private Boolean status;
    private double total;
    private double desconto;
    private double valor_recebido;
    private double troco;
    private int clientes_id;
    
    private int imoveis_id;
    private Clientes clientes;
    private Imoveis imoveis;

    public int getClientes_id() {
        return clientes_id;
    }

    public void setClientes_id(int clientes_id) {
        this.clientes_id = clientes_id;
    }

    public int getImoveis_id() {
        return imoveis_id;
    }

    public void setImoveis_id(int imoveis_id) {
        this.imoveis_id = imoveis_id;
    }

    public Vendas() {
    }

    @Override
    public String toString() {
        return "Vendas{" + "id=" + id + ", data=" + data + ", nota_Fiscal=" + nota_Fiscal + ", status=" + status + ", total=" + total + ", desconto=" + desconto + ", valor_recebido=" + valor_recebido + ", troco=" + troco + ", clientes=" + clientes + ", imoveis=" + imoveis + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNota_Fiscal() {
        return nota_Fiscal;
    }

    public void setNota_Fiscal(int nota_Fiscal) {
        this.nota_Fiscal = nota_Fiscal;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor_recebido() {
        return valor_recebido;
    }

    public void setValor_recebido(double valor_recebido) {
        this.valor_recebido = valor_recebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Imoveis getImoveis() {
        return imoveis;
    }

    public void setImoveis(Imoveis imoveis) {
        this.imoveis = imoveis;
    }
    
    
    
    
    
}
