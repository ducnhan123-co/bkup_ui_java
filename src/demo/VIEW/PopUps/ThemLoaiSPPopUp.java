/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package demo.VIEW.PopUps;


import demo.BLL.LoaiSPBLL;
import demo.DTO.LoaiSPDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Dinh Khanh Du
 */
public class ThemLoaiSPPopUp extends LoaiSPPopUp{

    @Override
    public void xacNhan() {
        try {
            String id = txtId.getText().trim();
            String ten = txtTenLoai.getText().trim();
            String mota = txtMota.getText().trim();
            
            LoaiSPDTO loai = new LoaiSPDTO(id, ten, mota);
            LoaiSPBLL.themLoaiSP(loai);
            dispose();
            JOptionPane.showMessageDialog(null, "Thêm loại sản phẩm thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
