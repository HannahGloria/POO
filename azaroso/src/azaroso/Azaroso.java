
package azaroso;
import java.util.Scanner;

/**
 *
 * @author Hannah
 */
public class Azaroso {

    /**
     * con 3 oportunidades unicamente
     */
    public static void main(String[] args) {
        
        int aleatorio;
        int num, i =1;
        aleatorio = (int)(Math.random()*100); // Math.random es una funcion que genera un numero random del 0 al 1
        System.out.println("Digita un numero entre 1 y 100");
        
        Scanner numero= new Scanner (System.in);    
        num= numero.nextInt();
        System.out.println("Llevas una oportunidad");
    
        do{
          
           if (num<aleatorio){
               System.out.println("Digita un numero mayor");
           }else{
               System.out.println("Digita un numero menor");
           }
              
           num= numero.nextInt();
           i++;
            System.out.println("Llevas "+i+" oportunidades");
        }while(num!=aleatorio&&i<3);
        
        if(num==aleatorio){
            System.out.println("Felicidades. Ese es el numero correcto");
        }
        if(i>2){
            System.out.println("PERDISTE");
            System.out.println("El numero era: "+aleatorio);
        }
    }
    
}
