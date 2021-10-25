


package tuan07;

import java.util.stack;

public class StackdemoProgram {
    public static void main(String[] args) {
        Stack<String> stack;

        stack = new Stack<>();

        //thêm  phần tử vào stack
        stack.push("Welcome");
        stack.push("to");
        stack.push("Data Stucture and Algotithm");

        //lấy ra  1 phàn tử từ đỉnh Stack (xóa phần tử khỏi Stack)
        String poped = stack.pop();

        System.out.println("Đã lấy ra từ danh Stack"+ poped);
        System.out.println("Phần tử còn lại của Stack");
        System.out.println(stack);

        Stack<Student> stack2;

        //THEM NÚT ĐỈNH
        Stack phantuDuocTham - stack.peek();
        System.out.println("thăm phần tử đỉnh" + phantuDuocTham);

        //sau thi thâm
        System.out.println(stack);

        Stack<Student> stack2;
    }
}
