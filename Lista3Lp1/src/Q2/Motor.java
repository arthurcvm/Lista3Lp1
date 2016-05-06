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
public class Motor {
    private String marca;
    private Double potencia;
    
    public Motor(String marca, Double potencia){
        this.marca = marca;
        this.potencia = potencia;
    }
    public String getMarca(){
        return marca;
    }
    public double getPotencia(){
        return potencia;
    }
    
}
