/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.BLL;
import demo.DAO.HangDAO;
import demo.DTO.HangDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class HangBLL {
        public static ArrayList<HangDTO> getHangs() throws SQLException {
        return HangDAO.getHangs();
    }

}
