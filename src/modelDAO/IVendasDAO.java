/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Vendas;

/**
 *
 * @author manoelson
 */
public interface IVendasDAO {
    public  int salvar(Vendas vendas);
	public Vendas buscarPorId(int id);
	public List<Vendas> getALL();
	public  void editar(Vendas vendas);
	public  void ativarDesativar(int id); 
}
