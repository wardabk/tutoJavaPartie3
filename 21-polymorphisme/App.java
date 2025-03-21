import jachampagne.*;

public class App {
    public static void main(String[] args){

    
    Flyable[] elements = {new Ship(), new Cottage(), new Cottage(), new Moto()};

    for(Flyable e : elements)
    e.fly();
   
    }
}