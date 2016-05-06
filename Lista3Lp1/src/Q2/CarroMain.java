/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author arthu
 */
public class CarroMain {
    public static void main(String args[]){
        String cor;
        String modelo;
        String marca;
        Double potencia;
        String tipo;
        int aro;
        
        Carro carro = new Carro("azul", "celta", "chevrolet", 200.0, "redondo", 15);
        
        System.out.println(carro.toString());
    }
    
}
