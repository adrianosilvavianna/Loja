/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public final class Loja_Gamer {

    private final Scanner leia = new Scanner(System.in);
    
    public Loja_Gamer() {
        this.menu();
    }
    
    public void menu() {
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Sair";
            opcao[1] = "Fazer Login";
            
            for (int i = 0; i < 2; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    this.fazerLogin();
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void fazerLogin(){
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Sair";
            opcao[1] = "Cliente";
            opcao[2] = "Administrador";
            
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    this.fazerLoginCliente();
                    break;
                case 2:
                    this.fazerLoginAdmin();
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void fazerLoginCliente(){
        
    }
    
    private void fazerLoginAdmin(){
     
        String nomeAdmin = "Adriano";
        String senhaAdmin = "123456";
        String nome;
        String senha;
        int chances = 10;
        
        while(chances != 0){
            
            System.out.println("Login: ");
            System.out.println("Nome: ");
            nome = leia.next();
            System.out.println("Senha: ");
            senha = leia.next();
            
            if (nomeAdmin.equals(nome) && senhaAdmin.equals(senha)) {
                    System.out.println("Login Aceito");
                    chances=0;
                    this.menuAdmin();
                }else{
                chances--;
                System.out.println("Login Errado! Voce tem "+ chances +" Tentativas");
            }
        }
    }

    private void menuAdmin(){
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Cadastrar Cliente";
            opcao[1] = "Cadastrar Produto";
            opcao[2] = "Realizar Venda";
            
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    this.cadastroCliente();
                    break;
                case 1:
                    this.cadastroProduto();
                    break;
                case 2:
                    System.out.println("fazer uma venda");
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void cadastroCliente(){
        String nome;
        String cpf;
        String telefone;
        
        System.out.println("Cadastre um novo cliente \n Digite o nome :");
        nome = leia.next();
        System.out.println("Digite o CPF :");
        cpf = leia.next();
        System.out.println("Digite Telefone :");
        telefone = leia.next();
        
        new Cliente().cadastrar(nome, cpf, telefone);
    }
    
    private void cadastroProduto(){
        
        System.out.println("Deve cadastrar um produto");
        
    }
    
   
}

