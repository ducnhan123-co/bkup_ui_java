/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.BLL;
import java.sql.Connection;
import demo.DAO.DonViTinhDAO;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DonViTinhBLL {
     public static ArrayList<String> getDanhSachDVT() throws SQLException {
        return DonViTinhDAO.getDanhSachDVT();
    }
    
    public static int getMaDVT(String ten) {
        return DonViTinhDAO.getMaDVT(ten);
    }
}
