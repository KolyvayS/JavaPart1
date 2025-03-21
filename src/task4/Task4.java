package task4;

public class Task4 {
    public static void runTask4() {
       Account[] accounts = {
               new Account(141L, 236246L, new User(123L, "Alex", "Brown")),
               new Account(636L, 155L, new User(536L, "John", "Winner")),
               new Account(1245L, 346377L, new User(124L, "Ashley", "Gun")),
               new Account(5485L, 36663L, new User(346L, "Tom", "White")),
               new Account(3737L, 1556L, new User(568L, "Olaf", "Duck")),
               new Account(153L, 6367L, new User(1256L, "Henry", "Landry"))
       };

       AccountServiceImpl service = new AccountServiceImpl(accounts);
       System.out.println(service.findAccountByOwnerId(124L));
       System.out.println(service.countAccountsWithBalanceGreaterThan(100000L));
    }
}



























