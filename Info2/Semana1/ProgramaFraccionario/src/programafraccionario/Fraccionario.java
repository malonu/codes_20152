/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programafraccionario;

/**
 *
 * @author root
 */
public class Fraccionario {
    int numerador;
    int denominador;
    Fraccionario sumar(Fraccionario otro)
    {
        Fraccionario resultante = new Fraccionario();
        resultante.numerador = this.numerador * otro.denominador + otro.numerador * this.denominador;
        resultante.denominador = this.denominador * otro.denominador;
        return resultante;
    }        

    @Override
    public String toString() {
        return  numerador + "/" + denominador;
    }
    
            
    
}
