package cn.ysh;

import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();

        while (true){
            System.out.print("请输入姓名：");
            s1.setName(s.next());
            if ("n".equals(s1.getName())){
                System.out.println("退出程序");
                break;
            }
            System.out.print("请输入年龄：");
            s1.setAge(s.nextInt());
            Ticket ticket = new Ticket(s1);
            ticket.show();
            System.out.println();
        }
    }
}
