public class ArmStrong {
    public void  Arm(int n){
        int a=0;
        int sum=0;
        int temp=n;
        while (n!=0){
            a=n%10;
            n=n/10;
            sum=sum+(a*a*a);
        }
        if(temp==sum){
            System.out.println("ArmStrong Number");
        }
        else {
            System.out.println("Not ArmStrong number");
        }
    }
}
