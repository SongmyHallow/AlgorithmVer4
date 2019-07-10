public class Date{

    private static final int[] limit = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int month;
    private final int day;
    private final int year;
    public Date(int m, int d, int y){
        if(!isValid(m,d,y)) throw new RuntimeException("Invalid date!");
        this.month = m;
        this.day = d;
        this.year = y;
    }
    public int month(){
        return this.month;
    }
    public int day(){
        return this.day;
    }
    public int year(){
        return this.year;
    }
    public String toString(){
        return month + "/" + day + "/" + year;
    }
    public boolean isValid(int m,int d,int y){
        if(m < 1 || m > 12) return false;
        if(d <1 || d > limit[m])    return false;
        return true;
    }

    public static void main(String[] args) {
        Date test = new Date(10, 29, 1995);
        System.out.print(test);
    }
}