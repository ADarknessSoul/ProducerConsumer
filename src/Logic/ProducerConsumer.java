/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Visual.ThreadsVisual;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
    private int velocidad = 1000;
    private JLabel labelAc;
    private JTextField txtAc;
    private int overflow = 0;
    
    public ProducerConsumer(ThreadsVisual interfaz, JLabel label, JLabel labelC, JLabel labelS, JLabel[] boxes, int capacidad, int velocidad, JLabel labelAc, JTextField txtAc) {
        
        this.interfaz = interfaz;
        this.label = label;
        this.labelC = labelC;
        this.labelS = labelS;
        this.boxes = boxes;
        this.capacity = capacidad;
        this.velocidad = velocidad;
        this.labelAc = labelAc;
        this.txtAc = txtAc;
    }
    
    public ProducerConsumer() {
    }
    
    public void Producer() throws InterruptedException {
        
        int localValue = 0;
        int aux = 0;
        System.out.println(boxes[0]);
        while(true) {
            
            synchronized(this) {
                
                while(Products.size() == capacity) wait();
                
                Products.add(localValue++);
                
                System.out.println("Adding product - " + localValue);
                label.setText(Integer.toString(localValue));
                aux = Integer.parseInt(labelS.getText()) + 1;
                labelS.setText(Integer.toString(aux));     

                   for(int i = 0; i < capacity; i++) {
                   
                       if(i <= 15){
                          
                            if(!boxes[i].isVisible()) {
                                
                                boxes[i].setVisible(true);
                                break;

                            } 
                           
                       } else if(i > 15){
                           
                           if(!labelAc.isVisible()) labelAc.setVisible(true);
                           if(!txtAc.isVisible()) txtAc.setVisible(true);
                                                      
                           txtAc.setText(Integer.toString(++overflow));
                           break;
                           
                       }

              
                    }



                notify();
               
                Thread.sleep(velocidad);
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

                for(int i = 0; i < capacity; i++) {
                   
                    if(i <= 15 && overflow == 0) {
                        
                        if(boxes[i].isVisible()) {

                            boxes[i].setVisible(false);

                            if(overflow != 0) txtAc.setText(Integer.toString(--overflow));
                            if(overflow == 0){

                                if(labelAc.isVisible()) labelAc.setVisible(false);
                                if(txtAc.isVisible()) txtAc.setVisible(false);

                            }

                            break;
                         }   
                          
                        
                    } else if(i > 15){
                        
                        if(overflow != 0) txtAc.setText(Integer.toString(--overflow));
                        if(overflow == 0){

                            if(labelAc.isVisible()) labelAc.setVisible(false);
                            if(txtAc.isVisible()) txtAc.setVisible(false);

                        }
                        break;
                        
                    }
                    
                   
                   
               }
                
                notify();
                
                Thread.sleep(velocidad);
            }
            
            
        }
        
    }
    
     public int getRandom(int min, int max) {
        
        Random random = new Random();
        return random.nextInt(max - min) + min;
        
    }
    
}
