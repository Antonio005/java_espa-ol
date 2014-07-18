
package java_español;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class sintactico {
    static estado q0,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26,q27,q28,q29,q30,q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,q41,q42,q43,q44,q45,q46,q47,q48,q49,q50,q51,q52,q53,q54,q55,q56,q57,q58,q59,q60,q61;

    
    public void hhh() throws FileNotFoundException{
                Scanner buffer;
        buffer=new Scanner(new FileReader("texto.txt"));
        q0= new estado();// estados del automata principal
        q1= new estado();
        q2= new estado();
        q3= new estado();
        q4= new estado();
        q5= new estado();
        q6= new estado();
        q7= new estado();
        q8= new estado();
        q9= new estado();
        q10= new estado();
        q11= new estado();
       q12= new estado();
       q13= new estado();
        q14= new estado();
        q15= new estado();
        q16= new estado();
        q17= new estado();
        q18= new estado();
        q19= new estado();
        q20= new estado();
        q21= new estado();
        q22= new estado();
        q23= new estado();
        q24= new estado();
        q25= new estado();
        q26= new estado();
         q27= new estado();
         q28= new estado();
        q29= new estado();
        q30= new estado();
        q31= new estado();
        q32= new estado();
        q33= new estado();
        q34= new estado();
        q35= new estado();
        q36= new estado();
        q37= new estado();
        q38= new estado();
        q39= new estado();
        q40= new estado();
        q41= new estado();
        q42= new estado();
        q43= new estado();
        q44= new estado();
        q45= new estado();
        q46= new estado();
        q47= new estado();
        q48= new estado();
        q49= new estado();
        q50= new estado();
        q51= new estado();
        q52= new estado();
        q53= new estado();
        q54= new estado();
        q55= new estado();
        q56= new estado();
        q57= new estado();
        q58= new estado();
        q59= new estado();
        q60= new estado();
        q61= new estado();
        
        id =new ArrayList<Integer>();
        cod = new ArrayList<String>();
        id.add(1);
        cod.add("inicio");
        id.add(2);
        cod.add("clase");
        id.add(3);
        cod.add("publica");
        id.add(4);
        cod.add("privada");
        id.add(5);
        cod.add("principal");
        id.add(6);
        cod.add("Variable");
        id.add(7);
        cod.add("Fin");
        id.add(8);
        cod.add("Entero");
        id.add(9);
        cod.add("Cadena");
        id.add(10);
        cod.add("Decimal");
        id.add(11);
        cod.add("Condicion");
        id.add(12);
        cod.add("De_lo_contrario");
        id.add(13);
        cod.add("Ciclo");
        id.add(14);
        cod.add("Leer");
        id.add(15);
        cod.add("Escribir");
        id.add(16);
        cod.add("Imprimir");
        id.add(17);
        cod.add("funcion");
        id.add(18);
        cod.add("vacia");
        id.add(19);
        cod.add("LeeDecimal");
        id.add(20);
        cod.add("LeeCadena");
        id.add(31);
        cod.add("+");
         id.add(32);
        cod.add("=");
        id.add(33);
        cod.add("-");
        id.add(34);
        cod.add("*");
        id.add(35);
        cod.add("/");
        id.add(51);
        cod.add(";");
        id.add(52);
        cod.add(":");
        id.add(53);
        cod.add("'");
        id.add(54);
        cod.add("(");
        id.add(55);
        cod.add(")");
        id.add(56);
        cod.add(",");
        id.add(57);
        cod.add(".");
        id.add(58);
        cod.add("{");
        id.add(59);
        cod.add("}");
        id.add(100);
        cod.add("cadena");
        id.add(80);
        cod.add("id");
        id.add(90);
        cod.add("numero");
        id.add(110);
        cod.add("Decimal");
        id.add(44);
        cod.add("&");
        
                
                                               
        
        
        q0.agregar(1,q18,"","");//inicio
        q18.agregar(52,q1,"","");// :
        q1.agregar(2,q11,"","");//clase
        q11.agregar(3, q2,"",""); //publica
        q11.agregar(4, q2,"",""); //privada
        
        q2.agregar(80, q3,"",""); // ID
        q3.agregar(58, q4,"clase",""); // {
        q4.agregar(17,q24,"",""); // funcion
        q24.agregar(3, q6, "", ""); // publica
            q6.agregar(18, q7,"",""); //vacia
            q6.agregar(8, q7,"",""); //entera
            q6.agregar(9, q7,"",""); //cadena
            q6.agregar(10, q7,"","");//decimal
            q7.agregar(70, q8,"",""); //"nombre"
            q7.agregar(5, q8, "", ""); // principal
            q8.agregar(54, q9,"",""); // (
                q9.agregar(8,q10,"",""); //entero
                q9.agregar(9, q10,"",""); //cadena
                q9.agregar(10, q10,"",""); //decimal
                q10.agregar(70, q11,"",""); // "nombre"
                q11.agregar(56, q9,"","");// ,   coma
            q9.agregar(55, q12,"","");// )
            q12.agregar(58, q13,"funcion",""); // {
                q13.agregar(6, q14,"",""); // variable
                    q14.agregar(8, q15,"",""); //entero
                    q14.agregar(9, q15,"",""); //cadena
                    q14.agregar(10, q15,"","");//decimal
                    q15.agregar(80, q16,"",""); // ID
                    q16.agregar(56,q15,"",""); // , coma
                    q16.agregar(51,q13,"",""); //;
                q17.agregar(51,q13,"",""); // ;
                
                q13.agregar(80,q19,"",""); // ID
                    q19.agregar(31,q20,"",""); // +
                        q20.agregar(31, q17,"","");// +
                        q20.agregar(32, q30,"","");// =
                    q19.agregar(33, q29,"","");  // -
                    q19.agregar(35,q29,"",""); // /
                    q19.agregar(34,q29,"",""); // *
                    q29.agregar(32, q30,"","");// =
                    q19.agregar(32, q30,"",""); // =
                    q30.agregar(80,q32,"",""); // ID
                    q30.agregar(14, q27, "", ""); // LeeEntero
                    q30.agregar(19, q27,"", "");  // LeeDecimal
                    q30.agregar(20,q27,"",""); // Lee Cadena
                    q27.agregar(54, q28, "", ""); //(
                    q28.agregar(55,q32,"",""); //)
                    q30.agregar(53, q34,"","");// '
                    q34.agregar(70, q35,"",""); //"nombre" texto
                    q35.agregar(53,q31,"",""); // '
                    q32.agregar(31,q30,"","");  // +
                    q32.agregar(33, q30,"",""); // -
                    q32.agregar(35, q30,"",""); // /
                    q32.agregar(34,q30,"","");  // *
                    q32.agregar(44,q30,"",""); // &
                    q32.agregar(51, q13, "", ""); // ;
                    q33.agregar(80,q31,"",""); // ID
                    q30.agregar(70,q31,"",""); // "nombre"
                   
                    q31.agregar(31,q30,"","");  // +
                    q31.agregar(33, q30,"",""); // -
                    q31.agregar(35, q30,"",""); // /
                    q31.agregar(34,q30,"","");  // *
                    q31.agregar(44, q30,"","");// &
                    
                    
                q31.agregar(51, q13,"",""); // ;
                
                q13.agregar(13, q36,"",""); //ciclo
                q36.agregar(54, q37,"",""); // (
                q37.agregar(6, q38,"",""); // variable
                q38.agregar(70, q39,"",""); //"nombre"
                q37.agregar(70,q39,"",""); //"nombre"
                q39.agregar(32, q40,"",""); // =
                q40.agregar(90, q41,"",""); //numero
                q41.agregar(51,q42,"",""); // ;
                q42.agregar(70, q43,"","");  //"nombre"
                q42.agregar(90, q43,"",""); //numero
                q43.agregar(37,q44,"","");// >
                q43.agregar(38,q44,"","");// <
                q43.agregar(32, q47,"",""); // =
                q43.agregar(105,q47,"",""); // !
                q47.agregar(32, q45,"",""); // =
                q44.agregar(32, q45,"",""); // =
                q44.agregar(70, q46,"",""); //nombre
                q44.agregar(80, q46,"",""); //numero
                q45.agregar(70, q46,"",""); //nombre
                q45.agregar(80, q46,"",""); //numero
                
                q46.agregar(51,q47,"",""); // ;
                q47.agregar(70, q48,"",""); // "nombre"
                q48.agregar(31,q49,"",""); // +
                q49.agregar(31,q50,"",""); // +
                q48.agregar(33, q51,"",""); // -
                q51.agregar(33,q50,"",""); // -
                q50.agregar(55, q52,"",""); // )
                q52.agregar(58, q13,"ciclo",""); // {
                       
                q13.agregar(16, q21,"","");   //imprimir
                q21.agregar(54, q22,"",""); // (
                    q22.agregar(80, q23, "", ""); //ID
                    q22.agregar(70, q23,"",""); // "nombre"
                q23.agregar(55,q17,"",""); // )
                    q23.agregar(106, q22,"",""); // &
                    q22.agregar(53, q25,"",""); // "
                    q25.agregar(70,q26,"",""); // "nombre" //texto
                    q26.agregar(53,q23,"",""); // "
                
                q13.agregar(11, q53, "", ""); //condicion
                q53.agregar(54, q54, "",""); // (
                
                    q54.agregar(70, q55,"","");  //"nombre"
                    q54.agregar(90, q55,"",""); //numero
                    q55.agregar(37,q56,"","");// >
                    q55.agregar(38,q56,"","");// <
                    q55.agregar(32, q57,"",""); // =
                    q55.agregar(105,q57,"",""); // !
                    q57.agregar(32, q58,"",""); // =
                    q56.agregar(32, q58,"",""); // =
                    q56.agregar(70, q59,"",""); //nombre
                    q56.agregar(90, q59,"",""); //numero
                    q58.agregar(70, q59,"",""); //nombre
                    q58.agregar(90, q59,"",""); //numero
                q59.agregar(55,q60,"",""); // )
                q60.agregar(54, q13, "{", ""); // {
                
                q13.agregar(59, q13, "", "ciclo"); // }
                q13.agregar(59, q4,"","funcion"); // }
                q4.agregar(59, q1, "","clase"); // }
             q1.agregar(7, q61, "", "");
             q61.fin=true;
             lector = new lee(buffer);
             boolean  termina =q0.avanzar(lector);
             if(errores>0){
                 System.out.println("Se han encontrado " +errores+" errores");
             }else{
                 System.out.println("El codigo es correcto");
             }
    }//fin de hhh
    
    
    
    static int errores;
    static lee lector;
    static List<String> Pila = new ArrayList<String>();
    static List<String> linea= new ArrayList<String>();
    static class lee{
       int Nolinea =0;
       Scanner lector; 
       String words[];
       List<Integer> lin;
       boolean hasNext(){
           return lector.hasNext();
       }
       lee(Scanner lector){
            this.lin = new ArrayList<Integer>();
           this.lector=lector;
           leeLinea();
           //System.err.println("hola");
       } 
       void leeLinea(){
           if(lector.hasNextLine())
                linea.add(lector.nextLine());
           else{
               System.out.print("final de archivo inesperado");
               System.exit(0); 
           }
           //System.out.println(linea);
           words=linea.get(linea.size()-1).split(" ");
           //System.out.println(words.length);
           for(int i=0;i<words.length;i++){
               lin.add(Integer.parseInt(words[i]));
               //System.out.println("Agregado valor "+lin.get(lin.size()-1));
           }
           Nolinea++;
       }
       int next(){
           if(!lin.isEmpty()){
               int temp = lin.get(0);
               lin.remove(0);
               return temp;
           }else{
               //System.out.println("se leyo linea");
               leeLinea();
               return next();
           }
           
       }
       
    }
    static List<Integer> id;
    static List<String> cod;
    static class estado{
        boolean fin =false;
        List<estado> estados = new ArrayList<estado>();
        List<Integer> Producciones = new ArrayList<Integer>();
        List<String> Pop = new ArrayList();
        List<String> Push = new ArrayList();
        
        boolean avanzar(lee lector){
            if(fin &&Pila.isEmpty()&& !lector.hasNext()){
                return true;
            }
            
            int token = lector.next();
            //System.out.println("hooola");
            boolean correcto=false;
            //System.err.println(token);
            
            int i=0;
            while(i<Producciones.size()){
                if(Producciones.get(i)==token){//esta en la lista?
                    if(Push.get(i)!=""){
                        Pila.add(Push.get(i));
                    }
                    if(Pop.get(i)!=""){//pide extraer algo
                       if(Pop.get(i)==Pila.get(Pila.size()-1)){//la pila lo contiene
                           Pila.remove(Pila.size()-1); //elimina el ultimo valor
                           correcto =true;
                           return estados.get(i).avanzar(lector);
                        }   
                    }else{
                        correcto =true;
                        return estados.get(i).avanzar(lector);
                    }
                }
                i++;
            }
            if(!correcto){
                
                System.out.println("Error en la linea "+ (lector.Nolinea));
                //System.out.println(linea.get(lector.Nolinea-1));
                String words[]=linea.get(lector.Nolinea-1).split(" ");
                
                for(int j=0;j<words.length;j++){
                    System.out.print(words[j]+" ");
                    System.out.print(cod.get(id.indexOf(Integer.parseInt(words[j])))+" ");
                }
                
                System.out.println();
                System.out.println("Se esperaba ");
                int j=0;
                while(j<Producciones.size()){
                    //System.out.print(Producciones.get(j));
                    System.out.print(cod.get(id.indexOf(Producciones.get(j)))+ " ");
                    j++;
                }
                System.out.println();
                errores++;
                int temp=lector.next();
                while(temp!=58 &&temp!=59 &&temp!=51){
                    temp=lector.next();
                }
                //System.out.println("aaaaa "+temp);
                if(temp==51){ // ;
                    
                    return q13.avanzar(lector);
                }
                if(temp==59){ // }
                    if(Pila.get(Pila.size()-1)=="ciclo"){
                       return q13.avanzar(lector);
                    }else if(Pila.get(Pila.size()-1)=="funcion"){
                       return q4.avanzar(lector);
                    }else{
                       return q1.avanzar(lector);
                    }
                } 
            }  
            return false;
            
        }

        private void agregar(int i, estado q1,String push,String Pop) {
            estados.add(q1);
            Producciones.add(i);
            this.Push.add(push);
            this.Pop.add(Pop);
            
        }
    }
    

}//fin de class sintactico
