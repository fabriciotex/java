/*************************************************************/
/* Program: BasketBall                                       */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 4/6/2017                                                  */
/* This class inherits from the Ball class and build the     */
/* object using its constructor.                             */
/*************************************************************/

public class BasketBall extends Ball {
   // constructor
   public BasketBall() {
      this.setName("");
      this.setColor("");
      this.setRadius(0);
      this.calculateVolume();
   }
   
   // overloaded constructor
   public BasketBall(String name, String color, double radius) {
      this.setName(name);
      this.setColor(color);
      this.setRadius(radius);
      this.calculateVolume();
   }
}