package chinh;

import renhanh.NhanVienMoi;

import java.util.Arrays;

public class QuanLyMH {
    private NhanVienBanHang nhanVienBanHang;
    private QuanLyCT[] quanLCts;
    private int soLuongBanMatHang;


    public QuanLyMH(NhanVienBanHang nhanVienBanHang, QuanLyCT[] quanLCts) {
        this.nhanVienBanHang = nhanVienBanHang;
        this.quanLCts = quanLCts;
    }

    public NhanVienBanHang getNhanVienBanHang() {
        return nhanVienBanHang;
    }

    public void setNhanVienBanHang(NhanVienBanHang nhanVienBanHang) {
        this.nhanVienBanHang = nhanVienBanHang;
    }

    public QuanLyCT[] getQuanLCts() {
        return quanLCts;
    }

    public void setQuanLCts(QuanLyCT[] quanLCts) {
        this.quanLCts = quanLCts;
    }

    public int getSoLuongBanMatHang() {
        return soLuongBanMatHang;
    }

    public void setSoLuongBanMatHang(int soLuongBanMatHang) {
        this.soLuongBanMatHang = soLuongBanMatHang;
    }

    @Override
    public String toString() {
        return "QuanLyMH{" +
                "nhanVienBanHang=" + nhanVienBanHang +
                ", quanLCts=" + Arrays.toString(quanLCts) +
                '}';
    }
}
