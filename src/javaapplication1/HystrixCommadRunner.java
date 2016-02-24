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
public class HystrixCommadRunner {
    public <T> T runCommand(HystrixConfig x, HystrixCommand hc) {
        // setup all hystric stuff
        System.out.println("Running command");
        T r =(T) hc.execute(); 
        System.out.println("Running command");
        return r;
    }
}
