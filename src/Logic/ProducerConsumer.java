/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Visual.ThreadsVisual;
import java.util.LinkedList;
import java.util.Random;
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
    private JLabel labelC;
    private JLabel labelS;
    private JLabel[] boxes;
    
    public ProducerConsumer(ThreadsVisual interfaz, JLabel label, JLabel labelC, JLabel labelS, JLabel[] boxes) {
        
        this.interfaz = interfaz;
        this.label = label;
        this.labelC = labelC;
        this.labelS = labelS;
        this.boxes = boxes;
    }
    
    public ProducerConsumer() {
    }
    
    public void Producer() throws InterruptedException {
        
        int localValue = 0;
        int aux = 0;
        int random;
        System.out.println(boxes[0]);
        while(true) {
            
            synchronized(this) {
                
                while(Products.size() == capacity) wait();
                
                Products.add(localValue++);
                
                System.out.println("Adding product - " + localValue);
                label.setText(Integer.toString(localValue));
                aux = Integer.parseInt(labelS.getText()) + 1;
                labelS.setText(Integer.toString(aux));
                random = getRandom(0, 15);
                boxes[random].isDisplayable();
                

                notify();
               
                Thread.sleep(1000);
            }
            
        }
        
    } //Producer()
    
    public void Consumer() throws InterruptedException {
        
        int localValue = 0;
        int aux = 0;
        while(true){
            
            synchronized(this) {
                
                while(Products.isEmpty()) wait();
                
                int val = Products.removeFirst();
                System.out.println("Consuming product - " + val);
                labelC.setText(Integer.toString(++localValue));
                aux = Integer.parseInt(labelS.getText()) - 1;
                labelS.setText(Integer.toString(aux));
                
                notify();
                
                Thread.sleep(1000);
            }
            
            
        }
        
    }
    
    public int getRandom(int min, int max) {
        
        Random random = new Random();
        return random.nextInt(max - min) + min;
        
    }
    
}
