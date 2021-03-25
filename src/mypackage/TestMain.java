package mypackage;

public class TestMain {
    public void main() {
        Client clint1 = new Client();
        CardOperation deposit = new CardOperation();
        clint1.name = "Sasha";
        clint1.cardSum = deposit.depositCard(clint1.cardSum, 100);
        clint1.setAge(29);
    }
    class CardOperation{
        int depositCard(int card, int summ) {
            return card + summ;
        }
    }
}
