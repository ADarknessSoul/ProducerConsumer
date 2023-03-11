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
public class Producer extends MainClass implements Runnable{

    private final ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }
    
    @Override
    public void run() {
        
        try { 
            pc.Producer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
