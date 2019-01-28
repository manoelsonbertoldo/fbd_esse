/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaLogin;
import view.TelaPrincipal;

/**
 *
 * @author manoelson
 */
public class ControllerLogin implements ActionListener{
    private TelaLogin telaLogin;
    private TelaPrincipal telaPrincipal;
    private ControllerPrincipal controllerPrincipal;

    public ControllerLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
        telaLogin.setVisible(true);
        telaLogin.setResizable(false);
        telaLogin.setLocationRelativeTo(null);
        this.telaPrincipal=new TelaPrincipal();
        this.controllerPrincipal=new ControllerPrincipal(telaPrincipal);
        
        this.telaLogin.getEntrarButon().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==telaLogin.getEntrarButon()){
            telaPrincipal.setVisible(true);
            telaLogin.setVisible(false);
        
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
