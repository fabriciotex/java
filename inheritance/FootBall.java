/*************************************************************/
/* Program: FootBall                                         */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 4/6/2017                                                  */
/* This class inherits from the Ball class and build the     */
/* object using its constructor.                             */
/*************************************************************/

public class FootBall extends Ball {
   // creates specific variables for radius in a football
   private double radiusA,
                  radiusB;

   // constructor
   public FootBall() {
      this.setName("");
      this.setColor("");
      this.setRadius(0, 0);
      this.calculateVolume();
   }
   
   // overloaded constructor
   public FootBall(String name, String color, double radiusA, double radiusB) {
      this.setName(name);
      this.setColor(color);
      this.setRadius(radiusA, radiusB);
      this.calculateVolume();
   }
   
   // set radius values
   public void setRadius(double radiusA, double radiusB) {
      this.radiusA = radiusA;
      this.radiusB = radiusB;
   }
   
   // overrides the calculateVolume() method for football
   @Override
   public void calculateVolume() {
      this.setVolume((4.0/3) * Math.PI * this.radiusA * this.radiusB * this.radiusB);
   }
   
   // overrides the printInfo() method and prints different content on screen
   @Override
   public void printInfo() {
      System.out.printf("A %s has a predominant %s color and has a radius of %.2f and %.2f inches and a volume of %.2f cubic inches.\n", this.getName(), this.getColor(), this.radiusA, this.radiusB, this.getVolume());
   }

}