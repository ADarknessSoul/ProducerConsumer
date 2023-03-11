/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.LinkedList;

/**
 *
 * @author gerar
 */
public class ProducerConsumer{
  
    LinkedList<Integer> Products = new LinkedList<>();
    int capacity = 10;
    
    public void Producer() throws InterruptedException {
        
        int product = 0;
        while(true) {
            
            synchronized(this) {
                
                while(Products.size() == capacity) wait();
                
                Products.add(product++);
                
                System.out.println("Adding product - " + product);
                
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
