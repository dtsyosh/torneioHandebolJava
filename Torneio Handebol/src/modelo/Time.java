/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
        this.atualizarPontos();
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void adicionarDerrota() {
        this.numeroDerrotas++;
        this.atualizarPontos();
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public void adicionarEmpate() {
        this.numeroEmpates++;
        this.atualizarPontos();
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
        return pontos;
    }

    private void atualizarPontos() {
        this.pontos  = numeroVitorias * 3;
        this.pontos += numeroEmpates * 2;
        this.pontos += numeroDerrotas;
    }
    
    
}
