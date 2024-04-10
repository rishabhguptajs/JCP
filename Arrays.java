
class CustomArray{
    private int[] arr;
    private int size;
    private int capacity;
    
    public CustomArray(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }
    
    public void insert(int element){
        if(size == capacity){
            System.out.println("Array is full");
            return;
        }
        arr[size] = element;
        size++;
    }
    
    public void remove(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }
    
    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Arrays {
    public static void main(String[] args) {
        int[][][] arr = new int[3][][];

        arr[0] = new int[2][];
        arr[0][0] = new int[3];
        arr[0][1] = new int[2];
        arr[1] = new int[1][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = i + j + k;
                }
            }
        }
    }
}
