/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class Console extends Produto{
    
    String marca;
    String modelo;

    public Console(int cod, String nome, double precoCompra, double precoVenda, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
         super.setCodigo(cod);
        super.setNome(nome);
        super.setPrecoCompra(precoCompra);
        super.setPrecoVenda(precoVenda);
    }

    Console() {
        
    }

    void cadastrar(ArrayList<Console> consoles) {
        
    }

    void excluir(ArrayList<Console> consoles) {
        //
    }

    ArrayList<CarrinhoCompras> venda(ArrayList<Console> consoles, ArrayList<CarrinhoCompras> carrinho) {
        
        Scanner leia = new Scanner(System.in);
        
        boolean sair = false;
        int op = -1;
        
        System.out.println("O que pretende comprar \n");
        while(!sair){
            String[] opcao = new String[this.contConsole(consoles)];
            int vetor = 0;
            System.out.println("Digite 99 para sair");
            for(Console console : consoles){                
                opcao[vetor] = console.getNome();
                System.out.println(vetor + " - " + opcao[vetor]);
                vetor++;
            }
            System.out.print("\n Informe uma opção: ");
            op = leia.nextInt();
            
            if(op == 99)    
                break;
            
                for(Console console : consoles){                
                
                if(opcao[op].equals(console.getNome())){
                    System.out.println("Console " + console.getNome() + " Selecionado");

                    CarrinhoCompras carrinhoCompras = new CarrinhoCompras(console);
                    carrinho.add(carrinhoCompras);
                }
            }
        }
        return carrinho;
    }

    private int contConsole(ArrayList<Console> consoles) {
        int cont = 0;
        
         for(Console c : consoles){
            cont++;
          }
         return cont;
    }

    
    @Override
    public String toString() {
        return "Console{" + "Cod" + super.getCodigo() + "Nome" + super.getNome() + "marca=" + marca + ", modelo=" + modelo + 
                "Preco Compra" + super.getPrecoCompra() + "Preco Venda" + super.getPrecoVenda() + '}';
    }
    
    String toStringEstoque() {
        return "Produto - Console " + " Cod " + super.getCodigo() + " Nome " + super.getNome() + " Marca " + marca + " Modelo " + modelo + 
                " Preco Compra " + super.getPrecoCompra() + " Preco Venda " + super.getPrecoVenda() + " Quantidade Disponível " + super.getQuantidade() + " Data da Compra " + super.getDataCompra();
    }
    
}
