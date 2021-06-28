package studentDBProblem;

import java.time.LocalDate;
import java.time.Period;

public class test {
    public static void main(String[] args) {
        LocalDate c = LocalDate.of(2000, 02, 29);
        Period diff = Period.between(c, LocalDate.now());
        System.out.println(diff.getYears() + " " + diff.getMonths());
    }
}
