package com.trete.cs20162.aula02;

import org.junit.Test;

public class ProdutoTest {
    @Test(expected = IllegalArgumentException.class)
    public void produtoComSomaNegativaInvalido(){
        Matematica.produto(-132, -40);
    }
}