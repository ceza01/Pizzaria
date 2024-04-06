package com.coursera.pizza;

import java.util.HashMap;

public class Pizza {
    private static HashMap<String, Integer> ingredientes = new HashMap<>();
    private int numIgredientes;

    public Pizza() {
        this.numIgredientes = 0;
    }

    public double getPreco(){
        if (numIgredientes <= 2) {
            return 15;
        } else if(numIgredientes >= 3 && numIgredientes <= 5){
            return 20;
        } else{
            return 23;
        }

    }

    public void adicionarIngrediente(String ingrediente){
        contabilizaIngrediente(ingrediente);
        this.numIgredientes++;
    }

    private static void contabilizaIngrediente(String ingrediente){
        ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente,0)+1);

    }

    public static HashMap<String, Integer> getIngredientesUtilizados() {
        return ingredientes;
    }

    public static void zerarIngredientes(){

    }


}
