public class CircularRotation{
    public static boolean checkRotation(String s, String t){
        if(s.length() == t.length() && s.concat(t).indexOf(t) >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "ACTGACC";
        String str2 = "TGACGAC";
        System.out.println(checkRotation(str1,str2));
    }
}