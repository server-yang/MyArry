package cn.ysh;

public class Printer {
    private Paper paper;
    private Ink ink;

    public void print(){
        System.out.println("您正在使用"+ink.getInk()+"墨盒打印"+paper.getPaper()+"纸张。");
    }

    public Printer() {
    }

    public Printer(Paper paper, Ink ink) {
        this.paper = paper;
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }
}
