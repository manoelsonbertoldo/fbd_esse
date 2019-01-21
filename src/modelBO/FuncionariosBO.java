/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.FuncionariosDAO;
import modelDAO.IFuncionariosDAO;
import modelVO.Funcionarios;

/**
 *
 * @author manoelson
 */
public class FuncionariosBO implements IFuncionariosBO{
IFuncionariosDAO funcionariosDAO;
    public FuncionariosBO() {
        this.funcionariosDAO=new FuncionariosDAO();
    }

    @Override
    public void salvar(Funcionarios Funcionarios) {
        this.funcionariosDAO.salvar(Funcionarios); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionarios buscarPorId(int id) {
        return this.funcionariosDAO.buscarPorId(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionarios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Funcionarios Funcionarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
