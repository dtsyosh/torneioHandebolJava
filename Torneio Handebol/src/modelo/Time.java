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
public class Time implements Comparable<Time> {

    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    private int pontos;
    private int saldoGols;

    public Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void adicionarVitoria() {
        this.vitorias++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void adicionarDerrota() {
        this.derrotas++;
    }

    public int getEmpates() {
        return empates;
    }

    public void adicionarEmpate() {
        this.empates++;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int numeroGolsMarcados) {
        this.golsMarcados += numeroGolsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int numeroGolsSofridos) {
        this.golsSofridos += numeroGolsSofridos;
    }

    public int getPontos() {
        return this.derrotas + (this.empates * 2) + (this.vitorias * 3);
    }

    public int getSaldoGols() {
        return this.golsMarcados - this.golsSofridos;
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
        this.setGolsMarcados(golsTime1);
        adversario.setGolsMarcados(golsTime2);
        //Incrementando os gols sofridos por ambos os times
        this.setGolsSofridos(golsTime2);
        adversario.setGolsSofridos(golsTime1);

    }

    @Override
    public int compareTo(Time outroTime) {

        if (this.getPontos() > outroTime.getPontos()) //Se este time tem mais pontos, joga mais para esquerda
            return -1;
        if (this.getPontos() < outroTime.getPontos()) //Se o outro time tem mais pontos, joga este time para direita         
            return 1;

        /*
            Se chegou até aqui, é porque o número de pontos dos times são iguais, então tento ordenar por numero
            de vitorias
        */
        if (this.getVitorias() > outroTime.getVitorias()) 
            return -1; 
        if (this.getVitorias() < outroTime.getVitorias()) 
            return 1;
        
        /*
            Se chegou até aqui é por que o numero de vitórias também são iguais
            só resta tentar ordenar por saldo de gols
        */
        
        if(this.getSaldoGols() > outroTime.getSaldoGols())
            return -1;
        if(this.getSaldoGols() < outroTime.getSaldoGols())
            return 1;
        
        //Se chegar até aqui é por que pode deixar do jeito que está mesmo..
        return 0;
    }

}
