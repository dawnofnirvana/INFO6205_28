/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Gene.*;
import java.util.Random;


/**
 *
 * @author Administrator
 */
public class Function {
    private static double pm=0.05;//the possibility of mutation
    public static double pc=0.2;//the possibility of crossover
    
    public static Individual crossover(Individual a){
   
    Individual b=new Individual();
    
    b.generate();
    b.getC1().copyGen(a.getC1().getGen());
    b.getC2().copyGen(a.getC2().getGen());
    boolean[] b1=b.getC1().getGen().getGenes();
    boolean[] b2=b.getC2().getGen().getGenes();
    int n=b.getC1().getGen().getGenes().length;
    for(int i=0;i<n;i++){
    Random r=new Random();
    Double d=r.nextDouble();
    if(d<=pc){
    boolean bb=b1[i];
    b1[i]=b2[i];
    b2[i]=bb;
    }
    }
    return b;
    }
   
    public static void mutation(Individual a){
     a.getC1().mutation(pm);
    a.getC2().mutation(pm);

    }
    
  public static void InsertionSort(Individual[] a){
      int n=a.length;
      for(int i=1;i<n;i++)
      {for(int j=i;j>0&&a[j].fitness()<a[j-1].fitness();j--)
      {
          Individual s=a[j];
          a[j]=a[j-1];
          a[j-1]=s;
      }
      }
  
  }
  
}
