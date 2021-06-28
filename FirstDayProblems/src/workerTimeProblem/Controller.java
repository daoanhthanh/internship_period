package workerTimeProblem;

import java.time.LocalTime;
import java.util.Scanner;

public class Controller {

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        String ans = sc.nextLine();
        Service s = new Service(ans);
        sc.close();

        // paper's requirements
        System.out.println("Off work: " + s.whenToFinish());
        System.out.println("Working hour: "
                + LocalTime.of(s.calculateWorkingHour().getHour(), s.calculateWorkingHour().getMinute()));

        // print log to compliment
        if (s.getInit().getHour() == 8 && (s.getInit().getHour() >= 0 && s.getInit().getHour() < 30)) {
            System.out.println("Good to see you come so early.");
        }

        // print log the lateness status
        if (s.getInit().getHour() > 9 || (s.getInit().getHour() == 9 && s.getInit().getMinute() > 0)) {
            int h = s.getInit().getHour() - 9;
            int m = s.getInit().getMinute();
            System.out.println("You are late for " + LocalTime.of(h, m));

        }
    }
}
