public class Reverse {

    public static int Reverse(int x){
        int rev=0;
        int i=0;
        while(x>0){
            int d=x%10;
            rev = (rev*10)+d;
            x=x/10;
            i++;
        }
        return rev;
    }
    public static void main(String[] args) {
        int x=123;
        int ans = Reverse(x);
        System.out.println(ans);
    }
}
