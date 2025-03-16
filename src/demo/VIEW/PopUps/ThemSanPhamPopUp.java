/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package demo.VIEW.PopUps;

import demo.BLL.SanPhamBLL;
import demo.DTO.SanPhamDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Dinh Khanh Du
 */
public class ThemSanPhamPopUp extends SanPhamPopUp {

    @Override
    public void xacNhan() {
        String id = txtId.getText().trim();
        String ten = txtTen.getText().trim();
        String loai = (String) cbbLoai.getSelectedItem();
        int hsd = (int) spnHSD.getValue();
        String mota = txtMota.getText().trim();
        int gia = (int) spnGia.getValue();
        String dvt = (String) cbbDVT.getSelectedItem();
        
        try {
            SanPhamBLL.themSanPham(new SanPhamDTO(id, ten, loai, dvt, hsd, mota, gia, 0));
            dispose();
            JOptionPane.showMessageDialog(null, "Thêm sản phẩm mới thành công!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
