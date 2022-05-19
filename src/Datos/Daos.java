/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidades.entUsuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author rraff
 */
public class Daos {
    //Data Access object  system 

    //constructor
    public Daos() {
        abrirArchivo();
        System.out.println(contUsuarios);
        System.out.println(Arrays.toString(vectorUsuario));
    }
    //arreglo para cargar datos del archivo
    int tamaño = 30;//tamaño
    entUsuarios[] vectorUsuario = new entUsuarios[tamaño];
    //arreglo tipo entidad
    int contUsuarios = 0;

    private void abrirArchivo()  {
        /**
         * objeto tipo Archivo.
         */
        File archivo = null;
        /**
         * Objeto para leer archivo
         */
        FileReader fr = null;
        /**
         * Objeto para leer linea por linea el archivo
         */
        BufferedReader br = null;
        /**
         * control de errores y manipulación de datos
         */
        try {
            //asignar el archivo
            archivo = new File("Usuarios.txt");
            //entrego el archivo al FileReader
            fr = new FileReader(archivo);
            //cargamos el buffer de lectura
            br = new BufferedReader(fr);
            /**
             * declaramos las variables para manipular los datos dentro del
             * archivo en la memoria
             */
            int pos;
            String aux;
            String linea;
            //la variables de la entidad
            String Usuario;
            String Password;
            String DNI;
            String Nombre;
            String Genero;
            Date FecNac;
            String Celular;
            String Email;

            //objeto fecha
            SimpleDateFormat formato = new 
        SimpleDateFormat("yyyy/mm/dd");
            /**
             * defino el ciclo para leer las lineas dentro del archivo, se lee
             * variable por variable.
             */
            while ((linea = br.readLine()) != null) {
                //punto de control
                System.out.println(linea);
                //usuario
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                Usuario = aux;
                linea = linea.substring(pos + 1);
                //password
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                Password = aux;
                linea = linea.substring(pos + 1);
                //DNI
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                DNI = aux;
                linea = linea.substring(pos + 1);
                //Nombre
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                Nombre = aux;
                linea = linea.substring(pos + 1);
                //Genero
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                Genero = aux;
                linea = linea.substring(pos + 1);
                //FecNac
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                FecNac = formato.parse(aux);
                linea = linea.substring(pos + 1);
                //usuario
                pos = linea.indexOf('|');
                aux = linea.substring(0, pos);
                Celular = aux;
                linea = linea.substring(pos + 1);
                //usuario
                pos = linea.indexOf('|');
                System.out.println(pos);
                aux = linea.substring(0, pos);
                Email = aux;
                //creamos el objeto con los datos del archivo
                entUsuarios llenarVector = new entUsuarios(Usuario,
                        Password, DNI, Nombre,
                        Genero, FecNac, Celular, Email);
                //llenamos el vectorUsuarios
                vectorUsuario[contUsuarios]=llenarVector;
                contUsuarios=contUsuarios+1;
                //point control
                System.out.println(llenarVector);
            }//fin while
        } catch (IOException|ParseException e) {
            System.out.println("Error, "+e);
        } finally {
            if(fr!=null){
            try {
                fr.close();
            } catch (IOException e) {
            }//fin try/catch
            }//fin if

        }//fin try/catch/finally
    }//fin abrirArchivo
    
    public boolean validarUsuario(String usuario,
            String password)
    {for (int i = 0; i < contUsuarios; i++) {       
        if(usuario.equals(vectorUsuario[i].getUsuario()) 
                && password.equals(vectorUsuario[i].getPassword()))
        {
            return true;
        }else
        {
            return false;
        }//fin if/else
    }//fin for
      return false;  
    }//fin validarUsuario
}
