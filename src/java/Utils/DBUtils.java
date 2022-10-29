/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ASUS
 */
public class DBUtils {
    public static Connection makeConnection() {
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            DataSource ds = (DataSource)envCtx.lookup("Duyktk");
            Connection con = ds.getConnection();
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e){
            e.printStackTrace();
        }
        return null;
    }
}
