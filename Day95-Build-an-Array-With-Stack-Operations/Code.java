class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l1=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n;i>=1;i--){
            st.add(i);
        }
        int j=0;
        while(j!=target.length){
            if(!st.isEmpty()){
                if(st.pop()==target[j]){
                    l1.add("Push");
                    j++;
                }
                else{
                    l1.add("Push");
                    l1.add("Pop");
                }
            }
        }
        return l1;
    }
}
