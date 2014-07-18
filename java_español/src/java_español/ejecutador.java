

package java_español;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ejecutador {
    
    ArrayList<String> separar = new ArrayList<String>();
    ArrayList<String> tokens = new ArrayList<String>();
    ArrayList<String> quitar_separador = new ArrayList<String>();
    ArrayList<String> Exe = new ArrayList<String>();
    ArrayList<Integer> contador = new ArrayList<Integer>();
    
    public void leer(){
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
            while ((strLinea = buffer.readLine()) != null){
                codigo+=strLinea+" "+"?"+" ";
            }//fin de while
            
            separar(codigo);
            
            entrada.close();// Cerramos el archivo
        }catch (Exception e)
        { 
         System.err.println("Ocurrio un error: " + e.getMessage());
        }//fin catch
    }//fin de leer
    
    
    public void separar(String codigo){
            boolean cadena=false;
    
    
 
 System.out.println("------------------------------------------EXE------------------------------------------");
 System.out.println(codigo);
 StringTokenizer st = new StringTokenizer(codigo,"':,=;()+ {}",true);
       
        while (st.hasMoreTokens()){
            separar.add(st.nextToken());
        }//fin de while
        
       for(int i = 0;i<separar.size();i++){
         if(!" ".equals(separar.get(i))){
             tokens.add(separar.get(i));
         }//if
       }//fin de for
       
       int cont=1;
       for(int i = 0;i<tokens.size();i++){
         if(!"?".equals(tokens.get(i))){
             quitar_separador.add(tokens.get(i));
             contador.add(cont);
             
        }//if
         else{
             cont++;
         }//else
       }//fin de for
       System.out.print("[Arreglo Quitar Separador]");
       for(int i = 0;i<quitar_separador.size();i++){
        System.out.print("["+quitar_separador.get(i)+"]");
       }//fin de for
       System.out.println("\n");
       
       for(int i = 0;i<quitar_separador.size();i++){
         if(!quitar_separador.get(i).equalsIgnoreCase("Inicio")&&!quitar_separador.get(i).equalsIgnoreCase(":")&&!quitar_separador.get(i).equalsIgnoreCase("Fin.")){
             Exe.add(quitar_separador.get(i));
        }//if
       }//fin de for
       System.out.print("Arreglo EXE");
       for(int i = 0;i<Exe.size();i++){
        System.out.print("["+Exe.get(i)+"]");
       }//fin de for
       System.out.println("\n");
      
       EXE();
       
    }//fin de separar
    
    public void EXE (){
        String codigo="";
        
        codigo=codigo+"package java_español; \n";
        for(int i = 0;i<Exe.size();i++){
            if(Exe.get(i).equals("clase")&&Exe.get(i+1).equals("publica")){
              codigo=codigo+"public class "+Exe.get(i+2)+Exe.get(i+3)+"\n";  
            }//fin de if
            else{
                if(Exe.get(i).equals("funcion")&&Exe.get(i+1).equals("publica")&&Exe.get(i+2).equals("vacia")&&Exe.get(i+3).equals("principal")){
                    codigo=codigo+"public static void main(String[] args) { \n";
                }//fin de else if
                else{
                    if(Exe.get(i).equals("}")){
                        codigo=codigo+"} \n";
                    }
                    else{
                        if(Exe.get(i).equals("Variable")&&Exe.get(i+1).equals("Entero")){
                            codigo=codigo+"int "+Exe.get(i+2)+";\n";
                        }
                        else{
                            if(Exe.get(i).equals("Variable")&&Exe.get(i+1).equals("Decimal")){
                                codigo=codigo+"double "+Exe.get(i+2)+";\n";
                            }
                            else{
                                if(Exe.get(i).equals("Variable")&&Exe.get(i+1).equals("Cadena")){
                                    codigo=codigo+"String "+Exe.get(i+2)+";\n";
                                }
                            }//fin de else
                        }//fin de else
                    }//fin de else
                }//fin de else
            }//fin de else 
                
            
            
        }//fin de for 
        
        System.out.println(codigo);
    
    }//fin EXE
    
    
    
}//fin ejecutador
