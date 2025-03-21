package jc.entities;

public final class Pegasus extends Horse{

public Pegasus(String name){
    
    super(name);
    this.mPosZ = 100;
}

public void fly(int z){
this.mPosZ = z;
 System.out.println("Le Pegase s'eleve dans les airs (Z = "+this.mPosZ+")");
}

private int mPosZ;

 
}







