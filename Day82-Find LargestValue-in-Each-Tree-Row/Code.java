class Solution {
    LinkedList<TreeNode>q=new LinkedList<TreeNode>();
    List<Integer>l=new ArrayList<>();
    List<Integer>b=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)return new ArrayList<>();
        level(root);
        return l;
    }
    public void level(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.addLast(p);
        while(q.isEmpty()==false)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                b.add(p.val);
                
                if(p.left!=null)q.addLast(p.left);
                if(p.right!=null)q.addLast(p.right);

            }
            l.add(Collections.max(b));
            b=new ArrayList<>();


        }
    }
}
