/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acesodatos.tema2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class escribiryleer {
    public static void main(String[] args) {
        //ESCRIBIR EN EL FICHERO
    try {
            BufferedWriter f1= new BufferedWriter(new FileWriter("pruebaAD1.txt", true)) ;
            String t=null;
            Scanner atr = new Scanner (System.in);
            t= atr.nextLine();
            while(!t.equals(".")){
                f1.write(t);
                t= atr.nextLine();
                f1.flush();
                f1.newLine();
        }
        f1.close();
        } catch (Exception e) {
        }
    // LEER ARCHIVO 
        String texto="";
        FileReader in = null;
        try {
              in = new FileReader("pruebaAD1.txt");
              int a = in.read();
              while(a!=-1){
                  texto= texto + (char)a;
                  a= in.read();
              }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    
    }
}
