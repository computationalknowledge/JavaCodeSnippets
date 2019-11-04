class Fruit{
    String FruitName;
    
    public void HowToEat(String message){
        System.out.println(message);
    }
}

public class Manager{
    public static void main(String [] a){
        Fruit apple = new Fruit();
        apple.HowToEat("Eat an Apple by peeling it first!");
    }
}
