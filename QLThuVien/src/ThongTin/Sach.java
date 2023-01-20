package ThongTin;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String TenNXB, int soBanPH) {
            super(maTaiLieu, TenNXB, soBanPH);
            this.tenTacGia = tenTacGia;
            this.soTrang = soTrang;
    }

    public String getTenTacGia() {
            return tenTacGia;
    }

    public int getSoTrang() {
            return soTrang;
    }

    public void setTenTacGia(String tenTacGia) {
            this.tenTacGia = tenTacGia;
    }

    public void setSoTrang(int soTrang) {
            this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "- The loai: Sach { " +
               "Ten tac gia: '" + tenTacGia + 
               "\t\tSo trang: " + soTrang + 
               "\t\tMa tai lieu: " + maTaiLieu +
               "\t\tNha xuat ban: " + TenNXB + 
               "\t\tSo ban phat hanh: " + soBanPH +
               '}';
    }
}
