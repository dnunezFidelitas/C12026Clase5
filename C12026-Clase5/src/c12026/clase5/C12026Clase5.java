/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c12026.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C12026Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        double caso1, caso2;
        caso1=pitagoras(2, 3);
        caso2=pitagoras(5, 3);
        JOptionPane.showMessageDialog(null, caso1);
        JOptionPane.showMessageDialog(null, caso2);
        saludaAtodos();
        */
        Zapato zapato1= new Zapato(); // crear una instancia
        zapato1.marca="adidas";
        zapato1.talla=38;
        zapato1.cantidadPasos();
        
        Zapato zapato2 = new Zapato();
        
        zapato1.marca="nike";
        zapato1.talla=44;
        zapato1.cantidadPasos();
        
    }
    
    /**
     * Es una funcion que realiza el calculo de pitagoras
     * @param altura
     * @param base
     * @return el valor correspondiente (base * altura )/2
     */
    public static double pitagoras(double altura , double base){
        double resultado=0;
        resultado=(altura*2*base)/2;
        return resultado;
    }
    /**
     * Este es un metodo de mentiritas
     */
    public static void saludaAtodos(){
        JOptionPane.showMessageDialog(null, "HOLLAAAA A TODOS Y TODAS");
    }
    
}
