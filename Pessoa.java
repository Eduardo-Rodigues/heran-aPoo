/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

import java.util.Date;

/**
 *
 * @author eduro
 */
public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;
    public Pessoa(String _nome, String _cpf, Date _data){
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
}
