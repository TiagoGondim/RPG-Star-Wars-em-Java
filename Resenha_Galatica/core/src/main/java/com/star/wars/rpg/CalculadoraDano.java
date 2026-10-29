package com.star.wars.rpg;

import java.util.Random;

public class CalculadoraDano {

    private final Random random;

    public CalculadoraDano(Random random) {
        this.random = random;
    }

    public boolean acerto(Ataque ataque){
        return random.nextInt(100) < ataque.getPrecisao();
    }

    public int calcular(Personagem atacante, Personagem alvo, Ataque ataque){
        int defesa = Math.max(1, alvo.getDefesa());
        double base = (double) atacante.getAtaque() * ataque.getPoder() / (defesa * 2);
        double variacao = 0.85 + random.nextDouble() * 0.15; // entre 85 e 100
        return Math.max(1, (int) (base * variacao));
    }
}
