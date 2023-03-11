/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author gerar
 */
public class MainClass {
    
    public static void main(String[] args) throws InterruptedException {
        
        ProducerConsumer pc = new ProducerConsumer();
        
        Producer runnable1 = new Producer(pc);
        Consumer runnable2 = new Consumer(pc);
        
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
    
}
