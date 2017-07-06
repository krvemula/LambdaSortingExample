package com.lambdaexpressions;

public class Employees {
public String firstname;
public String lastname;
public int salary;
public int age;
public Employees (String firstname, String lastname, int salary, int age) {
super();
this.firstname = firstname;
this.lastname = lastname;
this.salary = salary;
this.age = age;
}
public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public int getSalary() {
return salary;
}
public void setSalary(int salary) {
this.salary = salary;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String toString() {
   return "FirstName :" + firstname + ", LastName :" + lastname + ", Salary :" +  salary + ", Age :" +age;
 }
}