package kiemtragiuaki;

import java.util.Scanner;

public class KhoAppleTextDrive {
    public static void main(String[] args) {
        KhoApple quanlyApple = new KhoApple();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("===============MENU==================");
            System.out.println("1>    Nhập Danh Sách Apple           ");
            System.out.println("2>    Tìm Màu           ");
            System.out.println("3>    Xuất Danh Sách Apple                        ");
            System.out.println("4>    Kết Thúc.                      ");
            System.out.println("=====================================");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = sc.nextInt();

            switch (key) {
            case 1:
                quanlyApple.nhapVaoDanhSach();
                break;
            case 2:
                quanlyApple.timTheoMau();
                break;
            case 3:
                quanlylApple.xuatDanhSach();
                break;
            case 4:
                System.out.println("Kết Thúc");
                System.exit(0);
                break;
            }

            System.out.println("Trở về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            sc.nextLine();

        } while (sc.nextLine().equals("y"));
    }
}
