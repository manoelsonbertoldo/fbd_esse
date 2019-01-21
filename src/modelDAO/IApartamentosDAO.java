/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Apartamentos;

/**
 *
 * @author manoelson
 */
public interface IApartamentosDAO {
    public  int salvar(Apartamentos apartamentos);
	public Apartamentos  buscarPorId(int id);
	public List<Apartamentos > getALL();
	public  void editar(Apartamentos apartamentos);
	public  void ativarDesativar(int id);
    
    
}
