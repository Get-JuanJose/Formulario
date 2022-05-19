package proyectoescritorio6am;

import Datos.Daos;
import java.util.Scanner;
import vista.frmLogin;
import vista.frmUsuario;
import javax.swing.*;

public class ProyectoEscritorio6am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el objeto de la clase DAOS
        /*Daos datos = new Daos();
        frmLogin open = new frmLogin();
        open.setVisible(true);
        open.setDatos(datos);
        Scanner objleer= new Scanner(System.in);
        //String usuario=objleer.next();
        //String password=objleer.next();
        boolean resp=datos.validarUsuario("rafito", "123");
        System.out.println(resp);*/
        
        frmUsuario nuew=new frmUsuario();
        nuew.setVisible(true);
        
    }
}
