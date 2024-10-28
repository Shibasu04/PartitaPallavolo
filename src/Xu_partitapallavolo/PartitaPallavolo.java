/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Xu_partitapallavolo;

/**
 *
 * @author Jacopo Xu
 */
public class PartitaPallavolo {

    public static void main(String[] args) {
        
        Giocatore g1 = new Giocatore(1);
        Giocatore g2 = new Giocatore(2);

        Thread t1 = new Thread(g1);
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(g2);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Giocatore "+g1.getIdGiocatore()+", Priorità: "+t1.getPriority()+"Nome: "+t1.getName());
        t1.start();
        
        System.out.println("Giocatore "+g2.getIdGiocatore()+", Priorità: "+t2.getPriority()+"Nome: "+t2.getName());
        t2.start();

    }
}