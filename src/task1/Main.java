package task1;

/**
 * Created by Dariya on 01.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        LandlinePhone p1=new LandlinePhone();
        p1.setCoard(true);
        System.out.println("Availability of cord:"+p1.isCoard());
        p1.Ring();
        p1.setNumber("05741582");
        System.out.println("The number of phone is : "+p1.getNumber());
Mobile p2=new Mobile();
        p2.Ring();
    }
}
