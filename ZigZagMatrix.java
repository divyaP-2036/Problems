// given 2d array of n rows and m columns. print this matrix in zigzag fashion.
// input : 1 2 3   output : 1 2 4 7 5 3 6 8 9
//         4 5 6
//         7 8 9


public class ZigZagMatrix {
    public static void main(String[] args) {
        int m[][]={{1,2,3,4},{5,6,7,8}};
        int row=m.length;
        int column=m[0].length;

        for(int d=0;d<row+column-1;d++){
            if(d%2==0){
                for(int i=0;i<=d;i++){
                    int r=d-i;
                    int c=i;
                    if(r<row && c<column)
                        System.out.print(m[r][c]+" ");
                }
            }
            else{
                for(int i=0;i<=d;i++){
                    int r=i;
                    int c=d-i;
                    if(r<row && c<column)
                        System.out.print(m[r][c]+" ");
                }
            }
        }
    }
}
