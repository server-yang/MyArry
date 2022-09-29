public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1,2,3,4,5);
        int[] arr = {0,0,0};
        myArray.add(arr);
        myArray.show();
    }
}

class MyArray {
    private int[] arr;

    //初始化n长度数组 默认值0
    public MyArray() {
        this.arr = new int[0];
    }

    //遍历数组
    void show(){
        if (this.arr.length!=0){
            for (int i = 0; i < this.arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else {
            System.out.println("数组数据为空！");
        }
    }

    //添加数据
    void add(int num){
        int[] newArr = new int[this.arr.length+1];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        newArr[newArr.length-1] = num;
        this.arr = newArr;
    }
    void add(int...num){
        int len = num.length;
        int[] newArr = new int[this.arr.length+len];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        int i = this.arr.length;
        for(int n:num){
            newArr[i] = n;
            i++;
        }
        this.arr = newArr;
    }

    //删除末尾数据
    void move(){
        int[] newArr = new int[this.arr.length-1];
        for (int i = 0; i < this.arr.length-1; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    //删除指定下标的数据
    void delIndex(int index){
        if (index >=0 && index<=this.arr.length){
            int[] newArr = new int[this.arr.length-1];
            for (int i = 0; i < index; i++) {
                newArr[i] = this.arr[i];
            }
            for (int i = index; i < newArr.length; i++) {
                newArr[i] = this.arr[i+1];
            }
            this.arr = newArr;
        }else {
            System.out.println("数组下标"+index+"不存在！");
        }
    }

    //修改指定数据
    void alterIndex(int index,int num){
        this.arr[index] = num;
    }

}
