/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;

import java.util.Scanner;

/**
 *
 * @author emerson
 */
public class OneTimePad {
    public static void main(String args[])throws Exception
 {
   
   
  String plaintext,key;
  Scanner scn=new Scanner(System.in);
   
   
  System.out.println("Enter plaintext:");
  plaintext=scn.nextLine();
  System.out.println("Enter key:");
  key=scn.nextLine();
 
  OneTimePadCipherImplementation OneTimePad=new OneTimePadCipherImplementation();
   
  String ciphertext=OneTimePad.Encryption(plaintext,key);
   
  System.out.println("Encrpted text is:"+ciphertext);
   
   
  System.out.println("Decrypted text is:"+OneTimePad.Decryption(ciphertext,key));
 
 }
}
