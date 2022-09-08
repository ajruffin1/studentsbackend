package com.students.demo.resource;

public class StudentsRequest {
    private String firstName;
    private String lastName;
    public StudentsRequest(){

    }
    public StudentsRequest(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}