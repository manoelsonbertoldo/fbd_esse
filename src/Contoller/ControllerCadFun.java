/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadFun;
import view.TelaCadastro;

/**
 *
 * @author manoelson
 */
public class ControllerCadFun implements ActionListener{
private TelaCadastro telaCadastro;
private CadFun cadFun;

    public ControllerCadFun(CadFun cadFun) {
        this.cadFun = cadFun;
         cadFun.setResizable(false);
        cadFun.setLocationRelativeTo(null);
        this.cadFun.getVoltarButton().addActionListener(this);
        this.cadFun.getSalvarButton().addActionListener(this);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cadFun.getVoltarButton()){
            telaCadastro.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            cadFun.setVisible(false);
    }
        if(e.getSource()==cadFun.getSalvarButton()){
            JOptionPane.showMessageDialog(null, "salvado com sucesso");//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    
}
