/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscarCasas;
import view.BuscarFun;
import view.TelaCadastro;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControlleBusFuncionário implements  ActionListener{
  private BuscarFun buscarfun;
  private TelaPrincipal telaPrincipal;

    public ControlleBusFuncionário(BuscarFun buscarfun) {
        this.buscarfun = buscarfun;
        this.buscarfun.getVoltarButton().addActionListener(this);
       
        
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buscarfun.getVoltarButton()){
            buscarfun.setVisible(true);
            telaPrincipal.setVisible(false);//To change body of generated methods, choose Tools | Templates.
    }
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
