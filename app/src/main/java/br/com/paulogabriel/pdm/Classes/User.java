package br.com.paulogabriel.pdm.Classes;



public class User {
    public String nome;
    public String sobrenome;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String nomeC, String sobrenomeC) {
        this.nome = nomeC;
        this.sobrenome = sobrenomeC;
    }
}
