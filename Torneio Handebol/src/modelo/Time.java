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

    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }

    public int getNumeroGolsMarcados() {
        return numeroGolsMarcados;
    }

    public void setNumeroGolsMarcados(int numeroGolsMarcados) {
        this.numeroGolsMarcados = numeroGolsMarcados;
    }

    public int getNumeroGolsSofridos() {
        return numeroGolsSofridos;
    }

    public void setNumeroGolsSofridos(int numeroGolsSofridos) {
        this.numeroGolsSofridos = numeroGolsSofridos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
}
