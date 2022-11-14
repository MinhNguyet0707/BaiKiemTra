package chinh;

import java.util.Scanner;

public class NhanVienBanHang extends Nguoi {
    private static int AUTO_ID = 999;
    private int maNhanVien;
    private String ngayKiHopDong;

    public NhanVienBanHang() {
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNgayKiHopDong() {
        return ngayKiHopDong;
    }

    public void setNgayKiHopDong(String ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", ngayKiHopDong='" + ngayKiHopDong + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        AUTO_ID++;
       this.maNhanVien=AUTO_ID;
        System.out.print("Nhập ngày kí Hợp Đồng : ");
        this.ngayKiHopDong = new Scanner(System.in).nextLine();
    }
}
