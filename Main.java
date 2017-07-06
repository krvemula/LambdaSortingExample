package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
List<Employees> elist = getEmployees(); //Used list method as maintains indices of its elements 

System.out.println("\n BEFORE SORTING, THE EMPLOYEES DETAILS ARE AS BELOW");
System.out.println("--------------------------------------------------------");
for (Employees emp : elist) {
System.out.println(emp);
}

System.out.println("\n AFTER SORTING, THE EMPLOYEES DETAILS ARE AS BELOW  ");
System.out.println("------------------------------------------------------");

//Sorted Based on Age
System.out.println("\nSorted by Age :");
elist.sort((Employees A, Employees B)->A.getAge()-B.getAge());
elist.forEach((emp)->System.out.println(emp));

//Sorted Based on Last Name
System.out.println("\nSorted by LastName :");
elist.sort((Employees A, Employees B)->A.getLastname().compareTo(B.getLastname()));
elist.forEach((emp)->System.out.println(emp));

//Sorted Based on First Name
System.out.println("\nSorted by FirstName :");
elist.sort((Employees A, Employees B)->A.getFirstname().compareTo(B.getFirstname()));
elist.forEach((emp)->System.out.println(emp));

//Sorted Based on Salary
System.out.println("\nSorted by Salary :");
elist.sort((Employees A, Employees B)->A.getSalary()-B.getSalary());
elist.forEach((emp)->System.out.println(emp));

}


private static List<Employees> getEmployees() {

List<Employees> result = new ArrayList<Employees>();

result.add(new Employees("Radhika","Vemula",6000,24));
result.add(new Employees("Harika","Vemula",5000,22));
result.add(new Employees("Poojitha","Gade",4000,20));
result.add(new Employees("Udaya sree","Gade",3500,17));
return result;

}

}
