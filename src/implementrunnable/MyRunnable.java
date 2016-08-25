/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementrunnable;


/**
 *
 * @author Lenovo
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int iterations = 5;
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println(i);
                Thread.sleep(2000);
                
            }
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException);
        }
    }
    
}
