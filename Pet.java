package cn.ysh;

public abstract class Pet {
    public String name;
    public int health; //健康值
    public int love; //亲密度

    public Pet() {
        this.health = 100;
        this.love = 0;
    }

    public Pet(String name, int health, int love) {
        super();
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        if(health >= 100){
            health = 100;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        if(love >= 100){
            love = 100;
        }
        this.love = love;
    }

    public abstract void show();

    public void sleep(){
        System.out.println("动物正在睡觉！");
    }

}
