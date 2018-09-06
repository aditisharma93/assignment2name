import java.util.Scanner;
abstract class Vehicle
{ public abstract void start();
    public void stop() {
        System.out.println("Vehicle Stoped");
    }
}
class wheel2 extends Vehicle{
        public void start(){
                System.out.println( "wheel2 Started");
        }   
}
class wheel4 extends Vehicle{
        public void start(){
                System.out.println("wheel4 Started");
        }
}
public class ride{
    public static void main(String args[]){
        wheel2 t = new wheel2();
        wheel4 f = new wheel4();
        t.start();
        t.stop();
        f.start();
        f.stop();
    }
}