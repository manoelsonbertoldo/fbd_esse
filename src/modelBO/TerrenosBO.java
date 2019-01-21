/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.ITerrenosDAO;
import modelDAO.TerrenosDAO;
import modelVO.Terrenos;

/**
 *
 * @author manoelson
 */
public class TerrenosBO implements ITerrenosBO{
ITerrenosDAO terrenosDAO;
    public TerrenosBO() {
        this.terrenosDAO=new TerrenosDAO();
    }

    @Override
    public void salvar(Terrenos terrenos) {
        this.terrenosDAO.salvar(terrenos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Terrenos buscarPorId(int id) {
      return  this.terrenosDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Terrenos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Terrenos terrenos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
