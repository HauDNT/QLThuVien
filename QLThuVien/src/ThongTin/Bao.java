package ThongTin;

public class Bao extends TaiLieu {
        private String ngayPH;

        public Bao() {
        }

        public Bao(String ngayPH, String maTaiLieu, String TenNXB, int soBanPH) {
                super(maTaiLieu, TenNXB, soBanPH);
                this.ngayPH = ngayPH;
        }

        public String getNgayPH() {
                return ngayPH;
        }

        public void setNgayPH(String ngayPH) {
                this.ngayPH = ngayPH;
        }
        
    @Override
    public String toString() {
        return "- The loai: Tap chi { " +
               "Ngay phat hanh: " + ngayPH +
               "\t\tMa tai lieu: " + maTaiLieu +
               "\t\tNha xuat ban: " + TenNXB +
               "\t\tSo ban phat hanh: " + soBanPH + 
               '}';
    }
}