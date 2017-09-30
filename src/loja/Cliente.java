/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Adriano
 */
public class Cliente extends Pessoa {

    public void cadastrar(String nome, String cpf, String telefone){
        
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        System.out.println("Cliente Cadastrado");
    }
    
}
