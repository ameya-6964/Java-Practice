class car {

    String name;
    int speed;
    private double average;

    public double getaverage() {
        return average;
    }

    public void setaverage(double average) {
        this.average = average;
    }

    car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

public class vehicles {
    public static void main(String[] args) {
        car Honda = new car("Amaze", 120);
        car Audi = new car("R8", 130);
        car Suzuki = new car("Dzire", 140);
        car Hyundai = new car("I20", 150);
        car Lamborghini = new car("Aventador", 200);

        Honda.setaverage(25.00);
        Audi.setaverage(25.00);
        Suzuki.setaverage(25.00);
        Hyundai.setaverage(25.00);
        Lamborghini.setaverage(10.00);

        System.out.println("Name Of The Car " + Honda.name);
        System.out.println("Speed Of The Car " + Honda.speed + " Km/Hr");
        System.out.println("Average Of The Car " + Honda.getaverage() + " Km/L");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Name Of The Car " + Audi.name);
        System.out.println("Speed Of The Car " + Audi.speed + " Km/Hr");
        System.out.println("Average Of The Car " + Audi.getaverage() + " Km/L");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Name Of The Car " + Suzuki.name);
        System.out.println("Speed Of The Car " + Suzuki.speed + " Km/Hr");
        System.out.println("Average Of The Car " + Suzuki.getaverage() + " Km/L");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Name Of The Car " + Hyundai.name);
        System.out.println("Speed Of The Car " + Hyundai.speed + " Km/Hr");
        System.out.println("Average Of The Car " + Hyundai.getaverage() + " Km/L");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        System.out.println("Name Of The Car " + Lamborghini.name);
        System.out.println("Speed Of The Car " + Lamborghini.speed + " Km/Hr");
        System.out.println("Average Of The Car " + Lamborghini.getaverage() + " Km/L");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
}

/*
 * Output
 * Name Of The Car Amaze
 * Speed Of The Car 120 Km/Hr
 * Average Of The Car 25.0 Km/L
 * ^^^^^^^^^^^^^^^^^^^^
 * Name Of The Car R8
 * Speed Of The Car 130 Km/Hr
 * Average Of The Car 25.0 Km/L
 * ^^^^^^^^^^^^^^^^^^^^
 * Name Of The Car Dzire
 * Speed Of The Car 140 Km/Hr
 * Average Of The Car 25.0 Km/L
 * ^^^^^^^^^^^^^^^^^^^^
 * Name Of The Car I20
 * Speed Of The Car 150 Km/Hr
 * Average Of The Car 25.0 Km/L
 * ^^^^^^^^^^^^^^^^^^^^
 * Name Of The Car Aventador
 * Speed Of The Car 200 Km/Hr
 * Average Of The Car 10.0 Km/L
 * ^^^^^^^^^^^^^^^^^^^^
 */
