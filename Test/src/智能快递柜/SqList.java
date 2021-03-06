package 智能快递柜;

import java.util.Arrays;

public class SqList<T> {
	
	//线性表的默认长度（数组的默认容量）
    int DEFAULT_SIZE;
    //定义一个数组用于保存线性表的长度
    Object[] elementData;
    //线性表此时的长度
    int capacity;
    //数组中的实际元素个数
    int size ;

    public SqList(int DEFAULT_SIZE) {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }
    
    public SqList(T[] values,int capacity){
        this.capacity=capacity;
        elementData = new Object[capacity];
    }
    
    // 增加一个元素
    public void insert(T element, int index) {
        if(index<0){
            index = 0 ;
        }
        else if(index>this.DEFAULT_SIZE){
            index = this.DEFAULT_SIZE ;
        }
        Object source[] = this.elementData ;
        if(this.DEFAULT_SIZE == elementData.length){
            this.elementData = new Object[source.length*2] ;
            for(int j=0;j<index;j++){
                this.elementData[j] = source[j];
            }
        }
        for(int j=this.DEFAULT_SIZE-1;j>=index;j--){
            this.elementData[j+1] = source[j] ;
        }
        this.elementData[index] = element;
        this.DEFAULT_SIZE++ ;

    }

    public boolean isempty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int length() {
        return this.DEFAULT_SIZE;
    }

    public void add(T element) {
        insert(element, size);
    }

    public T get(int index) {
        if(index>=0 && index<this.DEFAULT_SIZE){
            return (T)this.elementData[index] ;
        }
        else{
            return null ;
        }
    }



    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }

    public T priorElem(int index) {
        if (index > 0 && index < size + 1)
            return (T) elementData[index - 1];
        else {
            throw new IndexOutOfBoundsException("数组越界异常");
        }
    }

    public T delete(int index) {
        if (this.DEFAULT_SIZE > 0 && index >= 0 && index < this.DEFAULT_SIZE) {
            T old = (T) this.elementData[index];
            for (int j = index; j < this.DEFAULT_SIZE - 1; j++) {
                this.elementData[j] = this.elementData[j + 1];
            }
            this.elementData[this.DEFAULT_SIZE - 1] = null;
            this.DEFAULT_SIZE--;
            return old;
        }
        return null;
    }

    public void ensureCapacity(int mCapacity) {
        if (mCapacity > capacity) {
            capacity = mCapacity + 2;
            System.out.println("capacity:"+capacity);
            elementData = Arrays.copyOf(elementData, capacity);
        }
    }
    public void set(T x,int i){
        if(i>=0&&i<this.capacity){
            this.elementData[i]=x;
        }else{
            throw new java.lang.IndexOutOfBoundsException(i+"");
        }
    }

    public String toString(){
        String str = this.getClass().getName() + "(";
        if (this.DEFAULT_SIZE > 0) {
            str += this.elementData[0].toString();
        }
        for (int i = 1; i < this.DEFAULT_SIZE; i++) {
            str += "," + this.elementData[i].toString();
        }
        return (str+")");
    }
}