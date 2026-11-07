package com.empresa;

public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero;

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = "nd";
    }

    public Cliente(int id, String nome, int desconto, String genero) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        setGenero(genero);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null && (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("nd"))) {
            this.genero = genero.toLowerCase();
        } else {
            this.genero = "nd";
        }
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return nome + " (" + id + ") (" + desconto + "%)";
    }
}
