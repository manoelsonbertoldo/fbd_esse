/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.EnderecosDAO;

import modelDAO.IEnderecosDAO;
import modelVO.Enderecos;

/**
 *
 * @author manoelson
 */
public class EnderecosBO implements IEnderecosBO{
IEnderecosDAO enderecosDAO;
    public EnderecosBO() {
        this.enderecosDAO=new EnderecosDAO();
    }

    @Override
    public void salvar(Enderecos enderecos) {
        this.enderecosDAO.salvar(enderecos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enderecos buscarPorId(int id) {
       return this.enderecosDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Enderecos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Enderecos enderecos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
