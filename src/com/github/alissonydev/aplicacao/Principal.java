package com.github.alissonydev.aplicacao;

import com.github.alissonydev.utils.Converter;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Conversor de Moedas!");

        final Converter converter = new Converter();

        System.out.println("\n" + converter.getConverter("BRL"));
    }
}
