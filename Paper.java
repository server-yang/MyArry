package cn.ysh;

public interface Paper {
    //获取纸张接口
    public String getPaper();
}

class A4Paper implements Paper{

    @Override
    public String getPaper() {
        return "A4纸";
    }
}

class B5Paper implements Paper{

    @Override
    public String getPaper() {
        return "B5纸";
    }
}
