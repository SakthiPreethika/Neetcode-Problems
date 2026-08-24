class LinkedList {
    java.util.LinkedList<Integer> a;

    public LinkedList() {
        a=new java.util.LinkedList<>();

    }

    public int get(int index) {
        if(index<0 || index>a.size()-1){
            return -1;
        }
        return a.get(index);
        
    }

    public void insertHead(int val) {
        a.addFirst(val);
        
    }

    public void insertTail(int val) {
        a.addLast(val);

    }

    public boolean remove(int index) {
       if(index<0 || index>a.size()-1){
        return false;
       }
       a.remove(index);
       return true;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> b=new ArrayList<>();
        for(int c:a){
            b.add(c);
        }
        return b;

    }
}
