public class QuickUnion{
    private int[] id;

    // set id of each object to itself
    public QuickUnion(int N){
        this.id = new int[N];
        for(int i=0; i<N; i++){
            this.id[i] = i;
        }
    }

    private int find(int i){
        while(i!=id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        id[i] = j;
    }
}