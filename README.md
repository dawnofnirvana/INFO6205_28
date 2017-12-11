# INFO6205_28
 Summarize of final project
Problem Statement:
  Assuming that there’s one kind of trees growing in the tropical rainforest in the South America,Each tree aims to bask sun light and 
  absorb more  sun power,therefore,they have to grow up as high as they can to get reach of more sun light where the population density 
  is much high.Besides, the more powerful their capacity of absorbing sun power ,the more likely they are going to grow well.
Parameter settings
  So in this case,we have two kind of chromosomes ,one contains gens decide the capacity of absorbing sun power ,the other one contains
  gens decide the power of grow higher,each chromosome is made up with an array of four elements(gen,code in the boolean form).Then each
  individual contains these two chromosomes.The fitness function evaluate each’s fitness by it’s chromosomes’fitness.
Test result 
  *There’s one thing I have to explain first,the selection function comes under the basic concept of Russian Roulette , this means I’m 
  not always selecting the best N’th individuals in the certain generation, though there’s a function sort the individuals by insertion
  sort, but assign the rate of been selected according to their fitness numbers . So under the assumption they generate the next spring 
  in asexual way ,the highest fitness number may disappear due to my selection function mentioned before(One individual has the highest 
  fitness number just means it has the biggest possibility to be selected to generate it’s offspring,where the possibility is not 100% ).
   As we can see from the result ,that the highest fitness number may get a little smaller ,but the average fitness number is become 
   bigger and more stable.That means in the natural world ,the selection phenomenon always makes the population become better .Moreover, 
   if i justify the crossover and mutate rate to a higher level ,the numbers among those  generations may vary more radically
