package vn.ttc_solutions.client.entity;

public class Course {
    private String name;
    private int workload;
    private short rate;

    private String teacherName;

    

    public Course(String name, int workload, short rate, String teacherName) {
        this.name = name;
        this.workload = workload;
        this.rate = rate;
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public short getRate() {
        return rate;
    }

    public void setRate(short rate) {
        this.rate = rate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    


}
