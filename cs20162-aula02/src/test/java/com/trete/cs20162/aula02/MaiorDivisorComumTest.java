
package com.trete.cs20162.aula02;

import org.junit.Test;

public class MaiorDivisorComumTest {
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComAMaiorQueB(){
        Matematica.maiorDivisorComum(400, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void maiorDivisorComumComBNegativo(){
        Matematica.maiorDivisorComum(5, -10);
    }
}