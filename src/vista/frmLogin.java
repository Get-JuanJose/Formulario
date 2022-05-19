/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Datos.Daos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rraff
 */
public class frmLogin extends JFrame {
    
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JLabel lblLogo;
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JButton btnAceptar;
    private JPanel jPanel;

    //daos
    Daos datos = new Daos();

    //setDatos
    public void setDatos(Daos Dato) {
        datos = Dato;
    }

    public frmLogin() {
        //propiedades
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        //inicializar los objetos de la ventana
        lblUsuario = new JLabel("User");
        lblClave = new JLabel("Password");
        lblLogo = new JLabel();
        txtUsuario = new JTextField();
        txtClave = new JPasswordField();
        btnAceptar = new JButton("Aceptar");
        //propiedades del panel
        jPanel = new JPanel();
        jPanel.setBackground(new java.awt.Color(5, 242, 246));
        jPanel.setBounds(50, 50, 480, 350);
        jPanel.setLayout(null);
        //propiedades de los label
        lblUsuario.setForeground(Color.DARK_GRAY);
        lblUsuario.setFont(new java.awt.Font("Arial", 3, 24));
        lblClave.setForeground(Color.DARK_GRAY);
        lblClave.setFont(new java.awt.Font("Arial", 3, 24));
        //propiedades de los txt
        txtUsuario.setForeground(Color.GREEN);
        txtUsuario.setBackground(Color.gray);
        txtUsuario.setFont(new java.awt.Font("Arial", 3, 24));
        txtClave.setForeground(Color.GREEN);
        txtClave.setBackground(Color.gray);
        txtClave.setFont(new java.awt.Font("Arial", 3, 24));
//jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1, true));
        getContentPane().add(jPanel);
        //adicionar los objetos al panel
        jPanel.add(lblUsuario);
        jPanel.add(txtUsuario);
        jPanel.add(lblClave);
        jPanel.add(txtClave);
        jPanel.add(lblLogo);
        jPanel.add(btnAceptar);

        //ubicamos los objetos en la ventana
        lblUsuario.setBounds(175, 50, 150, 30);
        txtUsuario.setBounds(175, 90, 150, 30);
        lblClave.setBounds(175, 140, 150, 30);
        txtClave.setBounds(175, 180, 150, 30);
        btnAceptar.setBounds(200, 250, 100, 50);
//eventos de los botones
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarUsuarioActionPerformed(e);
            }
            
        });
        
    }//fin constructor
    
    private void validarUsuarioActionPerformed(ActionEvent e) {
        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtClave.getPassword());
        boolean resp = datos.validarUsuario(usuario, password);
        if(!resp){
            txtUsuario.setText("");
            txtClave.setText("");
            txtUsuario.requestFocusInWindow(); 
            JOptionPane.showMessageDialog(null,"Usuario o Password Erroneos");
        return;
        }else{
            JOptionPane.showMessageDialog(null,"Welcome");
            frmPPal openfrm=new frmPPal();
            this.setEnabled(false);
            this.setVisible(false);
            openfrm.setVisible(true);
            openfrm.setDatos(datos);
        }
        
                
    }
}//fin class
