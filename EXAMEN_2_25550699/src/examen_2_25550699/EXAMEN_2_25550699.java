/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_2_25550699;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN_2_25550699 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicita un numero al usuario
        //debe quedar 2** o 3 ***
        //decir si es primo o no es primo
        Scanner captu = new Scanner(System.in);
         int numero;
         int filas;
      int contador =0;
      
      System.out.println("ingresa numero entero");
       
       numero=captu.nextInt();
       
       for (int i=1;i<=numero;i++){
           for (int j=1;j<=1;j++)
               
       if (numero%i==0){
        contador ++;
       }
          
                   System.out.println("*");
                  System.out.println("");
       
       }if(contador==2){
           System.out.println(numero+  " es numero primo.");
       }else{
           
           System.out.println(numero+ " no es numero primo.");
       }
       System.out.println("Aqui termina!!!");
       }  
       
}    
    


