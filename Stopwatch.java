public class Stopwatch{
    private final long start;

    public Stopwatch(){
        start = System.currentTimeMillis();
    }

    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now-start)/1000.0;
    }

    public static void main(String[] args) {
        int N = 100000;
        int[] a = new int[N];
        for(int i=0; i<N; i++)
            a[i] = StdRandom.uniform(-100000, 100000);
            Stopwatch timer = new Stopwatch();
            double time = timer.elapsedTime();
            StdOut.print(time);
    }
}