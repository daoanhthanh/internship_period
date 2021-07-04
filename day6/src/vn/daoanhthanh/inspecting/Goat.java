package vn.daoanhthanh.inspecting;

public class Goat extends Animal implements Locomotion{
    @Override
    public String getLocomotion() {
        return "Stand while eating";
    }

    @Override
    protected String getSound() {
        return "Goam Goam";
    }

    @Override
    public String favoriteFood() {
        return "grass";
    }
}
