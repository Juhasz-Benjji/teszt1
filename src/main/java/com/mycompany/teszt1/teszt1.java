/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teszt1;

/**
 *
 * @author Beni meg a faszom
 */
public class teszt1 {
//menj a kurva anyadba buzi netbeansdefwre4
    /**
     *
     * @param args
     */
    public static void main(String args[])
    {
        
        int[][] alm�k = new int[3][3];
        
        for (int i = 0; i < alm�k.length; i++)
        {
            for (int j = 0; j <alm�k.length; j++)
            {
                
                alm�k[i][j] =  i + j;
                System.out.println(alm�k[i][j]);
                
            }
            
        }
        
        
    } 
    
}
