   
class Solution {
    public static boolean isPalindrome(int x) {
            int n=x;
            int d;
            int rev=0;
            int count=0;
            while(x>0){
                 d = x%10;
                rev = (rev*10)+d;
                x=x/10;
                count++;
            }
            if(n==rev){
                return true;
            }
            else{
                return false;
            }
            
        }
        public static void main(String[] args) {
            int x=121;
          if(isPalindrome(x)){
            System.out.println(isPalindrome(x));
          }
          else{
              System.out.println(isPalindrome(x));
          }
            
        }
    }
    
    


