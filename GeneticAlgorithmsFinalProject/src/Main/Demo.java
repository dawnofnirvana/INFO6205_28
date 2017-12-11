/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Gene.*;
import Utilities.Function;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Demo {
   static  Function f=new Function();
    
       public  static void main(String[] args){
           Scanner s=new Scanner(System.in);
        System.out.println("Please type in the number of generations:");
//        int ng=s.nextInt();
int ng=100;
         System.out.println("Please type in the number of initial number of individuals of the first generation:");
//         int ni=s.nextInt();
int ni=50;
           Population p=new Population();
         p.initialize(ni);
         p.generate();
         for(int i=1;i<=ng;i++)
         {Evolution e=new Evolution(p);
         System.out.println(e.getId()+":"+"The fitnessed of the best and the average"
                 + " are:"+e.getP().getBestIndividual().fitness()+"  "+e.getP().getAverageFitness());
         p=e.getP();
         }
      }
}
