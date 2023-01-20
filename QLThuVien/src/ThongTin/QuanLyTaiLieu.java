package ThongTin;

import java.util.ArrayList;
import java.util.List;

/*
    1. Thêm mới tài liêu: Sách, tạp chí, báo.
    2. Xoá tài liệu theo mã tài liệu.
    3. Hiện thị thông tin về tài liệu.
    4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
    5. Thoát khỏi chương trình.
*/

public class QuanLyTaiLieu {
        List<TaiLieu> QuanLyTaiLieu;

        public QuanLyTaiLieu() {
            this.QuanLyTaiLieu = new ArrayList<>();
        }
        
        public void addTaiLieu(TaiLieu TaiLieuMoi) {
            this.QuanLyTaiLieu.add(TaiLieuMoi);
        }
        
        public void showDocumentsList() {
            this.QuanLyTaiLieu.forEach(QuanLyTaiLieu -> System.out.println(QuanLyTaiLieu.toString()));
        }
        
//        public void xoaTaiLieu(String maTaiLieu) {
//            QuanLySach.removeIf(filter -> (filter.getMaTaiLieu()).equals(maTaiLieu));
//            System.out.println("Cac tai lieu con lai trong thu vien: ");
//            for (TaiLieu i : QuanLySach) 
//                System.out.println(i);
//        }    
}