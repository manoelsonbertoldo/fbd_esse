/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Enderecos;

/**
 *
 * @author manoelson
 */
public interface IEnderecosBO {
    public  void salvar(Enderecos enderecos);
	public Enderecos buscarPorId(int id);
	public List<Enderecos> getALL();
	public  void editar(Enderecos enderecos);
	public  void ativarDesativar(int id); 
}
