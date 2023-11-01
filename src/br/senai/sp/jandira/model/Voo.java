package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Voo {
    private String origem, destino, companhia;
    private int numVoo, capacidadePassageiros;


    public Voo (int numVoo, String origem, String destino, String companhia, int capacidadePassageiros){
        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.companhia = companhia;
        this.capacidadePassageiros = capacidadePassageiros;

    }
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }



}
