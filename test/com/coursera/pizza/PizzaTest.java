package com.coursera.pizza;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;

public class PizzaTest {

    @AfterEach
        public void tearDown(){
        Pizza.zerarIngredientes();
    }

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

    @Test
    public void testRegistroIngredientes(){
        Pizza pizza = new Pizza();
        pizza.adicionarIngrediente("queijo");
        pizza.adicionarIngrediente("salame");
        pizza.adicionarIngrediente("oregano");
        pizza.adicionarIngrediente("presunto");

        HashMap<String, Integer> ingredientes = Pizza.getIngredientesUtilizados();

        Assertions.assertEquals(4, ingredientes.size());

        Assertions.assertTrue(ingredientes.containsKey("queijo"));
        Assertions.assertTrue(ingredientes.containsKey("salame"));
        Assertions.assertTrue(ingredientes.containsKey("oregano"));
        Assertions.assertTrue(ingredientes.containsKey("presunto"));
    }

}