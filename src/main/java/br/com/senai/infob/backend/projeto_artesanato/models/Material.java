package br.com.senai.infob.backend.projeto_artesanato.models;

public class Material {
    private Integer id;
    private String nome;
    private Double preco;
    public Material() {
    }
    public Material(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
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
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
// numeric => Double
// varchar, char, text => String
//date => LocalDate 
//timestamp=> LocalDateTime
// serial => Integer 
// int => int
// boolean => Boolean ou boolean 
    
}
