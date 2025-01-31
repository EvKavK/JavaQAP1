public class TestAccount {
    public static void main(String[] args) {
        Account Acc1 = new Account("1", "Account 1", 5000);
        Account Acc2 = new Account("2", "Account 2", 4000);

        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());

        Acc1.transferTo(Acc2, 1000);

        System.out.println(Acc1.getBalance());
        System.out.println(Acc2.getBalance());
    }
}
