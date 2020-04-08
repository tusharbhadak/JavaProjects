/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import security.HashTask;

/**
 *
 * @author root
 */
public class TestHashing {
    
    public static void main(String args[])
    {
        try{
        HashTask h = new HashTask();
        System.out.println(h.generateSha256("admin"));
        
        }
        catch(Exception e)
        {
            
        }
    
}
}
