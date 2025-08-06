import java.util.Scanner;
public class ReplaceBignumonRigthside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++)
            a[i]=sc.nextInt();
        int max=-1;
        for(int i=num-1;i>=0;i--){

            int current=a[i];
            a[i]=max;

            if(current>max)
                max=current;
        }
        for(int i=0;i<num;i++){
            System.out.print(a[i]+" ");
        }
    }
}
