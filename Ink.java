package cn.ysh;

public interface Ink {

    //获取墨盒接口
    public String getInk();
}

class BlackWhiteInk implements Ink{

    @Override
    public String getInk() {
        return "黑白";
    }
}
class ColorInk implements Ink{

    @Override
    public String getInk() {
        return "彩色";
    }
}
