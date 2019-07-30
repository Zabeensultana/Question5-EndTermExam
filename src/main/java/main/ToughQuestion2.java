package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	
                        	int t=cal.calculateCalories(bread);
                        	System.out.printf("%.3f",cal.calculateEnergy(t));
                            System.out.println(" kJ of energy generated from "+cal.returnCalories(t)+" calories");
                        	break;
                        	
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for only bread & jam
                        	
                        	int r=cal.calculateCalories(bread,jam);
                        	System.out.printf("%.3f",cal.calculateEnergy(r));
                            System.out.println(" kJ of energy generated from "+cal.returnCalories(r)+" calories");
                        	break;
                        	
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	int p=cal.calculateCalories(bread,jam,butter);
                        	System.out.printf("%.3f",cal.calculateEnergy(p));
                            System.out.println(" kJ of energy generated from "+cal.returnCalories(p)+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",cal.calculateEnergy(b));
                       // System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
            }
}
class Calories {
            
           int calculateCalories(int bread) {
            	int b=74*bread;
            //you have to overload this function for three parameters refer the question
            	return b;
            }
           
           int calculateCalories(int bread,int jam) {
           
           	int b=(74*bread)+(26*jam);
           
           //you have to overload this function for three parameters refer the question
           return b;
           }
           
          int calculateCalories(int bread,int jam,int butter) {
              	
              	int b=(74*bread)+(26*jam)+(102*butter);
              
              //you have to overload this function for three parameters refer the question
              	return b;
              }
           double returnCalories(double b)
           {
        	   return b;
           }
           
           double calculateEnergy(double b)
           {
        	   return b=b*4.1868;
           }
           
}