/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Enderecos;

/**
 *
 * @author manoelson
 */
public interface IEnderecosDAO {
    public  int salvar(Enderecos enderecos);
        public Enderecos  buscarPorId(int id);
	public List<Enderecos > getALL();
	public  void editar(Enderecos enderecos);
	public  void ativarDesativar(int id);
}
