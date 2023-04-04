public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class Boc extends CentralBank{
    @Override
    int getInterestRate() {
        return 8;
    }
}
class Peo extends CentralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class Com extends CentralBank{
    @Override
    int getInterestRate() {
        return 12;
    }
}
class TestBank{
    public static void main(String[] args) {
       Boc b = new Boc();
       Peo p = new Peo();
       Com c = new Com();
        System.out.println("Interset Rate: " + b.getInterestRate()+"%");
        System.out.println("Interset Rate: " + p.getInterestRate()+"%");
        System.out.println("Interset Rate: " + c.getInterestRate()+"%");

    }
}