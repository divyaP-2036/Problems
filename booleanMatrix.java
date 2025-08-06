public class booleanMatrix {
    static void booleanmat(int mat[][]){
        int row=mat.length,col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    for(int indx=0;indx<row;indx++){
                        if(mat[indx][j]==0)
                            mat[indx][j]=-1;
                    }
                    for(int indx=0;indx<col;indx++){
                        if(mat[i][indx]==0)
                            mat[i][indx]=-1;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==-1)
                    mat[i][j]=1;
            }
        }
    }


    public static void main(String[] args) {
        int mat[][]={{1,0,0,1},{0,0,1,0},{0,0,0,0}};
        booleanmat(mat);
        for(int[] row:mat){
            for(int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
