/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Administrator
 */
public class Musica  {
    private String nome;
    private Lancamento lancamento;
    private Compositores compositor;

    public Musica(String nome, Lancamento lancamento, Compositores compositor) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.compositor = compositor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lancamento getLancamento() {
        return lancamento;
    }

    public Compositores getCompositor() {
        return compositor;
    }



}
