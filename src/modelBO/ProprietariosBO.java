/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IProprietariosDAO;
import modelDAO.ProprietariosDAO;
import modelVO.Proprietarios;

/**
 *
 * @author manoelson
 */
public class ProprietariosBO implements IProprietariosBO{
IProprietariosDAO proprietariosDAO;
    public ProprietariosBO() {
        this.proprietariosDAO=new  ProprietariosDAO();
   }

    @Override
    public void salvar(Proprietarios proprietarios) {
       this.proprietariosDAO.salvar(proprietarios);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proprietarios buscarPorId(int id) {
        return this.proprietariosDAO.buscarPorId(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proprietarios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Proprietarios proprietarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
