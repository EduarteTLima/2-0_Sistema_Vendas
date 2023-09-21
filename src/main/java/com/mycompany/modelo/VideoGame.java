/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author eduardo.3946
 */
public class VideoGame extends Produtos {
    private String Plataforma;

    public VideoGame() {
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
                "| Preço: " + super.getPreco() +
                "| Plataforma: " + this.Plataforma;
    }
    
}
