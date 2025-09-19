package Stack;
public class MyStack {
    int a[];
    int top;
    int size;
    public MyStack(int size) {
        this.size = size;
        a=new int[size];
        top=0;
    }
    public boolean push(int value){
        if(top==size){
            return false;
        }
        else{
            a[top++]=value;
            return true;
        }
    }
    public boolean pop(){
        if(top==0){
            return false;
        }
        else{
            top--;
            return true;
        }
    }
    public boolean search(int value){
        for(int i=0;i<top;i++){
            if(a[i]==value){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return top;
    }
}