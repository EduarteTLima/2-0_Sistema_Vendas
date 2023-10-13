/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author eduardo.3946
 */
public class SistemaVendas_2_0 {
    public static void main(String[] args) {
        int opcaoMenu;
        
        while(true){
            opcaoMenu = VisaoMenu.menuprincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProdutos());
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
   
            }else if(opcaoMenu == Constantes.REMOVER){
                ControleSistema.remover(VisaoMenu.menuremocaoProduto());
                
            }
            
        }
        
    }
    
}