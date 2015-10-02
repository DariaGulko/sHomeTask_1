package task1;

/**
 * Created by Dariya on 01.10.2015.
 */
public class Mobile extends Phone {
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    String brand;
    String color;
    public static void Ring(){
        System.out.println("ZZZZZZZZZz!!!");
    }

}
