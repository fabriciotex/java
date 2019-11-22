/*
Program:       Undergraduate
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Undergraduate object, that inherit
               from the Student class and specifies the level.
*/

public class Undergraduate extends Student {
   // 1 - freshman, 2 - sophomore, 3 - junior, 4 - senior
   private int level;
   
   // default constructor
   public Undergraduate() {
      super();
      this.setLevel(1);
   }
   
   // overloaded constructor
   public Undergraduate(String name, int number, int level) {
      super(name, number);
      this.setLevel(level);
   }
   
   // mutator - change undergraduate name, number and level
   public void reset(String name, int number, int level) {
      this.reset(name, number);
      this.setLevel(level);
   } 
   
   // mutator - change only undergraduate's level
   public void setLevel(int level) {
      if ((level >= 1) && (level <= 4)) {
         this.level = level;
      } else {
         System.out.println("Illegal level!");
         System.exit(0);
      }
   }
   
   // accessor - get the undergraduate's level
   public int getLevel() {
      return this.level;
   }
   
   // overrides the write output method to outputs the information for the user
   @Override
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Undergraduate level: " + this.getLevel());
   }
   
   // check if there's an undergraduate with same name and same number
   public boolean equals(Undergraduate otherUndergraduate) {
      return (super.equals(otherUndergraduate) && (this.getLevel() == otherUndergraduate.getLevel()));
   }
   
   // overrides object toString() method
   @Override
   public String toString() {
      return super.toString() + "\nUndergraduate level: " + this.getLevel();
   }

}