package com.coursera.pizza;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    @Test
    void testAdicionarPizzaSemIngredientes() {
        Pizza pizza = new Pizza();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarPizza(pizza);

        Assertions.assertEquals(0.0, carrinhoDeCompras.getTotaL());
    }

    @Test
    public void testGetTotal(){
        Pizza pizza = new Pizza();
        pizza.adicionarIngrediente("salame");
        pizza.adicionarIngrediente("provolone");
        pizza.adicionarIngrediente("pimenta");

        Pizza pizza1 = new Pizza();
        pizza1.adicionarIngrediente("queijo");
        pizza1.adicionarIngrediente("oregano");
        pizza1.adicionarIngrediente("massa");

        Pizza pizza2 = new Pizza();
        pizza2.adicionarIngrediente("presunto");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarPizza(pizza);
        carrinhoDeCompras.adicionarPizza(pizza1);
        carrinhoDeCompras.adicionarPizza(pizza2);

        Assertions.assertEquals(55, carrinhoDeCompras.getTotaL());
    }
}