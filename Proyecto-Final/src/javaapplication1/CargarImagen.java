/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HACKEER
 */
public class CargarImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
       Imagencita i=new Imagencita();
        i.getTitulo();
        i.setDescripcion(null);
        i.getUrl();
        
        GuardarImagen p=new GuardarImagen();
        p.GuardarImagen(i);
    }
    
}
