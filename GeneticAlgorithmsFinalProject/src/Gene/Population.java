/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gene;

import static Utilities.Function.InsertionSort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Administrator
 */
public class Population {
    private int size;//the number of each population
//    private Individual bestIndividual;//the individual with the best fitness;
    private Individual[] pops;//all individuals in this group
    private Individual[] bestpops;//individuals after selection;
    private Individual[]  temp;//array used for selection
    private static int num;
    public Population() {
//        this.temp=new ArrayList<>();
    }

    public void settleTemp(int n){    
//    if(temp.size()!=0)
//    {for(int i=temp.size()-1;i>=0;i--)temp.remove(i);
//    }
temp=new Individual[n];
        for(int i=0;i<n;i++)
            temp[i]=pops[i];
    }
    public Individual[] getTemp() {
        return temp;
    }

    public void setTemp(Individual[] temp) {
        this.temp = temp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Individual getBestIndividual() {
       if(issorted())
        return pops[size-1];
       else {InsertionSort(pops);
       return pops[size-1];}
    }

   public Individual getWorstIndividual() {
       if(issorted())
        return pops[0];
       else {System.out.println("This population has not been sorted!");
       return null;}
    }

   public double getAverageFitness(){
  double n=0;
       for(int i=0;i<size;i++)n+=pops[i].fitness();
       return n/size;
   }
   
    public Individual[] getPops() {
        return pops;
    }

    public void setPops(Individual[] pops) {
        this.pops = pops;
    }

    public Individual[] getBestpops() {
        return bestpops;
    }

    public void setBestpops(Individual[] bestpops) {
        this.bestpops = bestpops;
    }
    
    public void initialize(int n){
        this.size=n;
        num=n;
    pops=new Individual[size];
    
    }//initialize the population
    public void generate(){
       int i=0;
    while(i<size){
    pops[i]=new Individual();
    pops[i++].generate();
    }}
    public boolean issorted(){
    int i=0;
        while(i<pops.length-1){
        if(pops[i].fitness()>pops[i+1].fitness())return false;
        i++;
        }
        return true;
    }//check if the array is sorted
    
    public void selection(){
    if(size>0){
    int ns=size/2;
    settleTemp(size);
    bestpops=new Individual[ns];
    for(int i=0;i<ns;i++)
    { bestpops[i]=selectIndividual();num--;}
//    settleTemp();
    }else System.out.println("There's no individual here!");
    }
   
    public Individual selectIndividual(){
//    Individual te=new Individual();
    double culminativefitness=0;
    double se=0;
    double n=Math.random();
    for(int i=0;i<num;i++)culminativefitness+=temp[i].fitness();
    for(int i=0;i<num;i++)
    {se=se+temp[i].fitness()/culminativefitness;
    if(se>=n){
     Individual ind=temp[i];
     temp[i]=temp[num-1];
     temp[num-1]=ind;
    return temp[num-1];}
    }

    return null;
    }
 
    
}
