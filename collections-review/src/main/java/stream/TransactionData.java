package stream;

import stream.Transaction;

import java.util.Arrays;
import java.util.List;

public class TransactionData {
    public static List<Transaction> getAll() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(brian, 2012, 1000),
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 710),
                new Transaction(brian, 2012, 700),
                new Transaction(brian, 2012, 950)
        );

    }
}
