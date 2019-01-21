/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Terrenos;

/**
 *
 * @author manoelson
 */
public interface ITerrenosBO {
    public  void salvar(Terrenos terrenos);
	public Terrenos buscarPorId(int id);
	public List<Terrenos> getALL();
	public  void editar(Terrenos terrenos);
	public  void ativarDesativar(int id); 
}
