package cn.ysh;

import java.util.Scanner;

public class Penguin extends Pet {
    Scanner sc = new Scanner(System.in);
    private String sex;

    public Penguin() {
        super();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin(String name, int health, int love, String sex) {
        super();
    }

    public void swimming(){
        System.out.println("企鹅正在游泳！");
    }

    public void chooseSex(){
        System.out.print("请选择你想要领养的企鹅的性别：(1.Q仔  2.Q妹)");
        int i = new Scanner(System.in).nextInt();
        String sex = null;
        if (i == 1) {
            sex = "Q仔";
            setSex(sex);
        } else if (i == 2) {
            sex = "Q妹";
            setSex(sex);
        }
    }

    @Override
    public void show() {
        System.out.println("我是一只性别为" + this.sex + "的企鹅,我的名字是" + super.getName()
                + ",我的健康值是" + super.getHealth() + ",我的亲密度是" + super.getLove());
    }
}
