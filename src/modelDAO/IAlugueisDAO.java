/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.List;
import modelVO.Alugueis;

/**
 *
 * @author manoelson
 */
public interface IAlugueisDAO {
    public  int salvar(Alugueis alugueis);
        public Alugueis  buscarPorId(int id);
	public List<Alugueis > getALL();
	public  void editar(Alugueis alugueis);
	public  void ativarDesativar(int id); 
}
