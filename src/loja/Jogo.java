/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.logging.Logger;

/**
 *
 * @author Adriano
 */
public class Jogo extends Produto{

    String categoria;

    public Jogo(String categoria, int cod, String nome, double valor) {
        this.categoria = categoria;
        super.setCodigo(cod);
        super.setNome(nome);
        super.setValor(valor);
    }
    
}