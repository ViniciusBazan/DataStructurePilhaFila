/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhafila;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;

/**
 *
 * @author Vinícius Verissimo Bazan
 */
public class PilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Criando nossos objetos de Lista, Pilha e Fila

        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayQueue<Integer> fila = new ArrayQueue<>(10);

        System.out.println(">> Objetos Vazios: ");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");

        // Inserindo valores iniciais na nossa lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(">> Inserindo 5 nº na lista");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");


        // Lista para Pilha
        while(!lista.isEmpty()){
            pilha.push(lista.get(0));
            lista.remove(0);
        }

        System.out.println(">> Incrementando a Pilha e esvaziando a Lista");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");


        // Pilha para fila
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        System.out.println(">> Incrementando a Fila e esvaziando a Pilha");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");


        // Inserindo mais dados na Lista
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        System.out.println(">> Inserindo dados na Lista");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");


        // Lista para Pilha
        while(!lista.isEmpty()){
            pilha.push(lista.get(0));
            lista.remove(0);
        }

        System.out.println(">> Incrementando a Pilha e esvaziando a Lista");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");


        // Pilha para fila
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

        System.out.println(">> Incrementando a Fila e esvaziando a Pilha");
        System.out.println("Lista[Capacidade - 5e]: "+lista);
        System.out.println("Pilha[Capacidade - 5e]: "+pilha);
        System.out.println("Fila[Capacidade - 10e]: "+fila);
        System.out.println("");
    
    }
    
}
