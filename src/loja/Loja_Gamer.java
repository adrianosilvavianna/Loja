/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public final class Loja_Gamer {

    private final Scanner leia = new Scanner(System.in);
    
    private static final ArrayList<Cliente> clientes = new ArrayList<>();//
    private static final ArrayList<Jogo> jogos =  new ArrayList<>();
    private static final ArrayList<Console> consoles =  new ArrayList<>();
    
    public Loja_Gamer() {
        this.perCadClientes();
        this.perCadProdutos();
        this.menu();
    }
    
    private void perCadClientes() {
        Cliente cli1 = new Cliente(1,"Adriano", "07136330505", "(31) 9999-9999");
        Cliente cli2 = new Cliente(2,"Joao", "07289823301", "(31) 9999-9999");
        Cliente cli3 = new Cliente(3,"Andre", "07289823301", "(31) 9999-9999");
        Cliente cli4 = new Cliente(4,"Cinognato", "07289823301", "(31) 9999-9999");
        
        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        clientes.add(cli4);
        
        for (Cliente cli : clientes) {
            System.out.println(cli.toString()+ "\n");
        }
    }
    
    private void perCadProdutos()
    {
        //JOGOS Jogo(String categoria, int cod, String nome, double precoVenda, double precoCompra)
        Jogo jogo1 = new Jogo("Aventura", 123, "A hora da aventura", 190.00 , 100.00);
        Jogo jogo2 = new Jogo("RPG", 1234, "Skyrim", 290.00 , 40.00);
        
        jogos.add(jogo1);
        jogos.add(jogo2);
        
        for (Jogo jg : jogos) {
            System.out.println(jg.toString() + "\n");
        }
        
        //Consoles Console(int cod, String nome, double precoCompra, double precoVenda, String marca, String modelo)
        Console console1 = new Console(1, "PlayStation", 1899.90, 2000.90, "SONY", "Slim");
        Console console2 = new Console(2, "XBOX", 1299.90, 1800.90, "Microsoft", "369x");
        
        consoles.add(console1);
        consoles.add(console2);
        
        for (Console cs : consoles){
            System.out.println(cs.toString() + "\n");
        }
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
                    this.fazerLoginCliente(clientes);
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
    
    private void fazerLoginCliente(List<Cliente> clientes){
        
        String nome;
        String cpf;
        
        int chances = 10;
        
        while(chances != 0){
            
            System.out.println("Realize o login como cliente : ");
            System.out.println("Nome: ");
            nome = leia.next();
            System.out.println("CPF: ");
            cpf = leia.next();
            
             for (Cliente cli : clientes) {
                 if(cli.nome.equals(nome) && cli.cpf.equals(cpf)){
                     System.out.println("Cliente Logado com sucesso");
                     this.menuCliente();
                    }
            }
            chances--;
            System.out.println("Login Errado! Voce tem "+ chances +" Tentativas /n");
        }
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
            String[] opcao = new String[5];
            opcao[0] = "Sair";
            opcao[1] = "Cliente";
            opcao[2] = "Produto";
            opcao[3] = "Vendas";
            opcao[4] = "Estoque";
            
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    this.menuAdminCliente();
                    break;
                case 2:
                    this.menuAdminProduto();
                    break;
                case 3:
                    //LISTAR VENDAS
                    break;
                case 4:
                    //LISTAR ESTOQUE
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void menuCliente(){
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[3];
            opcao[0] = "Sair";
            opcao[1] = "Fazer Compras";
            opcao[2] = "Carrinho De Compras";
            
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
                    this.listaCompra();
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void menuAdminCliente() {
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Sair";
            opcao[1] = "Cadastrar";
            opcao[2] = "Listar Todos";
            opcao[3] = "Excluir";
            
            for (int i = 0; i < 4; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    new Cliente().cadastrar(clientes);
                    break;
                case 2:
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente.toString()+ "\n");
                    }
                    break;
                case 3:
                    new Cliente().excluir(clientes);
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }

    private void listaCompra() {
        boolean sair = false;
        int op = -1;
        
        System.out.println("O que pretende comprar \n");
        while(!sair){
            String[] opcao = new String[3];
            opcao[0] = "Sair";
            opcao[1] = "Jogo";
            opcao[2] = "Console";
            
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("\n Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    new Jogo().toString();
                    break;
                case 2:
                    new Console().toString();
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }

    private void menuAdminProduto() {
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "sair";
            opcao[1] = "Cadastrar";
            opcao[2] = "Listar";
            opcao[3] = "Excluir";
            
            for (int i = 0; i < 4; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    this.cadastroProduto();
                    break;
                case 2:
                    
                    break;
                case 3:
                    this.excluirProuto();
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void cadastroProduto(){
        System.out.println("O que pretende cadastrar?/n");   
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "sair";
            opcao[1] = "Jogo";
            opcao[2] = "Console";
            
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
                    new Jogo().cadastrar(jogos);
                    break;
                case 2:
                    new Console().cadastrar(consoles);
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }

    private void excluirProuto() {
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "sair";
            opcao[1] = "Jogo";
            opcao[2] = "Console";
            
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
                    new Jogo().excluir(jogos);
                    break;
                case 2:
                    new Console().excluir(consoles);
                    break;
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
}

