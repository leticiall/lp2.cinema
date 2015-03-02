package com.br.lp2.cinema.model;

import java.util.Date;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Diretor {

    private String nome;
    private String reg;

    /**
     * Construtor da classe usando apenas o registro
     * @param reg num de registro do diretor na academia
     */ 
    public Diretor(String reg) {
        this.reg = reg;
    }
    /**
     * Construtor da classe usando todos os parametros
     * @param nome nome do diretor
     * @param reg num de registro do diretor na academia
     */     
    public Diretor(String nome, String reg){
        this.nome = nome;
        this.reg = reg;
    }

}
