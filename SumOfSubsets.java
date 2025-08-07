import java.util.*;

public class SumOfSubsets {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
        List<List<Integer>> ans= subsetFind(arr,target);
        System.out.println(ans);
    }
    public static List<List<Integer>> subsetFind(int arr[],int target){
        List<List<Integer>> res=new ArrayList<>();
        find(arr,0,target,new ArrayList<>(),res);
        return res;
    }
    static void find(int arr[],int idx, int target,List<Integer> cur,List<List<Integer>> res){
        if(idx== arr.length){
            if(target==0)
                res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[idx]);
        find(arr,idx+1,target-arr[idx],cur,res);

        cur.remove(cur.size()-1);
        find(arr,idx+1,target,cur,res);
    }

}
