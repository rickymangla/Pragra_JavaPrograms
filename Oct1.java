class Car {
    String brand;
    String model;
    double price;

    Car() {

    }
//    Car(String brand, String model, double price) {
//        this.brand=brand;
//        this.model=model;
//        this.price=price;
//    }

    void carProperties() {
        System.out.println(brand);
        System.out.println(model);

 //        int i=1;
//        while(i<10) {
//            System.out.println(i);
//            return;
//            i++;
//        }
//        String s="welcome";
//        switch(s) {
//            case "welcome":
//                System.out.println("string found");
//                return;
//            case "hello":
//                System.out.println("string not found");
//        }
//        int i=11;
//        if(i>10) {
//            System.out.println("i is bigger");
//            return;
//        }
//        else {
//            System.out.println("i is smaller");
//        }
        System.out.println(price);
    }
}

public class Oct1 {

    public static void main(String[] args) {
//        Car car = new Car("Nissan","Murano",45000.50);
//        car.brand="Nissan";
//        car.model="Murano";
//        car.price=45000.50;

        Car car = new Car();
//        car.brand="Nissan";
//        car.model="Murano";
//        car.price=45000.50;

        car.carProperties();
    }


}
