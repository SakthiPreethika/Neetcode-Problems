class DynamicArray {
    int[] a;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity=capacity;
        a=new int[capacity];
        size=0;

    }

    public int get(int i) {
        return a[i];

    }

    public void set(int i, int n) {
        a[i]=n;

    }

    public void pushback(int n) {
        if(size==capacity){
            resize();
        }
        a[size]=n;
        size++;

    }

    public int popback() {
       size--;
       return a[size];

    }

    private void resize() {
        capacity=capacity*2;
        int newArray[]=new int[capacity];
        for(int i=0;i<size;i++){
            newArray[i]=a[i];
        }
        a=newArray;


    }

    public int getSize() {
       return size;

    }

    public int getCapacity() {
        return capacity;

    }
}
