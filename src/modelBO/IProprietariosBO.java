/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Proprietarios;

/**
 *
 * @author manoelson
 */
public interface IProprietariosBO {
    public  void salvar(Proprietarios proprietarios);
	public Proprietarios buscarPorId(int id);
	public List<Proprietarios> getALL();
	public  void editar(Proprietarios proprietarios);
	public  void ativarDesativar(int id); 

}
