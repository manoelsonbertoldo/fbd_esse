/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelVO.Funcionarios;

/**
 *
 * @author manoelson
 */
public interface IFuncionariosBO {
    public  void salvar(Funcionarios Funcionarios);
	public Funcionarios buscarPorId(int id);
	public List<Funcionarios> getALL();
	public  void editar(Funcionarios Funcionarios);
	public  void ativarDesativar(int id);  
}
