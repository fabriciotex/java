/************************************************************/
/* Program: Car                                             */
/* CIS163AA                                                 */
/* Fabricio Teixeira                                        */
/* 3/12/2017                                                */
/* This class creates a car with year, make, model, color   */
/* and top speed fields.                                    */
/************************************************************/

public class Car{
   private int year;
   private String make;
   private String model;
   private String color;
   private double topSpeed;
   
   // Car constructor
   public Car() {
      this.year = 2016;
      this.make = "Toyota";
      this.model = "Camry";
      this.color = "Silver";
      this.topSpeed = 140.0;
   }
   
   // set new year value
   public void setYear(int year) {
      this.year = year;
   }
   
   // set new make value
   public void setMake(String make) {
      this.make = make;
   }
   
   // set new model value
   public void setModel(String model) {
      this.model = model;
   }
   
   // set new color value
   public void setColor(String color) {
      this.color = color;
   }
   
   // set new top speed value
   public void setTopSpeed(double topSpeed) {
      this.topSpeed = topSpeed;
   }
   
   // get year value
   public int getYear() {
      return this.year;
   }
   
   // get make value
   public String getMake() {
      return this.make;
   }
   
   // get model value
   public String getModel() {
      return this.model;
   }
   
   // get color value
   public String getColor() {
      return this.color;
   }
   
   // get top speed value
   public double getTopSpeed() {
      return topSpeed;
   }
}