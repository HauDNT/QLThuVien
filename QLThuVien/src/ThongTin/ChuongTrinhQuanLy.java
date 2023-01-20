package ThongTin;

import java.util.Scanner;

public class ChuongTrinhQuanLy {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                QuanLyTaiLieu CTQuanLy = new QuanLyTaiLieu();
                
                while(true) {
                        System.out.println("\n---CHUONG TRINH QUAN LY THU VIEN---");
                        System.out.println("1. Them moi tai lieu.");
                        System.out.println("2. Xoa tai lieu theo ma tai lieu.");
                        System.out.println("3. Hien thi thong tin ve tat ca tai lieu.");
                        System.out.println("4. Tim kiem tai lieu theo the loai.");
                        System.out.println("5. Thoat chuong trinh.");
                        System.out.print("=> Hay nhap so thu tu ung voi thao tac muon thuc hien: ");
                        String choose1 = sc.nextLine();
                        
                        switch (choose1) {
                            case "1": {
                                    System.out.println("1. Them sach.");
                                    System.out.println("2. Them tap chi.");
                                    System.out.println("3. Them bao.");
                                    System.out.print("Hay nhap lua chon cua ban: ");
                                    String choose2 = sc.nextLine();
                                    
                                    switch (choose2) {
                                            case "1": {
                                                    System.out.print("- Nhap ma sach: ");
                                                    String maTaiLieu = sc.nextLine();
                                                    System.out.print("- Nhap ten nha xuat ban: ");
                                                    String TenNXB = sc.nextLine();
                                                    System.out.print("- Nhap so ban phat hanh: ");
                                                    int soBanPH = Integer.parseInt(sc.nextLine());
                                                    System.out.print("- Nhap ten tac gia: ");
                                                    String tenTacGia = sc.nextLine();
                                                    System.out.print("- Nhap so trang: ");
                                                    int soTrang = Integer.parseInt(sc.nextLine()); 
                                                    
                                                    TaiLieu themSach = new Sach(tenTacGia, soTrang, maTaiLieu, TenNXB, soBanPH);
                                                    CTQuanLy.addTaiLieu(themSach);
                                                    break;
                                            }
                                            
                                            case "2": {
                                                    System.out.print("- Nhap ma tap chi: ");
                                                    String maTaiLieu = sc.nextLine();
                                                    System.out.print("- Nhap ten nha xuat ban: ");
                                                    String TenNXB = sc.nextLine();
                                                    System.out.print("- Nhap so ban phat hanh: ");
                                                    int soBanPH = Integer.parseInt(sc.nextLine());
                                                    System.out.print("- So phat hanh: ");
                                                    String soPH = sc.nextLine();
                                                    System.out.print("- Thang phat hanh: ");
                                                    int thangPH = Integer.parseInt(sc.nextLine());
                                                    
                                                    TaiLieu themTapChi = new Bao(soPH, maTaiLieu, TenNXB, soBanPH);
                                                    CTQuanLy.addTaiLieu(themTapChi);
                                                    break;
                                            }
                                            
                                            case "3": {
                                                    System.out.print("- Nhap ma bao: ");
                                                    String maTaiLieu = sc.nextLine();
                                                    System.out.print("- Nhap ten nha xuat ban: ");
                                                    String TenNXB = sc.nextLine();
                                                    System.out.print("- Nhap so ban phat hanh: ");
                                                    int soBanPH = Integer.parseInt(sc.nextLine());
                                                    System.out.print("- Ngay phat hanh: ");
                                                    String ngayPH = sc.nextLine();
                                                    
                                                    TaiLieu themBao = new Bao(ngayPH, maTaiLieu, TenNXB, soBanPH);
                                                    CTQuanLy.addTaiLieu(themBao);
                                                    break;
                                            }
                                    }     
                                    break;
                            }
                            
                            case "2": {
                                    System.out.print("- Nhap ma tai lieu ban muon xoa: ");
                                    String maTaiLieu = sc.nextLine();
                                    QuanLyTaiLieu remove = new QuanLyTaiLieu();
                                    //remove.xoaTaiLieu(maTaiLieu);           
                                    break;
                            }
                            
                            case "3": {
                                System.out.println("Danh sach tai lieu hien co trong thu vien: ");
                                CTQuanLy.showDocumentsList();
                                break;
                            }
                            
                            case "4": {
                                
                                break;
                            }
                            
                            case "5": {
                                System.out.println("Da dang xuat khoi chuong trinh!\nCam on ban da su dung!");
                                System.exit(0);
                            }
                            
                            
                            
                            
                            
                        }
                }
        }
}
