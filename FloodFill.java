public class FloodFill {

    static int m=8;
    static int n=8;

    static void floodFillFull(int[][] paint, int x,int y , int preclr, int newclr){

        if(x<0 || x>=m || y<0 || y>=n)
            return;
        if(paint[x][y] != preclr)
            return;

        paint[x][y]=newclr;

        floodFillFull(paint,x+1,y,preclr,newclr);
        floodFillFull(paint,x-1,y,preclr,newclr);
        floodFillFull(paint,x,y+1,preclr,newclr);
        floodFillFull(paint,x,y-1,preclr,newclr);

    }
    static void floodFill(int[][] paint, int x,int y, int newclr){
        int preclr = paint[x][y];
        if(preclr==newclr)
            return;
        floodFillFull(paint,x,y,preclr,newclr);
    }
    public static void main(String[] args) {
        int paint[][]={
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},};
        int x=4,y=4,newclr=3;
        floodFill(paint, x, y, newclr);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(paint[i][j]+" ");
            }
            System.out.println();
        }
    }
}
