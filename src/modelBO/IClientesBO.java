/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Clientes;

/**
 *
 * @author manoelson
 */
public interface IClientesBO {
    public  void salvar(Clientes clientes);
	public Clientes buscarPorId(int id);
	public List<Clientes> getALL();
	public  void editar(Clientes clientes);
	public  void ativarDesativar(int id); 
}
