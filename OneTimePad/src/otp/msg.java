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
public class msg {
    int a=97;
 char all[]=new char[27];
 
 msg()
 {
  for(int i=0;i < 26;i++)
  { 
   all[i]=(char)a;
   a++; 
  }
 }
 
 int Ipos(char c)
 {
  int i=0;
  for(;i < 26;i++)
  {
   if(all[i]==c)
   {
    break;
   }
  }
  return i;
 }
  
 char Cpos(int c)
 {
  int i=0;
  for(;i < c;i++)
  {
    
  }
  return all[i];
 }
    
}
