/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBO;

import java.util.List;
import modelDAO.IMunicipiosDAO;
import modelDAO.MunicipiosDAO;
import modelVO.Municipios;

/**
 *
 * @author manoelson
 */
public class MunicipiosBO implements IMunicipiosBO{
IMunicipiosDAO municipiosDAO;
    public MunicipiosBO() {
        this.municipiosDAO=new MunicipiosDAO();
    }

    @Override
    public void salvar(Municipios municipios) {
         this.municipiosDAO.salvar(municipios); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Municipios buscarPorId(int id) {
        return  this.municipiosDAO.buscarPorId(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Municipios> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Municipios municipios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ativarDesativar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
