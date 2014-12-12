/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HACKEER
 */
public class GuardarImagen {
    public void GuardarImagen(Imagencita i) throws Exception{
        File f=new File("D:\\imagen.xxx");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(i);
    }
}
