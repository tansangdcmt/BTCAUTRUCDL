package kiemtragiuaki;

import java.util.Scanner;

public class Apple {
    String id;
    String khoiluong;
    String mau;
    static Scanner sc = new Scanner(System.in);
    Apple() {
    }
    //in thông tin 
    public void inThongTinApple() {
        System.out.println("===================");
        System.out.println("Mã id: " +id);
        System.err.println("Khối Lượng: " + khoiluong);
        System.out.println("Màu : " + mau);
    }
    //nhập thông tin
    public void nhapThongTinApple() {
        System.out.println("Mã id: ");
        id = sc.nextLine();
        System.err.println("Khối Lượng: ");
        khoiluong = sc.nextLine();
        System.out.println("Màu: ");
        mau = sc.nextLine();
    }

}