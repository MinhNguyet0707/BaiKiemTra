package chinh;

public class QuanLyCT {
    MatHang matHang;
  private  int soLuong;

    public QuanLyCT(MatHang matHang, int soLuong) {
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "QuanLyCT{" +
                "matHang=" + matHang +
                ", soLuong=" + soLuong +
                '}';
    }
}
