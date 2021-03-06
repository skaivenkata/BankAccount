package Banking;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/13/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
interface TransactionDAO {

    Transaction saveTransaction(Transaction capture);

    List<Transaction> getAllTransaction(String s);

    List<Transaction> getAllTransaction(String s, long startTime, long stopTime);

    List<Transaction> getAllTransaction(String s, int n);
}
