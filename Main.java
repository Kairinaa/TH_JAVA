import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static void inputInfo(SinhVien nhap) {
        System.out.println("Nhap ho ten Sinh vien: ");
        nhap.setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi Sinh vien");
        nhap.setDiaChi(sc.nextLine());
        System.out.println("Nhap ma Sinh vien: ");
        nhap.setMssv(sc.nextInt());
        ;
        sc.nextLine();
        do {
            System.out.println("Yeu cau nhap SDT 9 so: ");
            nhap.setSoDienThoai(sc.nextLine());
        } while (nhap.getSoDienThoai().length() != 9);
    }

    static void menu() {
        System.out.println("|---------------------------------------------|");
        System.out.println("|             VUI LÒNG CHỌN CHỨC NĂNG         |");
        System.out.println("|=============================================|");
        System.out.println("|1. NHẬP THÔNG TIN SINH VIÊN                  |");
        System.out.println("|2. XUẤT THÔNG TIN SINH VIÊN                  |");
        System.out.println("|3. THOÁT                                     |");
        System.out.println("|=============================================|");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv[] = null;
        int a, n = 0;
        boolean c = true;
        do {
            menu();
            System.out.print("Nhập yêu cầu: "); int chon = sc.nextInt();
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1)+": ");
                        sv[i] = new SinhVien();
                        inputInfo(sv[i]);
                    }
                    break;
                case 2:
                    SinhVien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMssv() > sv[j].getMssv()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                    for (int i = 0; i < n; i++) {
                        sv[i].showInfo();
                    }
                    break;
                default:
                    System.out.println("Kết thúc");
                    c = false;
                    break;
            }
        }while (c);
    }
}