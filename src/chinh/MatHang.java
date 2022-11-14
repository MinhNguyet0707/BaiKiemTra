package chinh;

import phu.NhomHang;

import java.util.Scanner;

public class MatHang implements HamNhap{
    private static int AUTO_ID = 1000;
private int maHang;
private String tenHang;
NhomHang nhomHang;
private double giaBan;
private int soLuong;

    public MatHang() {
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NhomHang getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(NhomHang nhomHang) {
        this.nhomHang = nhomHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", nhomHang=" + nhomHang +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                '}';
    }

    @Override
    public void nhapThongTin() {
        this.maHang = MatHang.AUTO_ID++;
        System.out.print("Nhập tên hang: ");
        this.tenHang = new Scanner(System.in).nextLine();
        System.out.print("Nhập gia ban: ");
        this.giaBan = new Scanner(System.in).nextDouble();
        System.out.print("Nhập so luong  ");
        this.soLuong = new Scanner(System.in).nextInt();
        this.nhapNhomHang();
    }

    private void nhapNhomHang() {
        System.out.println("Nhập nhom hang, chọn 1 trong các lựa chọn dưới đây: ");
        System.out.println("1. dien tu");
        System.out.println("2. dien lanh");
        System.out.println("3. may tinh");
        System.out.println("4. thiet bi van phong");
        int soLuongNhomH = 0;
        do {
            soLuongNhomH = new Scanner(System.in).nextInt();
            if (soLuongNhomH >= 1 && soLuongNhomH <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (soLuongNhomH) {
            case 1:
                this.setNhomHang(NhomHang.Dien_tu);
                break;
            case 2:
                this.setNhomHang(NhomHang.Dien_lanh);
                break;
            case 3:
                this.setNhomHang(NhomHang.May_Tinh);
                break;
            case 4:
                this.setNhomHang(NhomHang.Thiet_bi_van_phong);
                break;
        }
    }
    }


