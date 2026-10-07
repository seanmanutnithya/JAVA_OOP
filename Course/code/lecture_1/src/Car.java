package  lecture_1.src;
class Car {
    int speed;
    String model;
    boolean isRunning;
    int fuelLevel;

    void drive(){
        speed = 1;
    }
    void stop(){
        speed = 0;
    }
    void speedUp(){
        speed = speed + 1;
    }
    int checkFuel(){
        return fuelLevel;
    }
}