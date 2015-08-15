/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafraccionario;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class ProgramaFraccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        Fraccionario f1,f2,f3;
        f1 = new Fraccionario();
        f2 = new Fraccionario();
        f3 = new Fraccionario();
        
        System.out.println("Introduzca el numerador del fraccionario 1");
        f1.numerador = entrada.nextInt();
        
        System.out.println("Introduzca el denominador del fraccionario 1");
        f1.denominador = entrada.nextInt();
        
        
        System.out.println("Introduzca el numerador del fraccionario 2");
        f2.numerador = entrada.nextInt();
        
        System.out.println("Introduzca el denominador del fraccionario 2");
        f2.denominador = entrada.nextInt();
        
        f3 = f1.sumar(f2);
        
        System.out.println(f1+" + "+f2+ " = "+f3);
        
    }
    
}
