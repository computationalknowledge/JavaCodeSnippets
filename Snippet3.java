class Fruit{
    public static String FruitName;
    
    public void HowToEat(String message){
        System.out.println(message);
    }
}

public class Manager{
    public static void main(String [] a){
        Fruit apple = new Fruit();
        apple.FruitName = "Peach";
        apple.HowToEat("Eat " + Fruit.FruitName + "  by peeling it first!");
    }
}
