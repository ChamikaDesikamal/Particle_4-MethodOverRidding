public class Mobile {
    public void displayName(){
        System.out.println("Smart Mobile ");
    }
}
class Samsung extends Mobile{
    public void displayName(){
        System.out.println("Samsung Galaxy S22 ULTRA! ");

    }
}
class Apple extends Samsung{
    @Override
    public void displayName() {
        System.out.println("Iphone 14 Pro MAX! ");
        super.displayName();
    }
}
class Customer{
    public static void main(String[] args) {
        Apple a = new Apple();
        a.displayName();
        
    }
}