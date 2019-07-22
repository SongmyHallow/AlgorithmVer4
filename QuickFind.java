public class QuickFind{
    private int[] id;
    private int count;
    // set id of each object to itself
    public QuickFind(int N){
        this.id = new int[N];
        this.count = N;
        for(int i=0; i<N; i++){
            this.id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public int find(int p){
        return id[p];
    }
    // O(N)
    public void union(int p, int q){
        int pID = id[p];
        int qID = id[q];
        if(pID == qID)  return;

        for(int i=0; i<id.length; i++){
            if(id[i] == pID)    id[i] = qID;
        }
    }

    public boolean connected(int p, int q){
        if(id[p] == id[q])  return true;
        else                return false;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFind uf = new QuickFind(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!uf.connected(p, q)){
                uf.union(p, q);
                StdOut.println(p+" "+q);
            }
        }
    }
}