package chay;

import chinh.MatHang;
import chinh.NhanVienBanHang;
import chinh.QuanLyCT;
import chinh.QuanLyMH;
import renhanh.DanhSachBanHang;
import renhanh.MatHangMoi;
import renhanh.NhanVienMoi;

import java.util.Scanner;

public class MainRun {
    public static MatHang[] matHangs = new MatHang[100];
    public static NhanVienBanHang[] nhanVienBanHangs = new NhanVienBanHang[100];
    public static QuanLyMH[] quanLyMatHangs= new QuanLyMH[100];
    public static int demMatHang = 0;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    MatHangMoi.themMatHangMoi();
                    break;
                case 2:
MatHangMoi.showMatHang();
                    break;
                case 3:
                    NhanVienMoi.themNhanVien();
                    break;
                case 4:
NhanVienMoi.showNhanVienBanHang();
                    break;
                case 5:
                    DanhSachBanHang.banHangChitiet();
                    DanhSachBanHang.showQuanLyBanH();
                    break;
                case 6:
showSortMenu();
                    break;
                case 7:
DanhSachBanHang.tinhThuNhap();
                    break;
                case 8:
//                    System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionChoice() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showSortMenu() {
        System.out.println("Chọn tiêu chí sắp xếp: ");
        System.out.println("1. Theo họ tên nhan viên");
        System.out.println("2. Theo số lượng mat hang ban");
        System.out.println("3. Thoát ra ngoài menu chính");
        System.out.print("Chọn: ");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (choose) {
            case 1:
                DanhSachBanHang.sapXepTen();
                break;
            case 2:
                DanhSachBanHang.sapXepNhomMatHang();
                break;
            case 3:
                return;
        }
    }

    private static void showMenu() {
        System.out.println("\n\n\n----------PHẦN MỀM QUẢN LÝ DANH SACH BAN HANG------------");
        System.out.println("1. Nhập danh sach mặt hàng mới.");
        System.out.println("2. In ra danh sách sách mặt hàng.");
        System.out.println("3. Nhập nhan viên.");
        System.out.println("4. In ra danh sách nhan vien.");
        System.out.println("5. Thực hiện danh sách bán hàng cho từng nhân viên.");
        System.out.println("6. Sắp xếp danh sách bảng danh sách bán hàng.");
        System.out.println("7.  bảng kê doanh thu cho mỗi nhân viên.");
        System.out.println("8. Thoát chương trình.");
    }
}
