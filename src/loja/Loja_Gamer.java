/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public final class Loja_Gamer {

    private final Scanner leia = new Scanner(System.in);
    
    private static final List<Cliente> clientes = new ArrayList<>();//
    private static final ArrayList<Jogo> jogos =  new ArrayList<>();
    private static final ArrayList<Console> consoles =  new ArrayList<>();
    private static final ArrayList<CarrinhoCompras> carrinho =  new ArrayList<>();
    private static final ArrayList<Venda> vendas =  new ArrayList<>();
    
    
    public Loja_Gamer() throws FileNotFoundException {
        this.preCadClientes();
        this.preCadProdutos();
        this.preCadVendas();
        this.menu();
       
        
    }
    
    private void preCadClientes() throws FileNotFoundException {
        
        
        Cliente cli1 = new Cliente(1,"Adriano", "07136330505", "(31) 9999-9999");
        Cliente cli2 = new Cliente(2,"Joao", "07289823301", "(31) 9999-9999");
        Cliente cli3 = new Cliente(3,"Andre", "07289823301", "(31) 9999-9999");
        Cliente cli4 = new Cliente(4,"Cinognato", "07289823301", "(31) 9999-9999");
        Cliente cli5 = new Cliente(5,"Thallyta", "57289823301", "(31) 9999-9999");
        
        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        clientes.add(cli4);
        clientes.add(cli5);
        
         for (Cliente cli : clientes) {
            System.out.println(cli.toString() + "\n");
        }
    }
    
    private void preCadProdutos()
    {
        Jogo jogo1 = new Jogo("Aventura", 123, "A hora da aventura", 190.00 , 100.00, 0);
        Jogo jogo2 = new Jogo("RPG", 1234, "Skyrim", 290.00 , 40.00, 1);
        Jogo jogo3 = new Jogo("Tiro", 1234, "CS GO", 290.00 , 40.00, 20);
        Jogo jogo4 = new Jogo("Infantil", 1234, "Princesa Leia", 290.00 , 40.00, 32);
        Jogo jogo5 = new Jogo("Futebol", 1234, "Fifa", 290.00 , 40.00, 34);
        
        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);
        jogos.add(jogo4);
        jogos.add(jogo5);
        
        for (Jogo jg : jogos) {
            System.out.println(jg.toString() + "\n");
        }
        
        //Consoles Console(int cod, String nome, double precoCompra, double precoVenda, String marca, String modelo)
        Console console1 = new Console(1, "PlayStation", 1899.90, 2000.90, "SONY", "Slim");
        Console console2 = new Console(2, "XBOX", 1299.90, 1800.90, "Microsoft", "369x");
        Console console3 = new Console(2, "Nitendo Wii", 129.90, 180.90, "Nitendo", "niwii");
        
        consoles.add(console1);
        consoles.add(console2);
        consoles.add(console3);
        
        for (Console cs : consoles){
            System.out.println(cs.toString() + "\n");
        }
    }
    
    private void preCadVendas(){
        
        Venda venda1 = new Venda(129.33);
        Venda venda2 = new Venda(829.33);
        
        vendas.add(venda1);
        vendas.add(venda2);
        
        for (Venda vd : vendas){
            System.out.println(vd.toString() + "\n");
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
                    
                    System.out.println("Lista de todas as vendas realizadas. /n/n/n");
                    
                    for (Venda vd : vendas) {
                        System.out.println(vd.toString() + "\n");
                    }
                    
                    break;
                case 4:
                    this.menuEstoque();
                default:
                    //Colocar opção invalida
                    System.out.println("Opção invalida /n");
                    sair = true;
                    break;
            }
        }
    }
    
    private void menuEstoque(){
        
        boolean sair = false;
        int op = -1;
        
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Sair";
            opcao[1] = "Lista";
            opcao[2] = "Verificar Produtos em falta";
        
            
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
                    
                    for (Jogo jg : jogos) {
                        System.out.println(jg.toStringEstoque() + "\n");
                    }
                    
                    for (Console cs : consoles) {
                        System.out.println(cs.toStringEstoque() + "\n");
                    }
                    
                    break;
                case 2:
                    
                    for (Jogo jg : jogos) {
                        
                        jg.estoqueBaixo(jg);
                        
                    }
                    
                    for (Console cs : consoles) {
                        
                        cs.estoqueBaixo(cs);
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
        ArrayList<CarrinhoCompras> carrinhoCompras = null;
        double valorTotal = 0.0;
        
        System.out.println("O que pretende comprar \n");
        while(!sair){
            String[] opcao = new String[4];
            opcao[0] = "Sair";
            opcao[1] = "Jogo";
            opcao[2] = "Console";
            opcao[3] = "Carrinho De Compra";
            
            for (int i = 0; i < 4; i++) {
                System.out.println(i + " - " + opcao[i]);
            }
        
            System.out.print("\n Informe uma opção: ");
            op = leia.nextInt();
            
            switch (op) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    if(carrinhoCompras == null){
                        carrinhoCompras = new Jogo().venda(jogos, carrinho);
                        
                        for(CarrinhoCompras c : carrinhoCompras){
                            valorTotal = valorTotal + c.getPrecoVenda();
                        }
                    }else{
                        carrinhoCompras = new Jogo().venda(jogos, carrinhoCompras);
                    
                        for(CarrinhoCompras c : carrinhoCompras){
                            c.toStringCliente();
                        }
                    }
                    break;
                case 2:
                    if(carrinhoCompras == null){
                        carrinhoCompras = new Console().venda(consoles, carrinho);
                        
                        for(CarrinhoCompras c : carrinhoCompras){
                            valorTotal = valorTotal + c.getPrecoVenda();
                        }
                    }else{
                        carrinhoCompras = new Console().venda(consoles, carrinho);
                    
                        for(CarrinhoCompras c : carrinhoCompras){
                            c.toStringCliente();
                        }
                    }
                    
                    break;
                case 3:
                    if(carrinhoCompras == null){
                            System.out.println("Voce não possui produtos selecionados!!");
                    }else{
                        for(CarrinhoCompras c : carrinhoCompras){
                            
                            c.toStringCliente();
                            
                            valorTotal = valorTotal + c.getPrecoVenda();
                        }
                        
                        System.out.println("\n\n O Valor da sua compra é : "+ valorTotal + "\n");
                        
                        System.out.println("Finalizar compra \n 0 - Sim \n 1 - nao \n");
                        int finish = leia.nextInt();
                        
                        if(finish == 0){
                            Venda venda = new Venda(valorTotal);
                            vendas.add(venda);
                            
                            System.out.println("Venda Realizada - "+ venda.toString());
                            carrinhoCompras = null;
                            
                        }else{
                            carrinhoCompras = null;
                        }                        
                    }
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
                    
                     for (Jogo jg : jogos) {
                        System.out.println(jg.toString() + "\n");
                    }
                     
                    for (Console cs : consoles) {
                        System.out.println(cs.toString() + "\n");
                    }
        
        
                    
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

