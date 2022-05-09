public class DecoratorPatternTest {
    public static void main(String[] args) { System.out.println("This is Decorator Design Pattern :"+"\n");
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble(); System.out.println("\n");
    
    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
    }
    
    }