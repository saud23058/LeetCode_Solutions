public class Backtracking {
      
    public static void permu(String str ,  String prem, int idx ){
        if(idx==str.length()){
            System.out.println(prem);
            return ;
        }
        for(int i=0 ; i<str.length(); i++){

            char currentchr = str.charAt(i); 
            String newStr = str.substring(0, i) +  str.substring(i+1);
            permu(newStr, prem+currentchr, idx); 
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
     permu(str, "", 0);
    }
}
