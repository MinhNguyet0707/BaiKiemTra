package renhanh;

import chay.MainRun;
import chinh.MatHang;

import java.util.Scanner;

public class MatHangMoi {
    public static void showMatHang() {
        for (int i = 0; i < MainRun.matHangs.length; i++) {
            if (MainRun.matHangs[i] != null) {
                System.out.println(MainRun.matHangs[i]);
            }
        }
    }

    public static void themMatHangMoi() {
        System.out.print("Nhập số lượng mặt hàng thêm mới: ");
        int soMatH = new Scanner(System.in).nextInt();
        for (int i = 0; i < soMatH; i++) {
            MatHang matHang = new MatHang();
            matHang.nhapThongTin();
            luuMatHang(matHang);
        }
    }

    public static void luuMatHang(MatHang matHang) {
        if (matHang == null) {
            return;
        }
        for (int i = 0; i < MainRun.matHangs.length; i++) {
            if (MainRun.matHangs[i] == null) {
                MainRun.matHangs[i] = matHang;
                break;
            }
        }
    }

    public static MatHang timMaMatHanf(int maMatH) {
        MatHang matHang = null;
        for (int j = 0; j < MainRun.matHangs.length; j++) {
            if (MainRun.matHangs[j] != null && MainRun.matHangs[j].getMaHang() == maMatH) {
                matHang = MainRun.matHangs[j];
                break;
            }
        }
        return matHang;
    }
}
