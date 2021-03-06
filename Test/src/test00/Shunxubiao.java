package test00;

class Shunxubiao<T>{
    //储存元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;
    public Shunxubiao(int capacity){
        this.eles =(T[])new Object[capacity];
        this.N = 0;
    }
    public void clear(){
        //空置线性表
        this.N = 0;
    }
    public boolean isEmpty(){
        //判断线性表是否为空
        return N==0;
    }
    public int length(){
        //获取线性表中元素的个数
        return this.N;
    }
    public T get(int i){
        //读取并返回线性表中第i个元素的值
        return this.eles[i-1];
    }
    public void insert(int i,T t){
        //在线性表中第i个元素之前插入一个值为t的元素
        for (int index=N-1;index>i;index--){
            eles[index] = eles[index-1];
        }
        eles[i] = t;
        N++;
    }
    public void insert(T t){
        //向线性表中添加一个值为t的元素
        eles[N++] = t;
    }
    public T remove(int i){
        //删除并返回线性表中第i个数据元素
        T delete = eles[i-1];
        for (int index=i;index<N;index--){
            eles[i-1] = eles[i];
        }
        N--;
        return delete;
    }
    public int indexOf(T t){
        //返回线性表中首次出现t元素的索引,若不存在则返回-1
        for (int index=0;index<N;index++){
            if (eles[index]==t)
                return index;
        }
        return -1;
    }
}
//public class SequenceList{
//    public static void main(String[] args) {
//        SequenceList1 st1 = new SequenceList1(30);
//        st1.insert("qwer");
//        System.out.println(st1.get(1));
//    }
//}
