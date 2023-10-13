/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author eduardo.3946
 */
public class VisaoMenu {
    public static int menuprincipal(){
        System.out.println("=====================================================================");
        System.out.println("============== SISTEMA DE VENDAS ==============");
        System.out.println("=====================================================================");
        System.out.println("        1 - Cadastro do Produto        ");
        System.out.println("        2 - Alterar Produto        ");
        System.out.println("        3 - Remoçao do Produto        ");
        System.out.println("        4 - Lista de Produtos       ");
        System.out.println("=====================================================================");
        int opcaomenu = new Scanner (System.in).nextInt();
        return opcaomenu;
    }
    
    public static int menuEscolhaProdutos(){
        System.out.println("=====================================================================");
        System.out.println("============== CADASTRAR PRODUTO ==============");
        System.out.println("=====================================================================");
        System.out.println("Qual Categoria de Produto Deseja Cadastrar?");
        System.out.println("=====================================================================");
        System.out.println("        1 - Video Game        ");
        System.out.println("        2 - Computador        ");
        System.out.println("=====================================================================");
        int opcaoproduto = new Scanner(System.in).nextInt();
        
        return opcaoproduto;
    }
    
    public static int menuAlteracaoProdutos(){
        System.out.println("=====================================================================");
        System.out.println("============== ALTERACAO PRODUTO ==============");
        System.out.println("=====================================================================");
        System.out.println("Qual Produto Deseja Alterar?");
        System.out.println("=====================================================================");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i)); 
            
        }
        System.out.println("=====================================================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        System.out.println("==================== ALTERAÇAO DE PRODUTO ==============================");
        if(object instanceof VideoGame){
            
            System.out.println("=====================================================================");
            System.out.println("Novo nome: ");
            ((VideoGame)object).setNome(new Scanner(System.in).nextLine());
            System.out.println("=====================================================================");
            System.out.println("Novo Preço: ");
            ((VideoGame)object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("=====================================================================");
            System.out.println("Nova Plataforma: ");
            ((VideoGame)object).setPlataforma(new Scanner(System.in).nextLine());
            System.out.println("1");
            
        }else if(object instanceof Computador){
            System.out.println("=====================================================================");
            System.out.println("Novo nome: ");
            ((Computador)object).setNome(new Scanner(System.in).nextLine());
            System.out.println("=====================================================================");
            System.out.println("Novo Preço: ");
            ((Computador)object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("=====================================================================");
            System.out.println("Novo Quantidade de Mermoria RAM: ");
            ((Computador)object).setMemoriaRAM(new Scanner(System.in).nextDouble());
            System.out.println("Novo Processador: ");
            ((Computador)object).setProcessador(new Scanner(System.in).nextLine());
            
        }
        return object;
        
    }
    public static int menuremocaoProduto(){
        System.out.println("REMOVER PRODUTO");
        System.out.println("Qual Produto Quer Remover?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
            
        }
        System.out.println("=====================================================================");
        int produtoRemover = new Scanner(System.in).nextInt();
        
        return produtoRemover;
    }
    
}
