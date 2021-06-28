package workerTimeProblem;

import java.time.LocalTime;

public class Service {
    private LocalTime init;

    public Service(String userInput) {
        if (validate(userInput)) {
            this.init = LocalTime.of(Integer.parseInt(userInput.split(":")[0]),
                    Integer.parseInt(userInput.split(":")[1]));
        } else {
            System.err.println("Too early! The company start working at 8.30am");
        }

    }

    public boolean validate(String userInput) {
        int hour;
        int minute;
        try {
            hour = Integer.parseInt(userInput.split(":")[0]);
            minute = Integer.parseInt(userInput.split(":")[1]);
            if (hour < 0 || hour > 24) {
                throw new NullPointerException("Please re-enter hour! (0 <= hour < 24)");
            }
            if (minute < 0 || minute > 60) {
                throw new NullPointerException("Please re-enter minute! (0 <= minute < 60)");
            }
            if (hour < 8) {
                return false;
            }
        } catch (NumberFormatException e) {
            System.err.println("Please enter time format properly (hh:mm).");
        }

        return true;
    }

    public LocalTime calculateWorkingHour() {
        long minuteWorking = init.getHour() * 60 + init.getMinute() + 60;
        return whenToFinish().minusMinutes(minuteWorking);
    }

    public LocalTime whenToFinish() {
        // later than 9am
        if (init.getHour() > 9 || (init.getHour() == 9 && init.getMinute() > 0)) {
            return LocalTime.of(18, 0);
        }
        if (init.getHour() == 8 && (init.getHour() >= 0 && init.getHour() < 30)) {
            return LocalTime.of(17, 30);
        }
        return init.plusHours(9);
    }

    public LocalTime getInit() {
        return this.init;
    }
}