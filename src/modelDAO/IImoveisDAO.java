/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Imoveis;

/**
 *
 * @author manoelson
 */
public interface IImoveisDAO {
    public  int salvar(Imoveis imoveis);
	public Imoveis buscarPorId(int id);
	public List<Imoveis> getALL();
	public  void editar(Imoveis Imoveis);
	public  void ativarDesativar(int id); 
}
