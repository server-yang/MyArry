package cn.ysh;

public class Student {
    private String name;
    private int age;
    private String className;
    private String love;

    public Student(String name, int age, String className, String love) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.love = love;
    }

    public Student() {
    }

    public void info(){
        System.out.println(this.name);
        System.out.println("年龄："+this.age);
        System.out.println("就读于："+this.className);
        System.out.println("爱好："+this.love);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public String getLove() {
        return love;
    }
}
