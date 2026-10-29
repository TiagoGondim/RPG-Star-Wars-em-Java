package com.star.wars.rpg;

import javax.xml.crypto.Data;

public class Personagem {

    private final String nome;
    private final int vidaMaxima;
    private int vidaAtual;
    private final int ataque;
    private final int defesa;
    private final int velocidade;

    public Personagem(String nome, int vidaMaxima, int vidaAtual, int ataque, int defesa, int velocidade){
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaAtual;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;

    }

    public void receberDano(int dano){
        vidaAtual = Math.max(0, vidaAtual - dano);
    }

    public void curar(int quantidade){
        vidaAtual = Math.min(vidaMaxima, vidaAtual + quantidade);
    }

    public boolean estaVivo(){
        return vidaAtual > 0;
    }

    public String getNome()     {return nome;}
    public int getVidaMaxima()  {return vidaMaxima;}
    public int getVidaAtual()   {return  vidaAtual;}
    public int getAtaque()      {return  ataque;}
    public int getDefesa()      {return defesa;}
    public int getVelocidade()  {return velocidade;}


}
