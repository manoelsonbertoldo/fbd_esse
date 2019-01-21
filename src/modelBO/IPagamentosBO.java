/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Pagamentos;

/**
 *
 * @author manoelson
 */
public interface IPagamentosBO {
    public  void salvar(Pagamentos pagamentos);
	public Pagamentos buscarPorId(int id);
	public List<Pagamentos> getALL();
	public  void editar(Pagamentos pagamentos);
	public  void ativarDesativar(int id); 

}
