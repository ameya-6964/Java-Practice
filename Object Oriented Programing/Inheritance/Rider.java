class Vehicle {

    int vehicleNumber;
    String brandName;
    int price;
    String ownerName;

    public void start() {
        System.out.println(this.brandName + " Vehicle Has Started");
    }

    public void stop() {
        System.out.println(this.brandName + " Vehicle Has Stopped ");
    }
}

class bike extends Vehicle {
    bike(int vehicleNumber, String brandName, int price, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.brandName = brandName;
        this.price = price;
        this.ownerName = ownerName;
    }

}

public class Rider {
    public static void main(String[] args) {
        bike Honda = new bike(1234, "CBR", 125000, "Ameya");
        bike Bullet = new bike(2345, "Royal Enfield", 225000, "Jayesh");
        bike Scooty = new bike(4445, "Activa", 80000, "Gaurav");

        System.out.println("Brandname " + Honda.brandName);
        System.out.println("Vehicle Number " + Honda.vehicleNumber);
        System.out.println("Vehicle Price " + Honda.price);
        System.out.println("Owner Name " + Honda.ownerName);
        Honda.start();
        Honda.stop();
        System.out.println("*********************");

        System.out.println("Brandname " + Bullet.brandName);
        System.out.println("Vehicle Number " + Bullet.vehicleNumber);
        System.out.println("Vehicle Price " + Bullet.price);
        System.out.println("Owner Name " + Bullet.ownerName);
        Bullet.start();
        Bullet.stop();
        System.out.println("*********************");

        System.out.println("Brandname " + Scooty.brandName);
        System.out.println("Vehicle Number " + Scooty.vehicleNumber);
        System.out.println("Vehicle Price " + Scooty.price);
        System.out.println("Owner Name " + Scooty.ownerName);
        System.out.println("*********************");
        Scooty.start();
        Scooty.stop();
    }
}
