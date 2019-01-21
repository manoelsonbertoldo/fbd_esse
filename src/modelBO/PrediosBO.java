/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IPrediosDAO;
import modelDAO.PrediosDAO;
import modelVO.Predios;

/**
 *
 * @author manoelson
 */
public class PrediosBO implements IPrediosBO{
IPrediosDAO prediosDAO;
    public PrediosBO() {
        this.prediosDAO=new PrediosDAO();
    }

    @Override
    public void salvar(Predios predios) {
       this.prediosDAO.salvar(predios); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Predios buscarPorId(int id) {
        return this.prediosDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Predios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Predios predios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
