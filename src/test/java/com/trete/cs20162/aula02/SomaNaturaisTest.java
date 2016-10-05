
package com.trete.cs20162.aula02;

import org.junit.Test;

public class SomaNaturaisTest {
    @Test(expected = IllegalArgumentException.class)
    public void somaMenorQue1Invalido(){
        Matematica.somaNaturais(0);
    }
    
}