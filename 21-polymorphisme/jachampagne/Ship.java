package jachampagne;
 
 public class Ship extends Vehicle implements Flyable{

     public Ship(){

         this.mMovementSpeed = 16;
     }
 
     public void moveXY(int x, int y){

         System.out.println("Le navire brasse les flots et se deplace en " + x + ", " + y);
     }
     
     public void fly(){
        System.out.println("le navire est propulse dans les airs");
     }
 }