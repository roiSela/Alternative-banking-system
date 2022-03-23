
import java.util.*;

public interface BankActions {

    /**
     loading from a xml file the details of the system
     return "The file and data were loaded successfully" if the data is valid for the system and if not, return the failure reason.

     */
    String  loadSystemDetailsFromFile(String filePath );

    /**
    this function will return data about all the current loans in the system

     */
    List<String> getDataAboutLoansAndTheirStatus();

    /**
     Get clients data
     */
    String getClientsData();

    /**
     put the money in the client's account
     */
    boolean putMoneyInAccount(int moneyToLoad,int client);

    /**
    taking money from client
     */
    boolean takeMoneyFromAccount(int moneyToTake,int client);

    /**
    this function Places loans to one client
     it gets client to place loans to, money to invest.
     and it can also get other conditions for loan.

     */
    boolean SchedulingLoansToClient(int client, double moneyToInvest, List<String> categories, double minimumInterestForTimeUnit, int minimumTotalTimeUnitsForInvestment);


    /**
     raising the time line by one. (starting from)
     */
    boolean RaiseTheTimeLine();

}
