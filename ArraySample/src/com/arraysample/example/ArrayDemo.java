/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arraysample.example;

/**
 *
 * @author OWNER
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] nums ={33,76,45,12,78};
       int length = nums.length;
       
       for(int i =0;i<length;i++){
           System.out.println(nums[i]);
       }
    }
    
}
