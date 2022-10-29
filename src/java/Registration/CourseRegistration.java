/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class CourseRegistration {
    private String courseName;
    private int quantity;
    private double price;
    private String category;
    private String description;
    private String image;
    private Date startDate;
    private Date endDate;
    private Date lastUpdateDate;
    private String lastUpdateUser;

    public CourseRegistration() {
    }

    public CourseRegistration(String courseName, int quantity, double price, String category, String description, String image, Date startDate, Date endDate, Date lastUpdateDate, String lastUpdateUser) {
        this.courseName = courseName;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.description = description;
        this.image = image;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateUser = lastUpdateUser;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }
    
}
