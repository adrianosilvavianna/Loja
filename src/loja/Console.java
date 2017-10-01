/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Console{" + "Cod" + super.getCodigo() + "Nome" + super.getNome() + "marca=" + marca + ", modelo=" + modelo + 
                "Preco Compra" + super.getPrecoCompra() + "Preco Venda" + super.getPrecoVenda() + '}';
    }

    void cadastrar(ArrayList<Console> consoles) {
        
        
        
    }

    void excluir(ArrayList<Console> consoles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
