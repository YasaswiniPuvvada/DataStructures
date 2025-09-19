package ArrayList;
public class MyArrayList {
    int a[];
    int size;
    int capacity;
    public MyArrayList(int capacity){
        this.capacity=capacity;
        a=new int [capacity];
        size=0;
    }
    public boolean add(int value){
        if(size==capacity){
            return false;
        }
        else{
            a[size++]=value;
            return true;
        }
    }
    public boolean remove(int value) {
        for (int i=0; i<size; i++) {
            if (a[i]==value) {
                for (int j=i; j<size-1; j++) {
                    a[j] = a[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }
    public boolean search(int value){
        for(int i=0;i<size;i++){
            if(a[i]==value){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return size;
    }
    public int checkSize() {
        if (size > capacity) {
            return -1;
        }
        return size;
    }
    public int[] dynamic(int capacity){
        int[] b=new int[(capacity+(capacity/2))];
        for(int i=0;i<capacity;i++){
            b[i]=a[i];
        }
        return b;
    }
}