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
public class Pagamentos_Vendas {
private int id;
private int id_venda;
private int id_pagamento;
private int id_pagamentos_vendas;
private int id_vendas_pagamentos;

    public Pagamentos_Vendas() {
    }

    @Override
    public String toString() {
        return "Pagamentos_Vendas{" + "id=" + id + ", id_venda=" + id_venda + ", id_pagamento=" + id_pagamento + ", id_pagamentos_vendas=" + id_pagamentos_vendas + ", id_vendas_pagamentos=" + id_vendas_pagamentos + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getId_pagamentos_vendas() {
        return id_pagamentos_vendas;
    }

    public void setId_pagamentos_vendas(int id_pagamentos_vendas) {
        this.id_pagamentos_vendas = id_pagamentos_vendas;
    }

    public int getId_vendas_pagamentos() {
        return id_vendas_pagamentos;
    }

    public void setId_vendas_pagamentos(int id_vendas_pagamentos) {
        this.id_vendas_pagamentos = id_vendas_pagamentos;
    }


}
