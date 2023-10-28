class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr.length==1)
            return 1;
       Arrays.sort(arr);
        int ans[] = new int[arr.length];
        HashMap<Integer,Long> map = new HashMap<>();
        ans[0] = 1;
            map.put(arr[0],1L);
        long count = 0L;
        for(int i=1;i<arr.length;i++){
            count = 1L;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0&&map.containsKey(arr[i]/arr[j])){
                    count+=map.get(arr[j])*map.get(arr[i]/arr[j]);
                }
            }
            map.put(arr[i],count);
        }
        long sum = 0;
        for (Integer n : map.keySet()) {
            sum = (sum + map.get(n)) % ((int) Math.pow(10, 9) + 7) ;
        }
        return (int) sum;
    }
}
