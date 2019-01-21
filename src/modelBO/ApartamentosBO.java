/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.ApartamentosDAO;
import modelDAO.IApartamentosDAO;
import modelVO.Apartamentos;

/**
 *
 * @author manoelson
 */
public class ApartamentosBO implements IApartamentosBO{
IApartamentosDAO apartamentosDAO;
    public ApartamentosBO() {
        this.apartamentosDAO= new ApartamentosDAO();
        
        
    }

    @Override
    public void salvar(Apartamentos apartamentos) {
       this.apartamentosDAO.salvar(apartamentos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apartamentos buscarPorId(int id) {
       return this.apartamentosDAO.buscarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Apartamentos> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Apartamentos apartamentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
