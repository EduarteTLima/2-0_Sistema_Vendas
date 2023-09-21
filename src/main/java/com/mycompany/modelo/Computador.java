/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author eduardo.3946
 */
public class Computador extends Produtos{
    private Double memoriaRAM;
    private String Processador;

    public Computador() {
    }

    public Double getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Double memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String Processador) {
        this.Processador = Processador;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
                "| Preço: " + super.getPreco() +
                  "| MemoriaRAM: " + this.memoriaRAM +
                  "| Processador: " + this.Processador;
                
    }
    
}
