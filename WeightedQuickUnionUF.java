public class WeightedQuickUnionUF{
    private int[] id;
    private int[] sz; // weight for each root node
    private int count;

    public WeightedQuickUnionUF(int N){
        count = N;
        id = new int[N];
        sz = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
            sz[i] = i;
        }
    }
    public int count()
    {   return count; }

    public boolean connected(int p, int q)
    {   return find(p)==find(q);    }

    private int find(int p){
        while(p != id[p]){
            // path compression
            id[p] = id[id[p]];
            p=id[p];
        }
        return p;
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i==j)    return;
        if(sz[i]<sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }
        else{
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}