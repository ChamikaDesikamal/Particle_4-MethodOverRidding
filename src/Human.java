public class Human {
    void run(){
        System.out.println("Human can Eat!");
    }

}
class Chamika extends Human{
    void run(){
        System.out.println("Chamika can eat banana !");
    }

    public static void main(String[] args) {
        Chamika c = new Chamika();
        c.run();
    }
}
