/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Visual.ThreadsVisual;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author gerar
 */
public class ProducerConsumer{
  
    LinkedList<Integer> Products = new LinkedList<>();
    int capacity = 10;
    ThreadsVisual interfaz;
    private JLabel label;
    
    public ProducerConsumer(ThreadsVisual interfaz, JLabel label) {
        
        this.interfaz = interfaz;
        this.label = label;
        
    }
    
    public ProducerConsumer() {
    }
    
    public void Producer() throws InterruptedException {
        
        final int product = 0;
        int localValue = product;
        while(true) {
            
            synchronized(this) {
                
                while(Products.size() == capacity) wait();
                
                Products.add(localValue++);
                
                System.out.println("Adding product - " + localValue);
                
                SwingUtilities.invokeLater(() -> {
                    label.setText( "Produced: " + "1");
                });
                

                notify();
               
                Thread.sleep(1000);
            }
            
        }
        
    } //Producer()
    
    public void Consumer() throws InterruptedException {
        
        while(true){
            
            synchronized(this) {
                
                while(Products.isEmpty()) wait();
                
                int val = Products.removeFirst();
                System.out.println("Consuming product - " + val);
                
                notify();
                
                Thread.sleep(1000);
            }
            
            
        }
        
    }
    
}
