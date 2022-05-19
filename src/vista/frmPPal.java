/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Datos.Daos;
import javax.swing.*;

/**
 *
 * @author rraff
 */
public class frmPPal extends JFrame{
    //daos
    Daos datos = new Daos();

    //setDatos
    public void setDatos(Daos Dato) {
        datos = Dato;
    }
    public frmPPal(){
    //propiedades
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Menu Principal");
    }
}
