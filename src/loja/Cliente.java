/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.List;

/**
 *
 * @author Adriano
 */
public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setTelefone(telefone);
    }
    
    public Cliente(){
        
    }
    
    public void cadastrar(List<Cliente> clientes, Cliente cli){
        
        if(clientes.add(cli)){
            System.out.println("Cliente "+ cli.toString() +" cadastrado com sucesso!");
        }   
    }    
}
