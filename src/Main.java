public class Main {
    public static void main(String[] args)
    {
        double balance = 5000.00;
        double INTEREST_RATE = 0.17;
        double interest = balance * INTEREST_RATE;
        double firstMonth = interest +1;
        double secondMonth = interest +2;

        System.out.println("Your credit card balance is " + balance);
        System.out.println("Your interest rate is " + INTEREST_RATE);
        System.out.println("Your first month is " + firstMonth);
        System.out.println("Your second month is " + secondMonth);
    }
}