package ThongTin;

public class TapChi extends TaiLieu {
    private String soPH;
    private int thangPH;

    public TapChi() {
    }

    public TapChi(String soPH, int thangPH, String maTaiLieu, String TenNXB, int soBanPH) {
            super(maTaiLieu, TenNXB, soBanPH);
            this.soPH = soPH;
            this.thangPH = thangPH;
    }

    public String getSoPH() {
            return soPH;
    }

    public int getThangPH() {
            return thangPH;
    }

    public void setSoPH(String soPH) {
            this.soPH = soPH;
    }

    public void setThangPH(int thangPH) {
            this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return "- The loai: Tap chi { " +
               "\t\tSo phat hanh: '" + soPH +
               "\t\tThang phat hanh: " + thangPH +
               "\t\tMa tai lieu: " + maTaiLieu +
               "\t\tNha xuat ban: " + TenNXB +
               "\t\tSo ban phat hanh: " + soBanPH + 
               '}';
    }
}
