/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author moluh
 */
public class tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //   st.executeUpdate("create table users(UserID int primary key AUTO_INCREMENT,UserName VARCHAR(100) NOT NULL,Email VARCHAR(100) NOT NULL UNIQUE,Password VARCHAR(100) NOT NULL,Role VARCHAR (50) NOT NULL CHECK(Role IN('Administrator','Manager','Sales staff')),Status Enum ('Active','Inactive') NOT NULL);");
            //   st.executeUpdate("INSERT INTO users(UserName,Email,Password,Role,Status) VALUES('Lord','Lord@gmail.com','absolute','Administrator','Active');");
            //   st.executeUpdate("create table Category(CategoryID int primary key AUTO_INCREMENT,CategoryName VARCHAR(50) NOT NULL,Description VARCHAR(100));");
            //   st.executeUpdate("create table products(ProductID int primary key AUTO_INCREMENT,ProductName VARCHAR(50) NOT NULL,Description VARCHAR(100),Brand VARCHAR(50),Price DECIMAL(10,2) NOT NULL,Quantity INT NOT NULL DEFAULT '0',BottleSize VARCHAR(20),Category INT NOT NULL,foreign key(Category) references category(CategoryID));");
            //st.executeUpdate("create table customer(ID int primary key AUTO_INCREMENT,Name VARCHAR(250) NOT NULL,Mobile VARCHAR(50) UNIQUE,Email VARCHAR(200) UNIQUE);");
            st.executeUpdate("create table orderDetail(order_pk int primary key AUTO_INCREMENT,orderID VARCHAR(200) NOT NULL,customer_fk  int,orderDate VARCHAR(200),totalPaid int);");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }

    }
}
