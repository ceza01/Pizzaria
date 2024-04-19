package com.coursera.pizza;

public class Principal {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.adicionarIngrediente("figo");
        pizza1.adicionarIngrediente("copa");
        pizza1.adicionarIngrediente("queijo");
        pizza1.adicionarIngrediente("tomate");
        pizza1.adicionarIngrediente("presunto");
        pizza1.adicionarIngrediente("queijo");

        Pizza pizza2 = new Pizza();
        pizza2.adicionarIngrediente("salame");
        pizza2.adicionarIngrediente("provolone");
        pizza2.adicionarIngrediente("pimenta");
        pizza2.adicionarIngrediente("tomate");
        pizza2.adicionarIngrediente("presunto");
        pizza2.adicionarIngrediente("queijo");

        Pizza pizza3 = new Pizza();
        pizza3.adicionarIngrediente("presunto");
        pizza3.adicionarIngrediente("mussarela");
        pizza3.adicionarIngrediente("tomate");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        System.out.println("Total: R$" + carrinho.getTotaL());

        System.out.println("\nIngredientes utilizados: ");
        for (String ingredientes : Pizza.getIngredientesUtilizados().keySet()) {
            System.out.println(ingredientes + ": " + Pizza.getIngredientesUtilizados().get(ingredientes));;
        }
    }
}
