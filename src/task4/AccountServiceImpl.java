package task4;

class AccountServiceImpl implements AccountService {
    private final Account[] accounts;

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