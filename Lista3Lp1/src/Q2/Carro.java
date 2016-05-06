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
public class Carro {
    private String cor;
    private String modelo;
    private Motor motor;
    private Pneu pneu;

    public Carro(String cor, String modelo, String marca, Double potencia, String tipo, int aro) {
        this.cor = cor;
        this.modelo = modelo;
        motor = new Motor(marca, potencia);
        pneu = new Pneu(tipo,aro);
    }
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Pneu getPneu() {
        return pneu;
    }

    @Override
    public String toString() {
        return "Carro: " + 
                "\ncor: " + cor + 
                "\nmodelo: " + modelo + 
                "\nmotor: " + motor.getMarca() + 
                "\npneu: " + pneu.getAro();
    }
}
