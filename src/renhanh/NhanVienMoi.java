package renhanh;

import chay.MainRun;
import chinh.NhanVienBanHang;

import java.util.Scanner;

public class NhanVienMoi {
    public static void showNhanVienBanHang() {
        for (int i = 0; i < MainRun.nhanVienBanHangs.length; i++) {
            if (MainRun.nhanVienBanHangs[i] != null) {
                System.out.println(MainRun.nhanVienBanHangs[i]);
            }
        }
    }

    public static void themNhanVien() {
        System.out.print("Nhập số nhân viên thêm mới: ");
        int soNhanV = new Scanner(System.in).nextInt();
        for (int i = 0; i < soNhanV; i++) {
            NhanVienBanHang nvbn = new NhanVienBanHang();
            nvbn.nhapThongTin();
            luuNhanVien(nvbn);
        }
    }

    private static void luuNhanVien(NhanVienBanHang nvbn) {
        if (nvbn == null) {
            return;
        }
        for (int i = 0; i < MainRun.nhanVienBanHangs.length; i++) {
            if (MainRun.nhanVienBanHangs[i] == null) {
                MainRun.nhanVienBanHangs[i] = nvbn;
                break;
            }
        }
    }
    public static NhanVienBanHang timMaNhanVien(int maNhaV) {
        NhanVienBanHang nhanVienBanHang = null;
        for (int j = 0; j < MainRun.nhanVienBanHangs.length; j++) {
            if (MainRun.nhanVienBanHangs[j] != null && MainRun.nhanVienBanHangs[j].getMaNhanVien() == maNhaV) {
                nhanVienBanHang = MainRun.nhanVienBanHangs[j];
                break;
            }
        }
        return nhanVienBanHang;
    }


}
