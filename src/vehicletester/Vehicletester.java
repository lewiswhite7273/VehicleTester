/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

/**
 *
 * @author lewhi7273
 */
import java.util.Scanner;
import javax.swing.*;

public class Vehicletester  {
  public static void main(String[] args) {
      int pas;
      double cost, fuel,finalcost;
      Scanner input = new Scanner(System.in);
      System.out.println("How many passengers are there?: ");
      pas = input.nextInt();
      System.out.println("How much will each passenger pay?:");
      cost = input.nextInt();
      finalcost = cost * pas;
      //display the total cost
      System.out.println("The total cost will be "+pas+ " * "+ cost+" for a total of " +finalcost);
      
      System.out.println("How much will fuel cost today per KM?");
      fuel = input.nextDouble();
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0, pas, cost, fuel);
    //Show Vehicle Info
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Try to drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Try to add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);
  }
}

