package com.trete.cs20162.aula02;

import org.junit.Test;

public class NumeroHarmonicoTest {
    @Test(expected = IllegalArgumentException.class)
    public void numeroHarmonicoMenorQue1Invalido(){
        Matematica.numeroHarmonico(0);
    }
    
}