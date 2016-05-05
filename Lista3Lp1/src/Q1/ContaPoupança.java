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
public class ContaPoupança extends Conta {
    
    @Override
    public void atualizaSaldo(double taxa){
        saldo += (saldo*((taxa*3)/100));
    }    
}
