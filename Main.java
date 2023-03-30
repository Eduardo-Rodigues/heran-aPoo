/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

import java.util.*;

/**
 *
 * @author eduro
 */
public class Main {

    public static void main(String[] args) {
        Aluno i = new Aluno ("Jose Francisco", "123,456,789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome; " +i.nome);
        System.out.println("CPF: " +i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento);
        
        Professor b = new Professor ("Mario Roberto", "123,666,789-95", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome; " +i.nome);
        System.out.println("CPF: " +i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento);
        
        Funcionario z = new Funcionario ("Robervaldo Fonseca", "123,333,789-80", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome; " +i.nome);
        System.out.println("CPF: " +i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento);
        
    }
}
