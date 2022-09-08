public class NumberPalindrome {

    public static void main(String[] args) {
        int num=121,rev=0,rem,temp=num;
        while(num>0){
            rem=num%10; //3
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println("reverse of a number is "+rev);
        if(temp==rev){ //121==121-->true
            System.out.println("given number is palindrome");
        }else{
            System.out.println("given number not a palindrome");
        }

    }
}
