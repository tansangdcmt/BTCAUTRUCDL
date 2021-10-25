package kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoApple {

    static ArrayList<Apple> danhsachApple = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void nhapVaoDanhSach(){
        while(true){

            Apple apple = new Apple();
            apple.nhapThongTinApple();

            sc.nextLine();
            danhsachApple.add(apple);

            System.out.println("Nhập thêm táo: (y/n) ?");
            if(sc.nextLine().equals("n"))
            break;
        }
    }
    
    public void xuatDanhSach(){
        for(Apple apple: danhsachApple){
            apple.inThongTinApple();
        }
    }

    public void timTheoMau(){
        System.out.println("Màu cần tìm: ");
        for(Apple apple: danhsachApple){
            if(sc.nextLine().equals(apple.mau))
            apple.inThongTinApple();
        }
    }

}