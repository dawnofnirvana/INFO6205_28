/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gene;
import Utilities.Function;
import java.util.HashMap;
/**
 *
 * @author Administrator
 */
public class Individual {
    private Chromosome c1;//Chromosome decide capacity of using sun power
    private Chromosome c2;//Chromosome decide height
//    HashMap<String,Chromosome> geno=new HashMap<>();
    public Individual() {
//      c1=new Chromosome();
//    c2=new Chromosome();
//   geno.put("Absortion", c1);
//   geno.put("Growing", c2);
    }
public void generate(){
 c1=new Chromosome();
c2=new Chromosome();
//   geno.put("Absortion", c1);
//   geno.put("Growing", c2);
}
    public Chromosome getC1() {
        return c1;
    }

    public void setC1(Chromosome c1) {
        this.c1 = c1;
    }

    public Chromosome getC2() {
        return c2;
    }

    public void setC2(Chromosome c2) {
        this.c2 = c2;
    }
//
//    public HashMap<String, Chromosome> getGeno() {
//        return geno;
//    }
//
//    public void setGeno(HashMap<String, Chromosome> geno) {
//        this.geno = geno;
//    }
  
    
    public double fitness(){
    return Math.pow(c1.fitnessOfChromosome(),0.5)+Math.pow(c2.fitnessOfChromosome(),0.5)+0.75*c1.fitnessOfChromosome()*c2.fitnessOfChromosome();
    }
    
   public String toString(){
   return c1.toString()+"  "+c2.toString();
   }
}
