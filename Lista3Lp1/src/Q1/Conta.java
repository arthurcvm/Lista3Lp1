package Q1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arthu
 */
public class Conta {
    protected double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double deposito){
        saldo += deposito;
    }
    public boolean sacar(double saque){
        if((saldo-saque)>=0){
            saldo-=saque;
            return true;
        }
        else{
            return false;            
        }
    }
    public void atualizaSaldo(double taxa){
        saldo += (saldo*(taxa/100));
    }
    
}
