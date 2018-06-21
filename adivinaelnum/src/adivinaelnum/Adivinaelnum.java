/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnum;

import java.util.Scanner;

/**
 *
 * @author Hannah
 */
public class Adivinaelnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i =1, nom=32;
        
        System.out.println("Digita un numero entre 1 y 100");
        
        Scanner numero= new Scanner (System.in);    
        num= numero.nextInt();
        
        //if(num!=nom){
          //  System.out.println("Llevas una oportunidad");
        //}
        
        do{
            if(num==nom){
            System.out.println("Felicidades. Ese es el numero correcto");
            break;
        
            //}else if(i==3&&num!=nom){
            //System.out.println("PERDISTE");
            //System.out.println("El numero era: "+nom);
            }
          
            if (num<nom&&i<3){
               System.out.println("Digita un numero mayor");
            }else{
               System.out.println("Digita un numero menor");
            }
           
            if(num!=nom){
            System.out.println("Llevas "+i+" oportunidades");
            }
            num= numero.nextInt();
            i++;
           
        }while(i<3&&num!=nom);
        if(i==3&&num!=nom){
           System.out.println("PERDISTE");
           System.out.println("El numero era: "+nom);
    }
    }
}


    
    

