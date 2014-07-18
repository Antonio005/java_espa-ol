/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_español;
import java.io.*;
/**
 *
 * @author Administrador
 */

public class Java_español {
int a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    lexico l=new lexico();
    ejecutador exe=new ejecutador();
    
    try{
            String codigo="";
            // Abrimos el archivo                          C:\Users\Antonio\Documents\NetBeansProjects\java_español\src\java_español
            FileInputStream fstream = new FileInputStream("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\java_español\\src\\java_español//ejemplo.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            long lNumeroLineas = 0;
            while ((strLinea = buffer.readLine()) != null)   
            {
                // Imprimimos la línea por pantalla
                //System.out.println (strLinea);
                codigo+=strLinea+" "+"?"+" ";
                lNumeroLineas++;
            }
            //System.out.println("Cantidad de lineas: "+lNumeroLineas);
            //l.tokens(codigo);
            exe.leer();
           
            entrada.close();// Cerramos el archivo
        }catch (Exception e)
        { 
         System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }//fin main
}//fin class java_español

