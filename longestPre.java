public class longestPre{
    public static String findCommon(String []str) {
        if(str.length==0) return "";
        String prifix= str[0];
        for(int i=1; i<str.length; i++)
            while(str[i].indexOf(prifix) !=0){
                prifix = prifix.substring(0, prifix.length()-1);

            }
            return prifix;
        }
        
    
       
    
    public static void main(String[] args) {
       String []str ={"flow","flew","flower","flight","flllwing"};
       String res =findCommon(str);
       System.out.println(res);
}
}
