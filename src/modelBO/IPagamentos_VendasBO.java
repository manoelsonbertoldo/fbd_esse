/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Pagamentos_Vendas;

/**
 *
 * @author manoelson
 */
public interface IPagamentos_VendasBO {
    public  void salvar(Pagamentos_Vendas pagamentos_Vendas);
	public Pagamentos_Vendas buscarPorId(int id);
	public List<Pagamentos_Vendas> getALL();
	public  void editar(Pagamentos_Vendas pagamentos_Vendas);
	public  void ativarDesativar(int id); 
}
