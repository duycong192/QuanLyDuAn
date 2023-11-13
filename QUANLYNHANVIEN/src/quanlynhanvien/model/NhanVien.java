
package quanlynhanvien.model;


public class NhanVien {
    private long id;
    private String ma;
    private String ten;
    private String gioitinh;
    private int tuoi;
    private int luong;
    private String email;
    private String sdt;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String gioitinh, int tuoi, int luong, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.luong = luong;
        this.email = email;
        this.sdt = sdt;
    }

    public NhanVien(long id, String ma, String ten, String gioitinh, int tuoi, int luong, String email, String sdt) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.luong = luong;
        this.email = email;
        this.sdt = sdt;
    }
    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
