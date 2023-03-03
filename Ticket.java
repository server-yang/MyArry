package cn.ysh;

public class Ticket {
    private Student student;
    private double price;

    public Ticket(Student student) {
        this.student = student;
        if (student.getAge()>=18){
            this.price = 20;
        }else if (student.getAge()<18){
            this.price = 0;
        }

    }

    public Ticket() {
    }

    public void show(){
        System.out.println(this.student.getName()+"的年龄为："+this.student.getAge()+"，"+(this.price ==0?"门票免费":"门票价格为："+this.price));
    }
}
