package com.bichinho.model;

public class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    // Construtor
    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }

    // Métodos Getters
    public String getNome() { return nome; }
    public String getClasse() { return classe; }
    public String getFamilia() { return familia; }
    public int getIdade() { return idade; }
    public int getCaloria() { return caloria; }
    public int getForca() { return forca; }
    public boolean isVivo() { return vivo; }

    // Métodos Setters
    public void setCaloria(int caloria) { this.caloria = caloria; }
    public void setForca(int forca) { this.forca = forca; }
    public void setVivo(boolean vivo) { this.vivo = vivo; }
}
