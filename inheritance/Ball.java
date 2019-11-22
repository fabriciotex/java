/*************************************************************/
/* Program: Ball                                             */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 4/6/2017                                                  */
/* This abstract class defines the methods and variables     */
/* that will be used.                                        */
/*************************************************************/

abstract class Ball {
   // create variables
   private String name;
   private String color;
   private double radius;
   private double volume;
   
   // set name value
   public void setName(String name) {
      this.name = name;
   }
   
   // set color value
   public void setColor(String color) {
      this.color = color;
   }
   
   // set radius
   public void setRadius(double radius) {
      this.radius = radius;
   }
   
   // set volume value
   public void setVolume(double volume) {
      this.volume = volume;
   }
   
   // calculate the volume and sets into the volume variable
   public void calculateVolume() {
      this.volume =  (4.0/3) * Math.PI * Math.pow(this.radius, 3);
   }
   
   // return the name value
   public String getName() {
      return this.name;
   }
   
   // return the color value
   public String getColor() {
      return this.color;
   }
   
   // return the radius value 
   public double getRadius() {
      return radius;
   }
   
   // return the volume value
   public double getVolume() {
      return this.volume;
   }
   
   // print info on screen
   public void printInfo() {
      System.out.printf("A %s has a predominant %s color,  a radius of %.2f inches and a volume of %.2f cubic inches.\n", this.name, this.color, this.radius, this.volume);
   }
}