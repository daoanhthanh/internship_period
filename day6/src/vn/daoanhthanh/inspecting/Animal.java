package vn.daoanhthanh.inspecting;

public abstract class Animal implements Eating{
    public static String CATEGORY = "domestic";
    private String name;
    protected abstract String getSound();
}
