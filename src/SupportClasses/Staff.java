/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupportClasses;

import java.util.HashMap;

/**
 *
 * @author Greg
 */
public class Staff {
    
    private final String firstName;
    private final String LastName;
    private HashMap<String,String> degrees;
    private String email;
    private String phone;
    private String department;
    private String title;
    private String officeLocation;
    private String officeNumber;

    public Staff(String firstName, String LastName) {
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public HashMap<String, String> getDegrees() {
        return degrees;
    }

    public void setDegrees(HashMap<String, String> degrees) {
        this.degrees = degrees;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    
}
