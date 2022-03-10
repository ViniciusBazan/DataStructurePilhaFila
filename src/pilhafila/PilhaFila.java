/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhafila;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Vinícius Verissimo Bazan
 */
public class PilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Criando nossos objetos de Pilha e Fila

    LinkedList<Integer> lista = new LinkedList<Integer>();
    Stack<Integer> pilha = new Stack<Integer>();

    // Inserindo valores iniciais na nossa lista
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);


    // Listando nossa lista do começo até o fim
    System.out.println(">> Nossa lista tem os elementos: ");
    for(int i = 0; i < lista.size(); i++){
      System.out.println("e"+i+": "+lista.get(i));
}

    System.out.println("");

    // Entrando com itens da lista na pilha
    while(!lista.isEmpty()){
      pilha.push(lista.getFirst());
      lista.removeFirst();
      }

    // Voltando os elementos da pilha na fila e adicionando mais 5 números
    while(!pilha.isEmpty()){
      lista.add(pilha.pop());
    }

    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    lista.add(10);

    System.out.println(">> Nossa lista atual tem os elementos: ");
    for(int i = 0; i < lista.size(); i++){
      System.out.println("e"+i+": "+lista.get(i));
    }
       
    }
    
}
