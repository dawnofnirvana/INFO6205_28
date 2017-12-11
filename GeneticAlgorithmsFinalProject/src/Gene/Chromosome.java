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
public class Chromosome {
   
    private Genes gen;
//    String name;

    public Chromosome() {
        gen=new Genes();
   
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//     
   public int fitnessOfChromosome(){
        return gen.getNumber();
       
   }
        
//        for(int i=0;i<length;i++)
//            System.out.println(genes[i]);

    public Genes getGen() {
        return gen;
    }

    public void setGen(Genes gen1) {
        this.gen = gen1;
    }

public void copyGen(Genes gen1){
this.gen.copygene(gen1.getGenes());
}  


     
  public void mutation(double n){
  gen.mutation(n);
  }
     public String toString(){
     return gen.toString();
     }
}
