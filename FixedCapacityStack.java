
public class FixedCapacityStack<Item>{
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N==0;
    }
    public boolean isFull(){
        return N==a.length;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        a[N++] = item;
    }
    public Item pop(){
        return a[--N];
    }
    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
        while(!s.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))    s.push(item);
            else if(!s.isEmpty())   StdOut.print(s.pop()+"");
        }
        StdOut.println("("+s.size()+" left on stack)");
    }
}