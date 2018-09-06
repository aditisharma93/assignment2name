import java.util.*;
class sblock {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block ");
    }
    sblock(){
        System.out.println("Constructor block");
    }
}
public class stk {
    public static void main(String args[]) {
       sblock t1 = new sblock();
       sblockt2 = new sblock();
    }