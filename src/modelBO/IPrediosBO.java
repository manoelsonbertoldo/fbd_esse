/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Predios;

/**
 *
 * @author manoelson
 */
public interface IPrediosBO {
     public  void salvar(Predios predios);
	public Predios buscarPorId(int id);
	public List<Predios> getALL();
	public  void editar(Predios predios);
	public  void ativarDesativar(int id);
}
