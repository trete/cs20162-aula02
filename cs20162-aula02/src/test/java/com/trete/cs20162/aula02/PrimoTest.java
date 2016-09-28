package com.trete.cs20162.aula02;

import org.junit.Test;

public class PrimoTest {
    @Test(expected = IllegalArgumentException.class)
    public void primoIguala1Invalido(){
        Matematica.verificaPrimo(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primoMenorQue1Invalido(){
        Matematica.verificaPrimo(0);
    }
}