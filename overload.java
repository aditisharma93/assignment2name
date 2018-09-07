import java.util.Scanner;
class Print{
    public void print(){
        System.out.println("NULL argument");
    }
    public void print(int a){
        System.out.println("Integer :"+ a);
    }
    public void print(float a){
        System.out.println("float :"+a);
    }
}
public class overload{
    public static void main(String args[]){
  Print x = new Print();
 Print y = new Print();
   Print z = new Print();
   x.print();
   y.print(5);
  z.print(5.5f);
    }
}
