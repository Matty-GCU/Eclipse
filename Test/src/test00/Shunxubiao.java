package test00;

class Shunxubiao<T>{
    //����Ԫ�ص�����
    private T[] eles;
    //��¼��ǰ˳����е�Ԫ�ظ���
    private int N;
    public Shunxubiao(int capacity){
        this.eles =(T[])new Object[capacity];
        this.N = 0;
    }
    public void clear(){
        //�������Ա�
        this.N = 0;
    }
    public boolean isEmpty(){
        //�ж����Ա��Ƿ�Ϊ��
        return N==0;
    }
    public int length(){
        //��ȡ���Ա���Ԫ�صĸ���
        return this.N;
    }
    public T get(int i){
        //��ȡ���������Ա��е�i��Ԫ�ص�ֵ
        return this.eles[i-1];
    }
    public void insert(int i,T t){
        //�����Ա��е�i��Ԫ��֮ǰ����һ��ֵΪt��Ԫ��
        for (int index=N-1;index>i;index--){
            eles[index] = eles[index-1];
        }
        eles[i] = t;
        N++;
    }
    public void insert(T t){
        //�����Ա�������һ��ֵΪt��Ԫ��
        eles[N++] = t;
    }
    public T remove(int i){
        //ɾ�����������Ա��е�i������Ԫ��
        T delete = eles[i-1];
        for (int index=i;index<N;index--){
            eles[i-1] = eles[i];
        }
        N--;
        return delete;
    }
    public int indexOf(T t){
        //�������Ա����״γ���tԪ�ص�����,���������򷵻�-1
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