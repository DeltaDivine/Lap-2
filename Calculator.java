/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeginner;

/**
 *
 * @author User
 */
public class Calculator {
    public int plus(int a1, int b1){
//        a1 = 5;
//        b1 = 2;
        return a1 + b1;
    }
    
    public int sub(int a2, int b2){
            return a2 - b2;
        }
    
    public int multiply (int a4, int b4){
        return a4 * b4;
    }
    
    public float divide(int a3, int b3){
            return a3 / b3;
    }
    
    public static void main(String[] args) {
        Calculator calculator  = new Calculator();
        System.out.println("Plus:" + calculator.plus(5, 2));
        System.out.println("Sub:" + calculator.sub(5, 2));
        System.out.println("Multiply:" + calculator.multiply(5, 2));
        System.out.println("Divide:" + calculator.divide(5, 2));
    }
}
