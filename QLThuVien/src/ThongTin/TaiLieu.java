package ThongTin;

public class TaiLieu {
        protected String maTaiLieu;
        protected String TenNXB;
        protected int soBanPH;

        public TaiLieu() {
        }

        public TaiLieu(String maTaiLieu, String TenNXB, int soBanPH) {
                this.maTaiLieu = maTaiLieu;
                this.TenNXB = TenNXB;
                this.soBanPH = soBanPH;
        }

        public String getMaTaiLieu() {
                return maTaiLieu;
        }

        public String getTenNXB() {
                return TenNXB;
        }

        public int getSoBanPH() {
                return soBanPH;
        }

        public void setMaTaiLieu(String maTaiLieu) {
                this.maTaiLieu = maTaiLieu;
        }

        public void setTenNXB(String TenNXB) {
                this.TenNXB = TenNXB;
        }

        public void setSoBanPH(int soBanPH) {
                this.soBanPH = soBanPH;
        }
}