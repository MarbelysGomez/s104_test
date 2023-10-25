package S104_N1exercise1;

import java.util.ArrayList;
import java.util.List;

public class Months {
    private List<String> monthsList;
    public Months(){
        monthsList = new ArrayList<>();
    }
    public void insertMonths() {
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");
    }
    public List<String> getMonths(){
        return this.monthsList;
    }
}
