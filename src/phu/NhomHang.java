package phu;

public enum NhomHang {
    Dien_tu("Dien tu"),
    Dien_lanh("Dien Lanh"),
    May_Tinh("May Tinh"),
    Thiet_bi_van_phong("thiet bi van phong");

    public String value;

    NhomHang(String value) {
        this.value = value;
    }

}
