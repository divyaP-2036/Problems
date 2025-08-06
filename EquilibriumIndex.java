public class EquilibriumIndex {
    public static void main(String[] args) {
       // int a[]={1,2,3};
        int a[] ={-7,1,5,2,-4,3,0};
        int index=1;
        int sum1=0,sum2=0,f=0;
        while(index<a.length-1){
            sum1=0;sum2=0;
            for(int i=0;i<index;i++){
                sum1+=a[i];
            }
            for(int j=index+1;j<a.length;j++){
                sum2+=a[j];
            }
            if(sum1==sum2) {
                f=1;
                break;
            }
            else
                index++;
        }
        if(f==1)
            System.out.println(index);
        else
            System.out.println(-1);
    }
}
