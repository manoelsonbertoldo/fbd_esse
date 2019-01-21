/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Casas;

/**
 *
 * @author manoelson
 */
public interface ICasasDAO {
    public  int salvar(Casas Casas);
        public Casas  buscarPorId(int id);
	public List<Casas > getALL();
	public  void editar(Casas casas);
	public  void ativarDesativar(int id);
}
