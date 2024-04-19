package com.coursera.pizza;

public class CarrinhoDeCompras {
    private double total;

    public CarrinhoDeCompras() {
        this.total = total;
    }

    public void adicionarPizza(Pizza pizza) {
        if (pizza.getPreco() > 0) {
            total += pizza.getPreco();
        } else {
            System.out.println("A pizza precisa ter ingredientes.");
        }
    }

    public double getTotaL() {
        return total;
    }

}
