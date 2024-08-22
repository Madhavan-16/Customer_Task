package customerTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    int custId;
    String custName;
    String city;
    double premium;
    Date dateOfBirth;

    public Customer(int custId, String custName, String city, double premium, Date dateOfBirth) {
        this.custId = custId;
        this.custName = custName;
        this.city = city;
        this.premium = premium;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Customer(" + custId + ", " + custName + ", " + city + ", " + premium + ", " + dateFormat.format(dateOfBirth) + ")";
    }
}
