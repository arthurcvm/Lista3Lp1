/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Banco {
    public static void main(String args[]){
        ContaPoupança poupança = new ContaPoupança();
        ContaCorrente corrente = new ContaCorrente();
        Scanner le = new Scanner(System.in);
        byte conta;
        do{
            System.out.println("Seja bem vindo\n"
                    + "Escolha entre contas:\n"
                    + "1 - Poupança\n"
                    + "2 - Corrente");
            conta = le.nextByte();

            switch(conta){
                case 1:
                    poupança(poupança);
                    break;
                case 2:
                    corrente(corrente);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente: ");
                    break;                
            }
        }while(conta != 0);
        
        System.out.println("Faça seu primeiro depósito em sua poupança");
    }
    public static void poupança(ContaPoupança poupança){        
        Scanner le = new Scanner(System.in);
        byte op;
        do{
            System.out.println("Operação desejada:\n"
                    + "1 - Depositar\n"
                    + "2 - Sacar\n"
                    + "3 - Atualizar saldo\n"
                    + "4 - Verificar saldo\n"
                    + "0 - Sair");
            op = le.nextByte();
        
            switch(op){
                case 1:
                    System.out.print("Valor: ");
                    double deposito = le.nextDouble();
                    poupança.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor: ");
                    double saque = le.nextDouble();
                    poupança.sacar(saque);
                    break;
                case 3:
                    System.out.print("Taxa: ");
                    double taxa = le.nextDouble();
                    poupança.atualizaSaldo(taxa);
                    break;  
                case 4:
                    System.out.println("Saldo: R$"+poupança.getSaldo());
                    break;
                default:
                        System.out.println("Opção inválida, tente novamente: ");
                        break;
            }
        }while(op != 0);
        
    }
    public static void corrente(ContaCorrente corrente){
        Scanner le = new Scanner(System.in);
        byte op;
        do{
            System.out.println("Operação desejada:\n"
                    + "1 - Depositar\n"
                    + "2 - Sacar\n"
                    + "3 - Atualizar saldo\n"
                    + "4 - Verificar saldo\n"
                    + "0 - Sair");
            op = le.nextByte();

            switch(op){
                case 1:
                    System.out.print("Valor: ");
                    double deposito = le.nextDouble();
                   corrente.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor: ");
                    double saque = le.nextDouble();
                    corrente.sacar(saque);
                    break;
                case 3:
                    System.out.print("Taxa: ");
                    double taxa = le.nextDouble();
                    corrente.atualizaSaldo(taxa);
                    break;  
                case 4:
                    System.out.println("Saldo: R$"+corrente.getSaldo());
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente: ");
                    break;
            }
        }while(op != 0);
    }
    
}