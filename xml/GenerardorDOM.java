/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acesodatos.tema2.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Windows
 */
public class GenerardorDOM {
     static Document docu;
    public static void GeneradorDOM(){
        try {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();    
        DocumentBuilder b =f.newDocumentBuilder();
        docu = b.newDocument();    
        } catch (Exception e) {
        }   
    }
    public static void generarXml() {
        try{
        TransformerFactory factoria = TransformerFactory.newInstance();
        Transformer transformer = factoria.newTransformer();
        Source source = new DOMSource(docu);
        File file = new File("C:\\Users\\Windows\\Desktop\\prueba33.xml");
        FileWriter fw = new FileWriter (file);
        PrintWriter pw = new PrintWriter (fw);
        Result r = new StreamResult (pw);
        transformer.transform(source, r);
        }catch(IOException|TransformerException e){
            
        }
    }
    public static void documentoXML(){
        Element persona = docu.createElement("persona");
        docu.appendChild(persona);
        persona.setAttribute("Profesion","Cantante");
        Element nombre = docu.createElement("nombre");
        nombre.appendChild(docu.createTextNode("Elsa"));
        Element genero = docu.createElement("mujer");
        Element nacimiento = docu.createElement("fecha_de_nacimiento");
        Element dia = docu.createElement("dia");
        Element mes = docu.createElement("mes");
        Element ano = docu.createElement("año");
        Element ciudad = docu.createElement("ciudad");

        dia.appendChild(docu.createTextNode("18"));
        mes.appendChild(docu.createTextNode("6"));
        ano.appendChild(docu.createTextNode("1996"));
        ciudad.appendChild(docu.createTextNode("Pamplona"));
        persona.appendChild(nombre);
        persona.appendChild(genero); 
        persona.appendChild(nacimiento);
        nacimiento.appendChild(dia);
        nacimiento.appendChild(mes);
        nacimiento.appendChild(ano);
        persona.appendChild(ciudad);
        
    }    
}
