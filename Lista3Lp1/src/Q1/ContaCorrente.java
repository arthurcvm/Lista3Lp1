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
public class ContaCorrente extends Conta {
    
    @Override
    public void atualizaSaldo(double taxa){
        saldo += (saldo*((taxa*2)/100));
    } 
    @Override
    public void depositar(double deposito){
        saldo += (deposito-0.5);
    }
}
