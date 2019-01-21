/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.CasasDAO;
import modelDAO.ICasasDAO;
import modelVO.Casas;

/**
 *
 * @author manoelson
 */
public class CasasBO implements ICasasBO{
ICasasDAO casasDAO;
    public CasasBO() {
        this.casasDAO=new CasasDAO();
    }

    @Override
    public void salvar(Casas Casas) {
        this.casasDAO.salvar(Casas); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casas buscarPorId(int id) {
        return this.casasDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Casas> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Casas casas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
