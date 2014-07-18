/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_español;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrador
 */
public class lexico 
{
    
String concatenar_id="";
ArrayList<String> separar = new ArrayList<String>();
ArrayList<String> quitar_separador = new ArrayList<String>();
ArrayList<String> tokens = new ArrayList<String>();

ArrayList<Integer> contador = new ArrayList<Integer>();

ArrayList<Integer> linea_simbolo = new ArrayList<Integer>();
ArrayList<String> tabla_simbolos = new ArrayList<String>();
ArrayList<String> tipo = new ArrayList<String>();
ArrayList<Integer> identificador = new ArrayList<Integer>();

ArrayList<String> tabla_errores = new ArrayList<String>();
ArrayList<Integer> linea_error = new ArrayList<Integer>();

   
String[] palabras_reservadas={ "Inicio",
                               "clase",
                               "publica",
                               "privada",
                               "principal",
                               "Variable",
                               "Fin.",
                               "Entero",
                               "Cadena",
                               "Decimal",
                               "Condicion",
                               "De_lo_contrario",
                               "Ciclo",
                               "LeeEntero",
                               "Escribir",
                               "Imprimir",
                               "funcion",
                               "vacia",
                               "LeeDecimal",
                               "LeeCadena"};

int[] id_pal_res={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

String[] operadores={"+",
                     "=",
                     "-",
                     "*",
                     "/"};

int[] id_operadores={31,
                     32,
                     33,
                     34,
                     35};

String[] delimitadores={";",
                        ":",
                        "'",
                        "(",
                        ")",
                        ",",
                        ".",
                        "{",
                        "}",
                        "<",
                        ">",
                        "&"};

int[] id_delimitadores={51,
                        52,
                        53,
                        54,
                        55,
                        56,
                        57,
                        58,
                        59,
                        38,
                        37,
                        44};

sintactico sin=new sintactico();
public void tokens(String codigo) throws FileNotFoundException {
    boolean cadena=false;
    
    
 
 System.out.println("------------------------------------------JAVA EN ESPAÑOL------------------------------------------");
 System.out.println("");
 System.out.println("******************************************ANALISIS LEXICO******************************************");
 System.out.println("");
 System.out.println("******************************************LEYENDO ARCHIVO******************************************");
 System.out.println(codigo);
 StringTokenizer st = new StringTokenizer(codigo,"':,=;()+ {}<>",true);
 //StringTokenizer linea = new StringTokenizer(codigo,"^",true);
 System.out.println("******************************************Tokens******************************************");
       
        while (st.hasMoreTokens())
        {
        separar.add(st.nextToken());
        }//fin de while
        
       for(int i = 0;i<separar.size();i++)
       {
         if(!" ".equals(separar.get(i))){
             tokens.add(separar.get(i));
         }
       }//fin de for
       for(int i = 0;i<tokens.size();i++)
       {
            System.out.print("["+tokens.get(i)+"]");
       }//fin de for
       
       int cont=1;
       for(int i = 0;i<tokens.size();i++)
       {
         if(!"?".equals(tokens.get(i))){
             quitar_separador.add(tokens.get(i));
             contador.add(cont);
             
        }//if
         else{
             cont++;
         }//else
       }//fin de for
       
       System.out.print("///////TGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
       for(int i = 0;i<quitar_separador.size();i++)
       {
        System.out.print("["+quitar_separador.get(i)+"]");
       }//fin de for
       System.out.println("\n");
       
      
       
       
       //////////////////////////////////////////////////////////////
       int bandera=0;
       long Linea = 1;
       String guardar="";
       for(int i = 0;i<quitar_separador.size();i++)
       {  
           if(cadena){
               
                  
                  if(quitar_separador.get(i).equals("'")){
                      cadena=false;
                     // guardar+=" '";
                      
                      tabla_simbolos.add(guardar);
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Cadena");
                  identificador.add(100);
                  guardar="";
                      
                  tabla_simbolos.add("'");
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Delimitador");
                  identificador.add(53);
                  }
                  else{
                  guardar=guardar+" "+quitar_separador.get(i);
                  }
                  
                  
           }
           else{
           bandera=0;
           for(int a = 0;a<palabras_reservadas.length;a++)
           {   
              if(quitar_separador.get(i).equals(palabras_reservadas[a])){
                  
//                  System.out.printf( "%-20s%-15s %n", quitar_separador.get(i), "Palabra Reservada       Linea: "+contador.get(i));
                  //System.out.println(tokens.get(i)+"                    Palabra Reservada");
                  tabla_simbolos.add(quitar_separador.get(i));
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Palabra_reservada");
                  identificador.add(id_pal_res[a]);
                  
                  bandera=1;  
                  
              }//fin de if
           }//fin de for
           
           for(int b= 0;b<operadores.length;b++)
           { 
              if(quitar_separador.get(i).equals(operadores[b])){
//                  System.out.printf("%-20s%-15s %n",quitar_separador.get(i),"Operador        Linea: "+contador.get(i));
                  //System.out.println(tokens.get(i)+"                    Operador");
                  tabla_simbolos.add(quitar_separador.get(i));
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Operador");
                  identificador.add(id_operadores[b]);
                  bandera=1;      
              }//fin de if
           }//fin de for
           for(int c = 0;c<delimitadores.length;c++)
           { 
              if(quitar_separador.get(i).equals(delimitadores[c])){
                  if(quitar_separador.get(i).equals("'")){
                      cadena=true;
                      guardar+="";
                      tabla_simbolos.add(quitar_separador.get(i));
                        linea_simbolo.add(contador.get(i));
                      tipo.add("Delimitador");
                      identificador.add(id_delimitadores[c]);
                  }else{
                  tabla_simbolos.add(quitar_separador.get(i));
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Delimitador");
                  identificador.add(id_delimitadores[c]);
                   
                  }
                  bandera=1;
              }//fin de if
           }//fin de for
           
           
           
           
           if(bandera==0){
             //  System.out.printf("%-20s%-15s %n",tokens.get(i),"Variable");
               Pattern pat = Pattern.compile("^[A-Za-z-_]+");
               Matcher mat = pat.matcher(quitar_separador.get(i));
               if (mat.find())
               {
//                System.out.printf("%-20s%-15s %n",quitar_separador.get(i),"Variable        Linea: "+contador.get(i));
                tabla_simbolos.add(quitar_separador.get(i));
                  linea_simbolo.add(contador.get(i));
                  tipo.add("Id");
                identificador.add(80);
               }else{
                   
                    Pattern pat_1 = Pattern.compile("^[0-9]+$");//Decimal\\d*\\.\\d{2}
                   Matcher mat_1 = pat_1.matcher(quitar_separador.get(i));
                    if (mat_1.find())
                    {
//                      System.out.printf("%-20s%-15s %n",quitar_separador.get(i),"Numero       Linea: "+contador.get(i));
                      tabla_simbolos.add(quitar_separador.get(i));
                      linea_simbolo.add(contador.get(i));
                      tipo.add("Numero");
                      identificador.add(90);
                    }else{
                         Pattern pat_2 = Pattern.compile("\\d*\\.\\d{1,4}");//Decimal\\d*\\.\\d{2}
                        Matcher mat_2 = pat_2.matcher(quitar_separador.get(i));
                         if (mat_2.find())
                         {
     //                      System.out.printf("%-20s%-15s %n",quitar_separador.get(i),"Numero       Linea: "+contador.get(i));
                           tabla_simbolos.add(quitar_separador.get(i));
                           linea_simbolo.add(contador.get(i));
                           tipo.add("Decimal");
                           identificador.add(110);
                         }else{
     //                      System.out.printf("%-20s%-15s %n",quitar_separador.get(i),"No se RECONOCE       Linea: "+contador.get(i));
                           tabla_errores.add(quitar_separador.get(i));
                                 linea_error.add(contador.get(i));
                         }//fin 2do_else
                    }//fin 2do_else
                   
                   
                   
                   
                   
                   
                  
                    }//fin 1er_else
         
           }//fin de if
           }
       }//fin de for
       
       System.out.printf("%-20s%-10s%-30s%-10s %n","Tokens","Linea","Tipo","Id");
       int aux;
      for(int i = 0;i<tabla_simbolos.size();i++)       
      {
          String id = Integer.toString(identificador.get(i));
          
          System.out.printf("%-20s%-10s%-30s%-10s %n",tabla_simbolos.get(i),linea_simbolo.get(i),tipo.get(i),identificador.get(i));
          
          if(linea_simbolo.get(i)!=1){
              aux=linea_simbolo.get(i)-linea_simbolo.get(i-1);
              
              for (int j = 0; j < aux; j++) {
                  concatenar_id+=" \r\n";
              }
          
          }//if
              concatenar_id+=id+" ";
         
          
          
                  
       }//fin de for
      System.out.println("\n\n\n");
      
      
      
      if(tabla_errores.size()>0){
          System.out.println("Tiene al menos un error \n\n");
          System.out.printf("%-20s%-10s %n","error(es)","Linea");
          for(int i = 0;i<tabla_errores.size();i++)
            {
             //System.out.println(tabla_errores.get(i)+"  "+linea_error.get(i));
                System.out.printf("%-20s%-10s %n",tabla_errores.get(i),linea_error.get(i));
            }//fin de for
      }
      else{
      System.out.println("ANALISIS LEXICO CORRECTO!!!!");
      Escribir(concatenar_id);
      //sintactico();
      sin.hhh();
      }
       
}//fin tokens

  public void Escribir(String Cadena){
        //Un texto cualquiera guardado en una variable
      File f;
      FileWriter EscribirArchivo;
      
        
         try{
             f=new File("texto.txt");
             EscribirArchivo =new FileWriter(f);
             BufferedWriter bw= new BufferedWriter(EscribirArchivo);
             PrintWriter salida = new PrintWriter(bw);
             
             salida.write(Cadena);
             salida.close();
             bw.close();
         
         }//try
         //Si existe un problema al escribir cae aqui
         catch(Exception e){
         System.out.println("Error al escribir");
         }//catch
 
}//Escribir

//////////  public void Escribir(String Cadena){
//////////        //Un texto cualquiera guardado en una variable
//////////      
//////////        String saludo="";
//////////        saludo=Cadena;
//////////         try{
//////////         //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
//////////         File archivo=new File("texto.txt");
//////////         //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
//////////         FileWriter escribir=new FileWriter(archivo,true);
//////////         //Escribimos en el archivo con el metodo write 
//////////         escribir.write(saludo);
//////////         //Cerramos la conexion
//////////         escribir.close();
//////////         }//try
//////////         //Si existe un problema al escribir cae aqui
//////////         catch(Exception e){
//////////         System.out.println("Error al escribir");
//////////         }//catch
////////// 
//////////}//
  public void sintactico(){
       sintactico s=new sintactico();
   try{
            String codigo="";
            // Abrimos el archivo                          C:\Users\Antonio\Documents\NetBeansProjects\java_español
            FileInputStream fstream = new FileInputStream("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\java_español//texto.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            long lNumeroLineas = 0;
            while ((strLinea = buffer.readLine()) != null)   
            {
                codigo+=strLinea+" ";
                lNumeroLineas++;
            }
           // s.codigo(codigo);
            entrada.close();// Cerramos el archivo
        }catch (Exception e)
        { 
         System.err.println("Ocurrio un error: " + e.getMessage());
        }
  }
}//Fin de class lexico
