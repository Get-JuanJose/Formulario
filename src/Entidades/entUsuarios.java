/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author rraff
 */
public class entUsuarios {
    /*variables de entorno o del sistema objetos 
    que me permitiran manipular los datos en el 
    sistema o las clases
    */
    public String Usuario;
    public String Password;
    public String DNI;
    public String Nombre;
    public String Genero;
    public Date FecNac;
    public String Celular;
    public String Email;
    //constructor
    public entUsuarios() {
    }
    //constructor para organizar las variables o datos

    public entUsuarios(String Usuario, String Password, String DNI, String Nombre, String Genero, Date FecNac, String Celular, String Email) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.FecNac = FecNac;
        this.Celular = Celular;
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getFecNac() {
        return FecNac;
    }

    public void setFecNac(Date FecNac) {
        this.FecNac = FecNac;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return Usuario 
                + "|" + Password 
                + "|" + DNI 
                + "|" + Nombre 
                + "|" + Genero 
                + "|" + FecNac 
                + "|" + Celular 
                + "|" + Email + '|';
    }
    
}
