/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.http.Cookie;

/**
 *
 * @author ASUS
 */
public class DAO {
    public boolean checkLogin(String username, String password) throws SQLException{
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "Select * From Registration where username = ? and password = ?";
            
            stm=con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            rs=stm.executeQuery();
            if(rs.next()) return true;
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
            if(rs!=null) rs.close();
        }
        return false;
    }
    
    private List<DTO> accountList;
    
    public List<DTO> getListAccounts(){
        return accountList;
    }
    
    private List<CourseRegistration> courseList;

    public List<CourseRegistration> getCourseList() {
        return courseList;
    }

    public boolean searchByCategory(String category) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con!=null){
                String url = "Select courseName,quantity,price,description,image,startDate,endDate,category,lastUpdateDate,lastUpdateUser "
                        + "From Courses "
                        + "where category Like ?";

                stm = con.prepareStatement(url);
                stm.setString(1, "%" + category + "%");
                
                rs = stm.executeQuery();
                while(rs.next()){
                    String courseName = rs.getString("courseName");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    Date startDate = rs.getDate("startDate");
                    Date endDate = rs.getDate("endDate");
                    Date lastUpdateDate = rs.getDate("lastUpdateDate");
                    String lastUpdateUser = rs.getString("lastUpdateUser");
                    
                    CourseRegistration courses = new CourseRegistration(courseName, quantity, price, category, description, image, startDate, endDate, lastUpdateDate, lastUpdateUser);
                    
                    if(this.courseList == null){
                        this.courseList = new ArrayList<CourseRegistration>();
                    }
                    
                    this.courseList.add(courses);
                }
                return true;
            }
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
            if(rs!=null) rs.close();
        }
        return false;
    }
    
    public boolean searchByName(String name) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con!=null){
                String url = "Select courseName,quantity,price,description,image,startDate,endDate,category,lastUpdateDate,lastUpdateUser "
                        + "From Courses "
                        + "where courseName Like ?";

                stm = con.prepareStatement(url);
                stm.setString(1, "%" + name + "%");
                
                rs = stm.executeQuery();
                while(rs.next()){
                    String courseName = rs.getString("courseName");
                    String category = rs.getString("category");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    Date startDate = rs.getDate("startDate");
                    Date endDate = rs.getDate("endDate");
                    Date lastUpdateDate = rs.getDate("lastUpdateDate");
                    String lastUpdateUser = rs.getString("lastUpdateUser");
                    
                    CourseRegistration courses = new CourseRegistration(courseName, quantity, price, category, description, image, startDate, endDate, lastUpdateDate, lastUpdateUser);
                    
                    if(this.courseList == null){
                        this.courseList = new ArrayList<CourseRegistration>();
                    }
                    
                    this.courseList.add(courses);
                }
                return true;
            }
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
            if(rs!=null) rs.close();
        }
        return false;
    }
    
    public boolean insertRecord(String username, String password, String lastname, boolean role) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con!=null){
                String url = "Insert Into Registration(username, password, lastname, isAdmin)"
                        + " Values(?, ?, ?, ?)";
                stm = con.prepareStatement(url);
                stm.setString(1,username);
                stm.setString(2,password);
                stm.setString(3,lastname);
                stm.setBoolean(4,role);
                
                int row = stm.executeUpdate();
                if(row > 0){
                    return true;
                }
            }
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
        }
        return false;
    }
    
    public boolean insertCourse(String courseName, int quantity, double price, String category, String description, String image, Date startDate, Date endDate, Date lastUpdateDate, String lastUpdateUser) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        
        try {
            con = DBUtils.makeConnection();
            if (con!=null){
                String url = "Insert Into Registration(courseName, quantity, price, category, description, image, startDate, endDate, lastUpdateDate, lastUpdateUser)"
                        + " Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                stm = con.prepareStatement(url);
                stm.setString(1,courseName);
                stm.setInt(2,quantity);
                stm.setDouble(3,price);
                stm.setString(4,category);
                stm.setString(5,description);
                stm.setString(6,image);
                stm.setDate(7,startDate);
                stm.setDate(8,endDate);
                stm.setDate(9,lastUpdateDate);
                stm.setString(10,lastUpdateUser);
                
                int row = stm.executeUpdate();
                if(row > 0){
                    return true;
                }
            }
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
        }
        return false;
    }
    
    public String searchLastname(String userID) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        String name = "";
        try {
            con = DBUtils.makeConnection();
            String sql = "Select lastname From Registration Where username = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, userID);
            rs = stm.executeQuery();
            if(rs.next()) name = rs.getString("lastname");
            return name;
        } finally {
            if(con!=null) con.close();
            if(stm!=null) stm.close();
            if(rs!=null)  rs.close();
        }
    }
    
    public void getTop20() throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            String sql = "Select top 20 courseName,quantity,price,description,image,startDate,endDate,category,lastUpdateDate,lastUpdateUser From Courses";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                    String courseName = rs.getString("courseName");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    Date startDate = rs.getDate("startDate");
                    Date endDate = rs.getDate("endDate");
                    String category = rs.getString("category");
                    Date lastUpdateDate = rs.getDate("lastUpdateDate");
                    String lastUpdateUser = rs.getString("lastUpdateUser");
                    
                    CourseRegistration courses = new CourseRegistration(courseName, quantity, price, category, description, image, startDate, endDate, lastUpdateDate, lastUpdateUser);
                    
                    if(this.courseList == null){
                        this.courseList = new ArrayList<CourseRegistration>();
                    }
                    
                    this.courseList.add(courses);
                }
        } finally{
            if(con!=null) con.close();
            if(stm!=null) stm.close();
            if(rs!=null)  rs.close();
        }
    }
}
