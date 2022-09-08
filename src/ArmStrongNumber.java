public class ArmStrongNumber {

    public static void main(String[] args) {
        // 153--- 1*1*1+5*5*5+3*3*3=1+125+27=153

        int num=123,rev=0,rem,temp=num;
        while(num>0){
            rem=num%10; //3
            num=num/10;
            rev=rev+(rem*rem*rem);
        }
        System.out.println("rev ="+rev);
        if(temp==rev){
            System.out.println("given number is armstrong number");
        }else{
            System.out.println("given number is not an armstrong number");
        }

    }
}
