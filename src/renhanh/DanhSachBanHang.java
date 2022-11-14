package renhanh;

import chay.MainRun;
import chinh.MatHang;
import chinh.NhanVienBanHang;
import chinh.QuanLyCT;
import chinh.QuanLyMH;

import java.util.Scanner;

public class DanhSachBanHang {
    private static boolean checkMatHangVaNhanVien() {
        boolean isValidMH = false;
        for (int i = 0; i < MainRun.matHangs.length; i++) {
            if (MainRun.matHangs[i] != null) {
                isValidMH = true;
                break;
            }
        }


        boolean isValidNhanVien = false;
        for (int i = 0; i < MainRun.nhanVienBanHangs.length; i++) {
            if (MainRun.nhanVienBanHangs[i] != null) {
                isValidNhanVien = true;
                break;
            }
        }
        return isValidNhanVien && isValidMH;

    }

    public static void banHangChitiet() {
        if (!checkMatHangVaNhanVien()) {
            System.out.println("Chưa có dữ liệu về mặt hàng và nhân viên bán hàng");
            return;
        }
        System.out.print("Lập Bảng danh sách bán hàng cho bao nhieu nhân viên ");
        int soNhanV = new Scanner(System.in).nextInt();
        for (int i = 0; i < soNhanV; i++) {
            System.out.println("Nhập thông tin  cho nhan vien thứ " + (i + 1));
            System.out.print("Nhập mã nhan vien ban hang: ");

            NhanVienBanHang nhanVien;
            int maNhanV;
            do {
                maNhanV = new Scanner(System.in).nextInt();
                nhanVien = NhanVienMoi.timMaNhanVien(maNhanV);
                if (nhanVien != null) {
                    break;
                }
                System.out.print("Không có nhan viên nào mang mã " + maNhanV + " trog hệ thống, vui lòng nhập lại: ");
            } while (true);


            // nhập chi tiết số lượng Loại bài viết mà phóng viên đã viết
            System.out.print("Nhập số lượng loại mat hang ma nhân viên bán này đã viết: ");
            int soLoaiMatHang = 0;
            do {
                soLoaiMatHang = new Scanner(System.in).nextInt();
                if (soLoaiMatHang > 0 && soLoaiMatHang <= 5 && soLoaiMatHang <= MainRun.demMatHang) {
                    break;
                }
                System.out.print("Số loại bài viết trong 1 tháng không được vượt quá 5 và không được vượt quá loại trong hệ thống, nhập lại: ");
            } while (true);
            //nhập chi tiết các bài viết trong Loại
            QuanLyCT[] quanLyChiTiets = new QuanLyCT[soLoaiMatHang];
            int count = 0;
            int total = 0;
            for (int j = 0; j < soLoaiMatHang; j++) {
                System.out.println("Nhập thông tin mat hang " + (j + 1) + " mà nhan viên " + nhanVien.getHoTen() + " đã bán: ");
                System.out.print("Nhập id của loại mat hang thứ " + (j + 1) + ": ");
                MatHang matHang;
                int maMatHang;
                // kiem tra mã bài viêt có trong hệ thống ko
                do {
                    maMatHang = new Scanner(System.in).nextInt();
                    matHang = MatHangMoi.timMaMatHanf(maMatHang);
                    if (matHang == null) {
                        System.out.print("Không có mặt hàng nào mang mã " + maMatHang + " trog hệ thống, vui lòng nhập lại: ");
                        continue;
                    }
                    //kiem tra loai bai viet ko xuat hiẹn qúa 2 lan
                    boolean daNhapLoaiMatHangNayNhapChua = false;
                    for (int k = 0; k < quanLyChiTiets.length; k++) {
                        if (quanLyChiTiets[k] != null && quanLyChiTiets[k].getMatHang().getMaHang() == maMatHang) {
                            daNhapLoaiMatHangNayNhapChua = true;
                            break;
                        }
                    }
                    if (!daNhapLoaiMatHangNayNhapChua) {
                        break;
                    }
                    System.out.print("Loại mat hang này bạn vừa mới nhập xong, nhập loại khác đi: ");
                } while (true);
                // nhap so luong chi tiết cho từng loai bài viét
                System.out.print("Nhập số lượng lươt bán ở các mat hàng này: ");
                int soLuong = new Scanner(System.in).nextInt();
                quanLyChiTiets[count] = new QuanLyCT(matHang, soLuong);
                total += soLuong;

                count++;
            }
            QuanLyMH quanLyMatHang = new QuanLyMH(nhanVien, quanLyChiTiets);
            quanLyMatHang.setSoLuongBanMatHang(total);
            luuBanHang(quanLyMatHang);
        }
        
    }

    private static void luuBanHang(QuanLyMH quanLyMatHang) {
        for (int i = 0; i < MainRun.quanLyMatHangs.length; i++) {
            if (MainRun.quanLyMatHangs[i] == null) {
                MainRun.quanLyMatHangs[i] = quanLyMatHang;
                break;
            }
        }
    }

    public static void showQuanLyBanH() {
        for (int i = 0; i < MainRun.quanLyMatHangs.length; i++) {
            if (MainRun.quanLyMatHangs[i] != null) {
                System.out.println(MainRun.quanLyMatHangs[i]);
            }
        }
    }
    public static void sapXepTen(){
        for (int i = 0; i < MainRun.quanLyMatHangs.length - 1; i++) {

            if (MainRun.quanLyMatHangs[i]==null) {
                continue;
            }
            for (int j = i + 1; j < MainRun.quanLyMatHangs.length; j++) {
                if (MainRun.quanLyMatHangs[j]==null) {
                    continue;
                }
                if (MainRun.quanLyMatHangs[i].getNhanVienBanHang().getHoTen().compareTo(MainRun.quanLyMatHangs[j].getNhanVienBanHang().getHoTen())>0){
                    QuanLyMH temp = MainRun.quanLyMatHangs[i];
                    MainRun.quanLyMatHangs[i]=MainRun.quanLyMatHangs[j];
                    MainRun.quanLyMatHangs[j]=temp;
                }
            }
        }
    }
    public static void sapXepNhomMatHang() {

        for (int i = 0; i < MainRun.quanLyMatHangs.length - 1; i++) {
            QuanLyMH post1 = MainRun.quanLyMatHangs[i];
            if (post1 == null) {
                continue;
            }
            for (int j = i + 1; j < MainRun.quanLyMatHangs.length; j++) {
                QuanLyMH post2 = MainRun.quanLyMatHangs[j];
                if (post2 == null) {
                    continue;
                }
                if (post1.getSoLuongBanMatHang() < post2.getSoLuongBanMatHang()) {
                    QuanLyMH temp = post1;
                    post1 = post2;
                    post2 = temp;
                }
            }
        }
    }
            public static void tinhThuNhap() {
                for (int i = 0; i < MainRun.quanLyMatHangs.length; i++) {
                    if (MainRun.quanLyMatHangs[i] == null) {
                        continue;
                    }
                    double salary = 0;
                    NhanVienBanHang nhanVienBH = MainRun.quanLyMatHangs[i].getNhanVienBanHang();
                    QuanLyCT[] quanLyCt = MainRun.quanLyMatHangs[i].getQuanLCts();
                    for (int j = 0; j < quanLyCt.length; j++) {

                        /////// ham tinh luong nhes

                        salary += quanLyCt[j].getSoLuong() * quanLyCt[j].getMatHang().getGiaBan();
                    }
                    System.out.println("Lương của nhân viên" + nhanVienBH.getHoTen() + " là " + salary);
                }
            }









        }



