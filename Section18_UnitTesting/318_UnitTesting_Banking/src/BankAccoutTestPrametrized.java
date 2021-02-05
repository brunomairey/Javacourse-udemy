import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BankAccoutTestPrametrized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccoutTestPrametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        account = new BankAccount("Bruno", "M", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test");
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[] [] {
                {100.00, true,1100.00},
                {200.00, true,1200.00},
                {325.14, true,1325.14}
        });
    }

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0.01);

    }
}
