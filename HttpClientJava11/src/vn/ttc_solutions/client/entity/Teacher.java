package vn.ttc_solutions.client.entity;


public class Teacher {
    private String name;
    private String pictureURL;
    private String email;
    @Override
    public String toString() {
        return "Teacher [email=" + email + ", name=" + name + ", pictureURL=" + pictureURL + "]";
    }
    public Teacher(String name, String pictureURL, String email) {
        this.name = name;
        this.pictureURL = pictureURL;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPictureURL() {
        return pictureURL;
    }
    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
