package com.employee;
public class Employee {
private int Id;
   private String Name;
   private String City;
   private int Age;
   private double Salary;
   
   public Employee(){

   }

public Employee(int id, String name, String city, int age, double salary) {
	super();
	Id = id;
	Name = name;
	City = city;
	Age = age;
	Salary = salary;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [Name=" + Name + ", City=" + City + ", Age=" + Age + ", Salary=" + Salary + "]";
}
   
}
