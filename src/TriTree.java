
public class TriTree {
	
	public TriNode root;
	public TriTree()
	{
		root = null;
	}
	public void insert( int val){
		root = insert (val, root);
	}
	
	public void remove( int val)
	{
		root = remove(val, root);
	}
	
	private TriNode insert( int n, TriNode cur)
	{
		if (cur == null)
			return new TriNode(n);
		int comp = n - cur.val;
		
		if (comp > 0)
			cur.right = insert(n, cur.right);
		else if (comp == 0)
			cur.mid = insert(n, cur.mid);
		else
			cur.left = insert(n, cur.left);
		return cur;
	}
	
	private TriNode remove( int n, TriNode cur)
	{
		if (cur == null)
			return cur;
		int comp = n - cur.val;
		if (comp > 0)
			cur.right = remove(n, cur.right);
		else if(comp < 0)
			cur.left = remove(n, cur.left);
		else if(cur.mid != null)
			cur.mid = remove(n, cur.mid);
		else if(cur.left != null && cur.right != null) // has two children
		{
			cur.val = findMin(cur.right).val;
			cur.right = remove(cur.val, cur.right);
		}
		else
			cur = (cur.left != null) ? cur.left : cur.right;
		return cur;
	}
	
	private TriNode findMin(TriNode cur)
	{
		TriNode tmp = cur;
		while(tmp.left != null)
		{
			tmp = tmp.left;
		}
		return tmp;
	}
}
