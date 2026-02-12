/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c12026.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Zapato {
    // Atributos
    public String marca;
    private double precioProduccion;
    public int talla;
    public String tipo;
    private double lugarCreacion;
    public boolean vendido;
    
    //metodo
    public void cantidadPasos(){
        if (talla>40){
            JOptionPane.showMessageDialog(null, "20 mil kilometros");
        }else
            JOptionPane.showMessageDialog(null, "18 mil kilometros");
    }
    
    
    
}
