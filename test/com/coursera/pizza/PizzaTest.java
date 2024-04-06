package com.coursera.pizza;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PizzaTest {

    @Test
    public void testGetPreco() {
        Pizza pizza = new Pizza();
        pizza.adicionarIngrediente("molho");
        pizza.adicionarIngrediente("tomate");
        Assertions.assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testGetPreco2() {
        Pizza pizza = new Pizza();
        pizza.adicionarIngrediente("molho");
        pizza.adicionarIngrediente("tomate");
        pizza.adicionarIngrediente("presunto");
        pizza.adicionarIngrediente("queijo");
        Assertions.assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testGetPreco3() {
        Pizza pizza = new Pizza();
        pizza.adicionarIngrediente("molho");
        pizza.adicionarIngrediente("tomate");
        pizza.adicionarIngrediente("presunto");
        pizza.adicionarIngrediente("queijo");
        pizza.adicionarIngrediente("salame");
        pizza.adicionarIngrediente("oregano");
        Assertions.assertEquals(23, pizza.getPreco());
    }

}