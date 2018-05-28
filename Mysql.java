/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethu
 */
import java.sql.*;
public class Mysql {
  public Connection con;
  public Statement stmt;

    public Mysql() throws SQLException {
     
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent","root","root");
        stmt=con.createStatement();
    }
   
}
