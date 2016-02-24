/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sahmed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Babu b = new Babu();
        b.setName("babu");
        Babu bb = JavaApplication1.pp(b);
        System.out.println(b.getName());
    }
    
    public static Babu pp(final Babu m) {
        HystrixCommadRunner gg = new HystrixCommadRunner();
        
      return new HystrixCommadRunner().<Babu>runCommand(new HystrixConfig(), 
                new HystrixCommand() {

            @Override
            public Babu execute() {
                return m;
            }
        });

    }
    
}
