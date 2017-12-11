/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gene;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Genes {
     private final int length=4;
     private  boolean[] genes = new boolean[length];

    public Genes() {
        generategene();
    }
       public  void generategene(){
        for (int i = 0; i < length; i++) {
            Random r=new Random();
            boolean gene = r.nextBoolean();
            genes[i] = gene;
            }
       }

    public boolean[] getGenes() {
        return genes;
    }

    public void setGenes(boolean[] genes) {
        this.genes = genes;
    }
    
     public void copygene(boolean[] genes1){
     for(int i=0;i<length;i++)
         genes[i]=genes1[i];
     }
    public boolean getgene(int n){
       
    return genes[n];
    }
    public void setgene(int n,boolean b){
    genes[n]=b;
    }
       public int getNumber(){
           StringBuffer s=new StringBuffer();
           int a;
           for(int i=0;i<length;i++)
           {   a=(genes[i]==true?1:0);
               s.append(Integer.toString(a));}
           String s1=s.toString();
           Random r=new Random();
       int b=Integer.valueOf(s1,2);
       return b;
       
       }
       
       public void mutation(double s){
    for(int i=0;i<length;i++){
    Random r=new Random();
    Double d=r.nextDouble();
    if(d<=s){
   genes[i]=false;
    }
    }
       
       }
     @Override
       public String toString(){
        StringBuffer s=new StringBuffer();
        int a;
           for(int i=0;i<length;i++)
              {   a=(genes[i]==true?1:0);
               s.append(Integer.toString(a));}
           String s1=s.toString();
           return s1;
       }
}
