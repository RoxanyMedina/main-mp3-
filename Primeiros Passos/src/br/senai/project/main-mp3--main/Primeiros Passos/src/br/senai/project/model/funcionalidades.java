package br.senai.project.model;

public class funcionalidades {
    private int id;
    public String nome;
    public String genero;
    public String album;


    public Music(int id, String nome, String genero, String album) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.album = album;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Album: " + album);
    }
}