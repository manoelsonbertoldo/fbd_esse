/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.ClientesDAO;
import modelDAO.IClientesDAO;
import modelVO.Clientes;

/**
 *
 * @author manoelson
 */
public class ClientesBO implements IClientesBO{
    IClientesDAO clientesDAO;
    public ClientesBO() {
        this.clientesDAO=new ClientesDAO();
    }

    @Override
    public void salvar(Clientes clientes) {
        this.clientesDAO.salvar(clientes); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clientes buscarPorId(int id) {
     return   this.clientesDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
