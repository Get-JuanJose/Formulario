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
import com.toedter.calendar.*;
import java.awt.Font;
import sun.util.calendar.JulianCalendar;

/**
 *
 * @author rraff
 */
public class frmUsuario extends JFrame {

    private JLabel lblUsuario;
    private JLabel lblClave;
    private JLabel lblDNI;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblCelular;
    private JLabel lblEmail;
    private JLabel lblFecDis;
    private JLabel lblnomEspe;
    private JLabel lbltitulo; 
    
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JTextField txtDNI;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtCelular;
    private JTextField txtEmail;
    private JCalendar txtFecDis;
    private JTextField txtnomEspe;
    
    
    
    private JButton btnNuevo;
    private JButton btnGuardar;
    private JButton btnConsultar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnSalir;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel titulo;

    //daos
    Daos datos = new Daos();

    //setDatos
    public void setDatos(Daos Dato) {
        datos = Dato;
    }

    public frmUsuario() {
        //propiedades
        setSize(1100, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        //inicializar los objetos de la ventana
        lbltitulo=new JLabel("Citas Oftometría");
        lblUsuario = new JLabel("Usuario");
        lblClave = new JLabel("Contraseña");
        lblDNI = new JLabel("DNI");
        lblNombre = new JLabel("NOMBRE");
        lblGenero = new JLabel("GENERO");
        lblCelular = new JLabel("CELULAR");
        lblEmail = new JLabel("EMAIL");
        lblFecDis = new JLabel("FECHA DISPONIBILIDAD");
        lblnomEspe= new JLabel("ESPECIALISTA");
        
        txtUsuario = new JTextField();
        txtClave = new JPasswordField();
        txtDNI = new JTextField();
        txtNombre = new JTextField();
        txtGenero = new JTextField();
        txtCelular = new JTextField();
        txtEmail = new JTextField();
        txtFecDis = new JCalendar();
        txtnomEspe= new JTextField();
        
     
        btnNuevo = new JButton("Nuevo");
        btnGuardar = new JButton("Guardar");
        btnActualizar = new JButton("Actualizar");
        btnConsultar = new JButton("Consultar");
        btnBorrar = new JButton("Borrar");
        btnSalir = new JButton("Salir");

        //propiedades del panel
        titulo = new JPanel();
        titulo.setBackground(new java.awt.Color(4, 86, 128));
        titulo.setBounds(0, 0, 1100, 75);
        titulo.setLayout(null);
        jPanel1 = new JPanel();
        jPanel1.setBackground(new java.awt.Color(47, 47, 47));
        jPanel1.setBounds(20, 80, 380, 300);
        jPanel1.setLayout(null);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGERSO"));
        jPanel2 = new JPanel();
        jPanel2.setBackground(new java.awt.Color(47, 47, 47));
        jPanel2.setBounds(450, 80, 600, 600); //(x, y, ancho, largo)
        jPanel2.setLayout(null);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Quiero agendar una cita"));
        jPanel3 = new JPanel();
        jPanel3.setBackground(new java.awt.Color(47, 47, 47));
        jPanel3.setBounds(20, 440, 380, 150);
        jPanel3.setLayout(null);

        //propiedades de los label
        
        lbltitulo.setForeground(Color.BLACK);
        lbltitulo.setFont(new java.awt.Font("Agency FB", Font.BOLD, 32));
        
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblClave.setForeground(Color.WHITE);
        lblClave.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblDNI.setForeground(Color.WHITE);
        lblDNI.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblNombre.setForeground(Color.WHITE);
        lblNombre.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblGenero.setForeground(Color.WHITE);
        lblGenero.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblCelular.setForeground(Color.WHITE);
        lblCelular.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblFecDis.setForeground(Color.WHITE);
        lblFecDis.setFont(new java.awt.Font("Arial", 3, 24));
        
        lblnomEspe.setForeground(Color.WHITE);
        lblnomEspe.setFont(new java.awt.Font("Arial", 3, 24)); //fuente, tipo de fuente, tamaño
        
        

        //propiedades de los txt
        txtUsuario.setForeground(Color.WHITE);
        txtUsuario.setBackground(Color.gray);
        txtUsuario.setFont(new java.awt.Font("Arial", 1, 20));
        txtClave.setForeground(Color.WHITE);
        txtClave.setBackground(Color.gray);
        txtClave.setFont(new java.awt.Font("Arial", 1, 20));
        txtDNI.setForeground(Color.WHITE);
        txtDNI.setBackground(Color.gray);
        txtDNI.setFont(new java.awt.Font("Arial", 1, 20));
        txtNombre.setForeground(Color.WHITE);
        txtNombre.setBackground(Color.gray);
        txtNombre.setFont(new java.awt.Font("Arial", 1, 20));
        txtGenero.setForeground(Color.WHITE);
        txtGenero.setBackground(Color.gray);
        txtGenero.setFont(new java.awt.Font("Arial", 1, 20));
        txtCelular.setForeground(Color.WHITE);
        txtCelular.setBackground(Color.gray);
        txtCelular.setFont(new java.awt.Font("Arial", 1, 20));
        txtEmail.setForeground(Color.WHITE);
        txtEmail.setBackground(Color.gray);
        txtEmail.setFont(new java.awt.Font("Arial", 1, 20));
        txtFecDis.setForeground(Color.BLACK);
        txtFecDis.setBackground(Color.BLACK);
        txtFecDis.setFont(new java.awt.Font("Arial", 1, 14));
        txtnomEspe.setForeground(Color.WHITE);
        txtnomEspe.setBackground(Color.gray);
        txtnomEspe.setFont(new java.awt.Font("Arial", 1, 20));
        
        

//jPanel.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1, true));
        getContentPane().add(jPanel1);
        getContentPane().add(jPanel2);
        getContentPane().add(jPanel3);
        getContentPane().add(titulo);
        //adicionar los objetos al panel
        titulo.add(lbltitulo);
        jPanel1.add(lblUsuario);
        jPanel1.add(txtUsuario);
        jPanel1.add(lblClave);
        jPanel1.add(txtClave);
        jPanel2.add(lblDNI);
        jPanel2.add(txtDNI);
        jPanel2.add(lblNombre);
        jPanel2.add(txtNombre);
        jPanel2.add(lblGenero);
        jPanel2.add(txtGenero);
        jPanel2.add(lblCelular);
        jPanel2.add(txtCelular);
        jPanel2.add(lblEmail);
        jPanel2.add(txtEmail);
        jPanel2.add(lblFecDis);
        jPanel2.add(txtFecDis);
        jPanel2.add(lblnomEspe);
        jPanel2.add(txtnomEspe);
     
        
        jPanel3.add(btnNuevo);
        jPanel3.add(btnGuardar);
        jPanel3.add(btnConsultar);
        jPanel3.add(btnActualizar);
        jPanel3.add(btnBorrar);
        jPanel3.add(btnSalir);

        //ubicamos los objetos en la ventana panel1
        lbltitulo.setBounds(450,20, 200,25);
        lblUsuario.setBounds(50, 50, 150, 30);
        txtUsuario.setBounds(50, 90, 150, 30);
        lblClave.setBounds(50, 140, 150, 30);
        txtClave.setBounds(50, 180, 150, 30);
        //panel2
        lblDNI.setBounds(20, 60, 150, 30);
        txtDNI.setBounds(20, 110, 150, 30);
        
        lblNombre.setBounds(280, 60, 150, 30);
        txtNombre.setBounds(280, 110, 150, 30);
        
        lblGenero.setBounds(20, 180, 150, 30);
        txtGenero.setBounds(20, 230, 150, 30);
        
        lblCelular.setBounds(20, 280, 150, 30);
        txtCelular.setBounds(20, 320, 150, 30);
        
        lblEmail.setBounds(20, 380, 150, 30);
        txtEmail.setBounds(20, 420, 150, 30);
        
        lblFecDis.setBounds(280, 180, 300, 30);
        txtFecDis.setBounds(280, 230, 300, 250);
        
        lblnomEspe.setBounds(20, 480, 220, 30);
        txtnomEspe.setBounds(20, 520, 150, 30);
       
        
        //panel3
        btnNuevo.setBounds(20, 20, 100, 50);
        btnConsultar.setBounds(140, 20, 100, 50);
        btnSalir.setBounds(260, 20, 100, 50);
        btnGuardar.setBounds(20, 80, 100, 50);
        btnActualizar.setBounds(140, 80, 100, 50);
        btnBorrar.setBounds(260, 80, 100, 50);

//eventos de los botones
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSalirAction(e);
            }

            private void btnSalirAction(ActionEvent e) {
                System.exit(0);
            }
        });
    }//fin constructor

}//fin class
