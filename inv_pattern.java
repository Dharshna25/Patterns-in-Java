import java.util.Scanner;
class inv_pattern{
    public static void main(String args[])
    {
        int n;
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}