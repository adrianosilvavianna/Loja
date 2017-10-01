/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class Cliente extends Pessoa {
    
    int id, cont = 0;

    private final Scanner leia = new Scanner(System.in);

    public Cliente(int cont, String nome, String cpf, String telefone) {
        this.setId(cont);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
    }
    
    public Cliente(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastrar(List<Cliente> clientes){
        String nome;
        String cpf;
        String telefone;
        Cliente cli = new Cliente();
        
        System.out.println("Cadastre um novo cliente \n Digite o nome :");
        cli.setNome(leia.next());
        System.out.println("Digite o CPF :");
        cli.setCpf(leia.next());
        System.out.println("Digite Telefone :");
        cli.setTelefone(leia.next());
        
        cli.toString();
        
        if(clientes.add(cli)){
            System.out.println("Cliente "+ cli.toString() +" cadastrado com sucesso!");
        }   
    }    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + super.toString();
    }
    
    
    void excluir(List<Cliente> clientes) {
        Cliente clienteFind = null;
        System.out.println("Digite o nome do cliente");
        String nome = leia.next();
        
        for (Cliente cliente : clientes) {
            
            if(cliente.nome.equals(nome)){
                clienteFind = cliente;
                System.out.println("Cliente Encontrado");
            }
        } 
        
        if(clientes.remove(clienteFind)){
            System.out.println("Cliente exluido");
        };
    }   
}
