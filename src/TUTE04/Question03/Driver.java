package TUTE04.Question03;
import java.util.Scanner;

public class Driver {
 private String driverName;
 private String driverID;
 private double baseSalary;
 private int performanceScore;

 public Driver() {
  this.driverName = "not entered";
  this.driverID = "000";
  this.baseSalary = 000.0;
  this.performanceScore = 1;
 }

 public Driver(String driverName, String driverID) {
  this.driverName = driverName;
  this.driverID = driverID;
 }

 public Driver(double baseSalary) {
  this.baseSalary = baseSalary;
 }

 public Driver(String driverName, String driverID, double baseSalary, int performanceScore) {
  this.driverName = driverName;
  this.driverID = driverID;
  this.baseSalary = baseSalary;
  this.performanceScore = performanceScore;
 }

 public String getDriverID() {
  return driverID;
 }

 public void setDriverID(String driverID) {
  this.driverID = driverID;
 }

 public int getPerformanceScore() {
  return performanceScore;
 }

 public void setPerformanceScore(int performanceScore) {
  int customerScore = 1;
  if (1 <= performanceScore && performanceScore <= 5) {
   this.performanceScore = performanceScore;
  } else
   this.performanceScore = 1;
 }
 public double calculateBonus(){
  double bonusSalary = 0.0;
  if(performanceScore == 1){
   bonusSalary = 0.0 * baseSalary;
  }else if (performanceScore == 2){
   bonusSalary = baseSalary * 10 /100;
  } else if (performanceScore == 3) {
   bonusSalary = baseSalary * 15 /100;
  } else if (performanceScore == 4) {
   bonusSalary = baseSalary * 20 /100;
  }else if (performanceScore == 5) {
   bonusSalary = baseSalary * 25 /100;
  }
  return bonusSalary;
 }
 public double calculateBonus(int customerScore){
  double bonusSalary = 0.0;

  if(customerScore == 1){
   bonusSalary = 0.0 * baseSalary;
  }else if (customerScore == 2){
   bonusSalary = baseSalary * 10 /100;
  } else if (customerScore == 3) {
   bonusSalary = baseSalary * 15 /100;
  } else if (customerScore == 4) {
   bonusSalary = baseSalary * 20 /100;
  }else if (customerScore == 5) {
   bonusSalary = baseSalary * 25 /100;
  }
  double totalSalary = bonusSalary + baseSalary;
  return totalSalary;
 }
public double calculateTotalSalary(){

 double totalSalary = calculateBonus() + baseSalary;
 return calculateTotalSalary();
}

 public void displayDetails() {
  System.out.println("Driver ID: " + driverID);
  System.out.println("Driver Name: " + driverName);
  System.out.println("Base Salary: " + baseSalary);
  System.out.println("Performance Score: " + performanceScore);
  System.out.println("Bonus: " + calculateBonus());
 }

public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     Driver driver1 = new Driver("Virul", "A001",5000.0,4);
     driver1.displayDetails();
     int customerScore = 3;

}
}
