package cn.ysh;

import java.util.Scanner;

public class Master {
    Scanner sc = new Scanner(System.in);

    public Pet adoptPet(int choice) {
        Pet pet = null;
        System.out.print("请输入要领养的宠物名字:");
        String name = sc.next();
        switch (choice) {
            case 1:
                pet = new Dog();
                Dog dog = (Dog) pet;
                dog.chooseStrain();
                dog.setName(name);
                break;
            case 2:
                pet = new Penguin();
                Penguin pen = (Penguin) pet;
                pen.chooseSex();
                pen.setName(name);
                break;
        }
        return pet;
    }

}
