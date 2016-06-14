/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;

/**
 *
 * @author emerson
 */
public class OneTimePadCipherImplementation {
    String Encryption(String plaintext,String key)
 {
  plaintext=plaintext.toLowerCase();
  msg m1=new msg();
  int pt[]=new int[plaintext.length()];
  int k[]=new int[key.length()];
  int ct[]=new int[plaintext.length()];
   
  for(int i=0;i < plaintext.length();i++)
  {
   pt[i]=m1.Ipos(plaintext.charAt(i));
  }
  for(int i=0;i < key.length();i++)
  {
   k[i]=m1.Ipos(key.charAt(i));
  }
  int j=0;
  for(int i=0;i < plaintext.length();i++)
  {
   ct[i]=pt[i]+k[j];
   j++;
   if(j==key.length())
    j=0; 
   if(ct[i]>26)
    ct[i]=ct[i]%26;
  }
  String cipher="";
  for(int i=0;i < plaintext.length();i++)
  {
   cipher+=m1.Cpos(ct[i]);
  }
   
  return cipher;
 }
  
  
  
 String Decryption(String ciphertext,String key)
 {
  String plaintext="";
  msg m1=new msg();
  int pt[]=new int[ciphertext.length()];
  int k[]=new int[key.length()];
  int ct[]=new int[ciphertext.length()];
   
  for(int i=0;i < ciphertext.length();i++)
  {
   ct[i]=m1.Ipos(ciphertext.charAt(i));
  }
  for(int i=0;i < key.length();i++)
  {
   k[i]=m1.Ipos(key.charAt(i));
  }
  int j=0;
  for(int i=0;i < ciphertext.length();i++)
  {
   pt[i]=ct[i]-k[j];
   j++;
   if(j==key.length())
    j=0; 
   if(pt[i] < 0)
    pt[i]+=26;
  }
  String cipher="";
  for(int i=0;i < ciphertext.length();i++)
  {
   plaintext+=m1.Cpos(pt[i]);
  }
  return plaintext;
 }
}
