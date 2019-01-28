/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscarCasas;
import view.TelaCadastro;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControlleBusCasas implements  ActionListener{
  private BuscarCasas buscarCasas;
  private TelaPrincipal telaPrincipal;

    public ControlleBusCasas(BuscarCasas buscarCasas) {
        this.buscarCasas = buscarCasas;
        this.buscarCasas.getVoltarButton().addActionListener(this);
        this.buscarCasas.getConfirmarButton().addActionListener(this);
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscarCasas.getVoltarButton()){
            buscarCasas.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        if(e.getSource()==buscarCasas.getConfirmarButton()){
            buscarCasas.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
