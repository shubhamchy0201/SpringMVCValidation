package spring.validation;

import spring.validation.custom.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private  String firstName;
    @NotNull(message = "is required")
    @Size(min = 1 , message = " must be greater than 1")
    private  String lastName;

    @NotNull(message = "is required")
    @Min(value = 0,message="Must be greater than or Equal to 0")
    @Max(value = 10,message="Must be less than or Equal to 10")
    private Integer freePasses;

    @NotNull(message = "is required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 char/Digits allowed")
    private String postalCode;

    @NotNull(message = "is required")
    @CourseCode(value = "ABC", message = "Must start with ABC")
    private String courseCode;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
