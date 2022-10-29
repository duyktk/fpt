/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

/**
 *
 * @author ASUS
 */
public class InsertError {
    private String userNameExist;
    private String wrongUsernamePassword;
    private String confirmNotMatch;
    private String invalidDate;

    public String getUserNameExist() {
        return userNameExist;
    }

    public void setUserNameExist(String userNameExist) {
        this.userNameExist = userNameExist;
    }

    public String getWrongUsernamePassword() {
        return wrongUsernamePassword;
    }

    public void setWrongUsernamePassword(String wrongUsernamePassword) {
        this.wrongUsernamePassword = wrongUsernamePassword;
    }

    public String getConfirmNotMatch() {
        return confirmNotMatch;
    }

    public void setConfirmNotMatch(String confirmNotMatch) {
        this.confirmNotMatch = confirmNotMatch;
    }

    public String getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(String invalidDate) {
        this.invalidDate = invalidDate;
    }
    
}
