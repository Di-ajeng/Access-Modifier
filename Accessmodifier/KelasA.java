/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessmodifier;

/**
 *
 * @author User
 */
public class KelasA {
 int memberA = 26;
 
  char memberB = 'A';
    double memberC = 1.5;
    
    int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
    
}
