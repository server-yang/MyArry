package cn.ysh;

import java.util.Scanner;

public class Dog extends Pet {
    Scanner sc = new Scanner(System.in);
    private String strain;// 品种

    public Dog(String name, int health, int love, String strain) {
        super();
    }

    public Dog() {
        super();
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void watchHome(){
        System.out.println("狗狗正在看家！");
    }


    public void chooseStrain() {
        System.out.print("请选择狗的类型；(1.聪明的拉布拉多犬 2.酷酷的雪纳瑞)");
        do {
            int choice = sc.nextInt();
            if (choice == 1) {
                setStrain("聪明的拉布拉多犬");
            } else if (choice == 2) {
                setStrain("酷酷的雪纳瑞");
            }
        } while (getStrain() == null);
    }

    @Override
    public void show() {
        System.out.println("我是一只品种为" + this.strain + "的狗,我的名字是"
                + super.getName() + ",我的健康值是" + super.getHealth() + ",我的亲密度是"
                + super.getLove());
    }
}
