package quanlynhanvien.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quanlynhanvien.model.NhanVien;

public class NhanVienService {

    public static List loadData() {
        List<NhanVien> listNhanvien = new ArrayList<>();
        try {
            String sql = "Select * from Nhanvien";
            Connection con = DBConnect.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                String gioitinh = rs.getString(4);
                int tuoi = rs.getInt(5);
                int luong = rs.getInt(6);
                String email = rs.getString(7);
                String phone = rs.getString(8);
                NhanVien nv = new NhanVien(id, ma, ten, gioitinh, tuoi, luong, email, phone);
                listNhanvien.add(nv);
            }
            con.close();
            return listNhanvien;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void Add(String ma, String ten, String gioitinh, int tuoi, int luong, String email, String phone) {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "Insert into nhanvien values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            ps.setString(2, ten);
            ps.setString(3, gioitinh);
            ps.setInt(4, tuoi);
            ps.setInt(5, luong);
            ps.setString(6, email);
            ps.setString(7, phone);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
