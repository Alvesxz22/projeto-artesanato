package br.com.senai.infob.backend.projeto_artesanato.models;

public class Artesa {
    // Definicao de comentário
    private Integer id;
    private String nome;
    private String email;

    // construtores
    // método sem parametros
    public Artesa() {
    }

    // metodo com parametros , metodo parametrizado
    public Artesa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
