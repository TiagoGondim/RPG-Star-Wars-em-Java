package com.star.wars.rpg;

public class Ataque {

    private final String nome;
    private final int poder; // força do golpe
    private final int precisao; // chance de acertar

    public Ataque(String nome, int poder, int precisao){
        this.nome = nome;
        this.poder = poder;
        this.precisao = precisao;
    }

    public String getNome() {return nome;}
    public int getPoder() {return poder;}
    public int getPrecisao() {return precisao;}


}
