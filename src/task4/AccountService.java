package task4;

interface AccountService {
    Account findAccountByOwnerId(long id);

    long countAccountsWithBalanceGreaterThan(long value);
}