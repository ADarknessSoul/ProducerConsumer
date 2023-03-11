/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerar
 */
public class Consumer implements Runnable{

     private final ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }
    
    @Override
    public void run() {
        
        try {
            pc.Consumer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
