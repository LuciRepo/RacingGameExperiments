package org.fastrackit2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Car car = new Car(2.2, 4);
// aici se construieste, asta e fabrica
        Car secondCar = new Car(4.8, 6);
        car.litersPerKm = 6.5;
        car.removeWheel();
        car.removeWheels(3);
        car.branding();
        Engine engine = new Engine(1799, 136, 290);
        car.engine = engine; //punem motor la masina , ii dam referinta
        // engine = new Engine(110, 32);
        secondCar.engine = engine;
        System.out.println(engine.ccm);
    }
}
