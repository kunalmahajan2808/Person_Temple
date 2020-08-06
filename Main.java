/*
    Name : Kunal Shaligram Mahajan
    Assignee : Flentas Technologies Private Limited
    Email ID : kunalmhjn2808@gmail.com
    Mob : 9834369074
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        int no_of_test_cases, person, total_cost = 0;
        
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of test cases :");
        no_of_test_cases = sc.nextInt(); //Number of test cases
        
        while(no_of_test_cases > 0){
            System.out.println("Enter no. of person :");
            person = sc.nextInt(); //Number of person going to temple
        
            int a[] = new int[person];
            
            System.out.println("Enter cost per person : ");
            for(int i = 0; i < person; i++){
                a[i] = sc.nextInt(); //Cost value per person
            }

            int tempPerson = a[0];

            for(int i = 0; i < person; i++){
                if(i == person-1){
                    System.out.println("Total Cost : "+ total_cost); //Total Cost
                }
                else{
                    if(tempPerson < a[i+1]){
                        total_cost = total_cost + tempPerson;
                        temp = a[i+1];
                        tempPerson = temp;
                    }
                    else{
                        total_cost = total_cost + a[i+1];
                        temp = tempPerson;
                        tempPerson = temp;
                    }
                    
                    if(tempPerson != a[person-1]){
                        total_cost = total_cost + temp; //Cost value of returning person added to total cost
                    }
                }
            }
            
            total_cost = 0;
            no_of_test_cases--;
        }
	}
}