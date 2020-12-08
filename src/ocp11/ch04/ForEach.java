/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ocp11.ch04;


public class ForEach {
    public void printNames(String [] names){
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);    
        }
        
        for(String name : names){
            System.out.println(names);
        }       
        
        for(var name : names){
            System.out.println(names);
        }       
        
    }
    public static void main(String[] args) {
        
    }
    
}
