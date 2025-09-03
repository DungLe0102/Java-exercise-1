public class sinhvien {

    private String maSv;
    private String hoTen;
    private int tuoi;

    private static int soLuong = 0;

    public sinhvien() {
        soLuong++;
    }

    public void setThongTin(String maSv, String hoTen, int tuoi) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSv);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }

    public static void hienThiSoLuong() {
        System.out.println("Tong so sinh vien: " + soLuong);
    }

    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien();
        sv1.setThongTin("B24DCCC079", "Le Xuan Dung", 19);

        sinhvien sv2 = new sinhvien();
        sv2.setThongTin("B24DCCC779", "Le Xuan Dung 2", 20);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();

        sinhvien.hienThiSoLuong();
    }
}
