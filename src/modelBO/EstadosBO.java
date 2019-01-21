/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.EstadosDAO;
import modelDAO.IEstadosDAO;
import modelVO.Estados;

/**
 *
 * @author manoelson
 */
public class EstadosBO implements IEstadosBO{
IEstadosDAO estadosDAO;
    public EstadosBO() {
        this.estadosDAO= new EstadosDAO();
    }

    @Override
    public void salvar(Estados estados) {
        this.estadosDAO.salvar(estados); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estados buscarPorId(int id) {
        return this.estadosDAO.buscarPorId(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estados> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Estados Estados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
