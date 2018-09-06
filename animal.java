import java.util.Scanner;
abstract class beast{
    private String breed,colour;
    beast(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed(){
        return breed;
    }
    public String getColour(){
        return colour;
    }
    public abstract void speak();
}
class Dog extends beast{
   Dog(String b, String c)
    {
        super(b,c);
    }
    public void speak()
    {
        System.out.println("Dog barks"+"\nand the breed = "+getBreed()+"\n colour = "+getColour());
    }
}
class Cat extends beast{
   Cat(String b, String c){
 super(b,c);
    }
  public void speak() { 
 System.out.println("Cat meows"+"\nand the breed = "+getBreed()+"\n colour "+getColour());
    }
}
public class animal{
 public static void main(String args[]){
   Cat c = new Cat("Persian","white");
  Dog d = new Dog("german shephard","black");
  d.speak();
 c.speak();
    }
}