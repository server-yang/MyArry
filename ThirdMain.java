package cn.ysh;

import java.util.Scanner;

public class ThirdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Master m = new Master();
        Pet pet = null;
        System.out.println("欢迎您来到宠物店");
        System.out.print("请选择要领养的宠物类型(1.狗类 2.企鹅类)");

        int choice = sc.nextInt();
        pet = m.adoptPet(choice);
        pet.show();

    }
    public static void play(Pet pet){
        if (pet instanceof Dog){
            ((Dog) pet).watchHome();
        }else if (pet instanceof Penguin){
            ((Penguin) pet).swimming();
        }
    }
}
