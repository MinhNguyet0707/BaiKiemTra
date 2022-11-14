package chinh;

import java.util.Scanner;

public class Nguoi implements HamNhap{
    protected String hoTen;
    protected String diaChi;
    protected String soDienThoai;

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        System.out.print("Nhập tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhập SĐT: ");
        this.soDienThoai = new Scanner(System.in).nextLine();
    }
}
