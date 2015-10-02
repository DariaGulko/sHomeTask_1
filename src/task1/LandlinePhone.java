package task1;

/**
 * Created by Dariya on 01.10.2015.
 */
public class LandlinePhone extends Phone {
    public void setCoard(boolean coard) {
        this.coard = coard;
    }


    public boolean isCoard() {
        return coard;
    }

    boolean coard;
    public static void Ring(){
        System.out.println("zzzzzzzzz");
    }
}
