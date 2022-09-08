public class ReverseANumber {
    public static void main(String[] args) {
        int num=123;//321
        int rev=0;
        int rem;
       // System.out.println(123/10); //12
       // System.out.println(123%10);//3

        while(num>0){
            rem=num%10; //3
            num=num/10;
            rev=rev*10+rem;
        }

        System.out.println("reverse of a number is "+rev);

       /*// num  num>0    rem        num          rev
          123  123>0    123%10 =3  123/10 =12   0*10+3= 3
               12>0     12%10  =2   12/10 =1    3*10+2= 32
               1>0      1%10 =1      1/10= 0    32*10+1=321
               0>0 -false*/



    }
}
