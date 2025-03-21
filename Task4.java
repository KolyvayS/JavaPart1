public class Task4 {
    public static void main(String[] args) {
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


interface AccountService {
    Account findAccountByOwnerId(long id);

    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    public AccountServiceImpl(Account[] array){
        this.accounts = array;
    }

    @Override
    public Account findAccountByOwnerId(long id){
        for(Account account : accounts){
            if(account.getOwner().getId() == id)
                return account;
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for(Account account : accounts){
            if(account.getBalance() > value)
                count++;
        }
        return count;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account id: " + getId();
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}



















