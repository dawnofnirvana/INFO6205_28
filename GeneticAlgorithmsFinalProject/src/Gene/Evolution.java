/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gene;

import static Utilities.Function.InsertionSort;
import static Utilities.Function.crossover;
import static Utilities.Function.mutation;

/**
 *
 * @author Administrator
 */
public class Evolution {
    private static int counter;
    private Population p=new Population();
    private int id;
    public Evolution(Population pp){
  p.initialize(pp.getSize());
  Individual[] a=pp.getPops();
         InsertionSort(a);    
//                   for(int i=0;i<a.length;i++)System.out.println(i+1+" :"+a[i].fitness());
//         System.out.println(p.getBestIndividual().toString()+" "+ p.getBestIndividual().fitness()+" "+a[0].fitness());
         pp.selection();
//           System.out.println(p.getBestIndividual().toString()+" "+ p.getBestIndividual().fitness());
         Individual[] b=pp.getBestpops();
//          for(int i=0;i<b.length;i++)System.out.println(i+1+" :"+b[i].fitness());
Individual[] te=pp.getPops();
        for(int i=0;i<b.length;i++)
        { te[i]= crossover(b[i]);
        mutation(te[i]);} 
        for(int i=b.length;i<pp.getSize();i++)
            te[i]=b[i-b.length];
        p.setPops(te);
        this.id=++counter;
  }

    public Population getP() {
        return p;
    }

    public void setP(Population p) {
        this.p = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
