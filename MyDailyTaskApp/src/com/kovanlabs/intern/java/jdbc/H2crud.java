package com.kovanlabs.intern.java.jdbc;

import java.sql.*;

public class H2crud {
    public static void main(String[] args){
        String url = "jdbc:h2:~/testdb";
        String username = "sa";
        String password = "";

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected H2 database");

            //table creation
            String createTable = "CREATE TABLE IF NOT EXISTS Users (" +
                    "id INT PRIMARY KEY, "+
                    "name VARCHAR(50), " +
                    "email VARCHAR(50))";
            Statement st = con.createStatement();
            st.execute(createTable);

            //insert user
            String insertQuery = "INSERT INTO Users (id, name, email) VALUES (?,?,?)";
            PreparedStatement psInsert = con.prepareStatement(insertQuery);
            psInsert.setInt(1, 2);
            psInsert.setString(2, "ramesh");
            psInsert.setString(3, "ram22@gmail.com");
            psInsert.executeUpdate();

            //fetch user
            String selectQuery = "SELECT * FROM Users ";
            PreparedStatement psSelect = con.prepareStatement(selectQuery);
            ResultSet rs = psSelect.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }


        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
