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
public class Console extends Produto{
    
    String marca;
    String modelo;

    public Console(String categoria, int cod, String nome, double valor,String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        super.setCodigo(cod);
        super.setNome(nome);
        super.setValor(valor);
    }
    
    
    
    
}
