package org.fastrackit2;
//aici se proiecteaza
public class Car {
    int wheelsCount;
    double lenght;
    Boolean hasPanoramicRoof;
    char initial;
    String brand =null;
    double litersPerKm;
    Engine engine;
    public Car(double lng,int whC) {
        lenght=lng;
        wheelsCount=whC;
    }

    public void removeWheel() {
        wheelsCount = wheelsCount - 1;
    }
    public void removeWheels(int count){
        wheelsCount=wheelsCount-count;
    }
    public void branding() {
        brand = "Mercedes";
        // brand="Audi";
        //brand="Dacia";
    }
}
