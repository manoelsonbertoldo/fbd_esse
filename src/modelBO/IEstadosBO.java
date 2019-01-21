/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Estados;

/**
 *
 * @author manoelson
 */
public interface IEstadosBO {
    public  void salvar(Estados estados);
	public Estados buscarPorId(int id);
	public List<Estados> getALL();
	public  void editar(Estados Estados);
	public  void ativarDesativar(int id);  
}
