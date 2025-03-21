package jc.entities;

 public class Horse {

    public Horse(String name){
      this.mName = name;
      this.mPosX = 50;
      this.mPosY = 50;
    }
    
 public final void move(int x, int y){
    this.mPosX = x;
    this.mPosY = y;
    
 }

 protected String mName;
 protected int mPosX;
 protected int mPosY;
 
  }