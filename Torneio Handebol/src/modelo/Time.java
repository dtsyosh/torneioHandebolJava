/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author yosh
 */
public class Time {

    private String nome;
    private int numeroVitorias;
    private int numeroDerrotas;
    private int numeroEmpates;
    private int numeroGolsMarcados;
    private int numeroGolsSofridos;
    private int pontos;
    private int saldoGols;

    public Time(String nome) {
        this.nome = nome;
        this.numeroVitorias = 0;
        this.numeroEmpates = 0;
        this.numeroDerrotas = 0;
        this.numeroGolsMarcados = 0;
        this.numeroGolsSofridos = 0;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public void adicionarVitoria() {
        this.numeroVitorias++;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void adicionarDerrota() {
        this.numeroDerrotas++;
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public void adicionarEmpate() {
        this.numeroEmpates++;
    }

    public int getNumeroGolsMarcados() {
        return numeroGolsMarcados;
    }

    public void setNumeroGolsMarcados(int numeroGolsMarcados) {
        this.numeroGolsMarcados += numeroGolsMarcados;
    }

    public int getNumeroGolsSofridos() {
        return numeroGolsSofridos;
    }

    public void setNumeroGolsSofridos(int numeroGolsSofridos) {
        this.numeroGolsSofridos += numeroGolsSofridos;
    }

    public int getPontos() {
        return this.numeroDerrotas + (this.numeroEmpates * 2) + (this.numeroVitorias * 3);
    }

    public int getSaldoGols() {
        return this.numeroGolsMarcados - this.numeroGolsSofridos;
    }

    public void jogar(Time adversario) {
        Random gerarNumero = new Random();

        int golsTime1 = gerarNumero.nextInt(7);
        int golsTime2 = gerarNumero.nextInt(7);

        if (golsTime1 > golsTime2) {    //Se o time 1 venceu
            this.adicionarVitoria();
            adversario.adicionarDerrota();
        } else if (golsTime1 == golsTime2) {    //Se empatou
            this.adicionarEmpate();
            adversario.adicionarEmpate();
        } else {    //Se o time 1 perdeu
            this.adicionarDerrota();
            adversario.adicionarVitoria();
        }
        
        //Incrementando os gols marcados por ambos os times
        this.setNumeroGolsMarcados(golsTime1);
        adversario.setNumeroGolsMarcados(golsTime2);
        //Incrementando os gols sofridos por ambos os times
        this.setNumeroGolsSofridos(golsTime2);
        adversario.setNumeroGolsSofridos(golsTime1);

    }

}
