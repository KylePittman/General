package com.michaelalizzzyyy.school.programming.assignment.thirteen;

//Michaela Dinman
public class Tree
{
	private TreeNode root;
	
	public Tree()
	{
		root = null;
	}
	
	public void insert(int num)
	{
		TreeNode temp = root;
		TreeNode toBeAdded = new TreeNode(num);
		boolean done = false;
		
		if (this.isEmpty())
		{
			root = toBeAdded;
		}
		else
		{
			while (!done)
			{
				if (num > temp.getInfo())
				{
					if (temp.getRight() != null)
						temp = temp.getRight();
					else
					{
						temp.setRight(toBeAdded);
						done = true;
					}
				}
				if (num < temp.getInfo())
				{
					if (temp.getLeft() != null)
						temp = temp.getLeft();
					else
					{
						temp.setLeft(toBeAdded);
						done = true;
					}
				}
			}
			done = false;
		}
		System.out.println("inserted " + num);
	}
	
	public void delete(int num)
	{
		TreeNode temp = root;
		TreeNode previous = root;
		TreeNode toBeDeleted = root;
		TreeNode temp2 = root;
		boolean found = false;
		boolean thing = false;
		if (this.isEmpty())
			System.out.println("Nothing to be deleted");
		
		if (root.getInfo() == num)
		{
			if (root.getRight() == null && root.getLeft() == null)
				root = null;
				
			else 
			{
				toBeDeleted = root;
				temp = temp.getRight();
					previous = getSecondFarthestLeft(temp);
					temp = getFarthestLeft(temp);

						int x = toBeDeleted.getInfo();
						toBeDeleted.setInfo(temp.getInfo());
						temp.setInfo(x);
						previous.setLeft(temp.getRight());
						root = toBeDeleted;
                        return;
				
			}
		}
		
		else
		{
			while (!found)
			{
				if (num < temp.getInfo())
				{
					if (temp.getLeft() != null)
					{
						previous = temp;
						temp = temp.getLeft();
					}
					else
					{
						System.out.println(num + " is not in tree");
						return;
					}
				}
			
				if (num > temp.getInfo())
				{
					if (temp.getRight() != null)
					{
						previous = temp;
						temp = temp.getRight();
					}
					else
					{
						System.out.println(num + " is not in tree");
						return;
					}
				}
				if (num == temp.getInfo())
				{
					found = true;
				}
			}
			//found = false;
			
			//!!we have found node!!
			if (num == temp.getInfo())
			{
				//finding node to be deleted's children
				if (hasNoChildren(temp))
				{
					if (isLeftFrom(temp, previous))
						previous.setLeft(null);
					else
						previous.setRight(null);
				}
				if (hasOneChildLeft(temp))
				{
					if (isRightFrom(temp, previous))
						previous.setRight(temp.getLeft());
					else
						previous.setLeft(temp.getLeft());
				}
				if (hasOneChildRight(temp))
				{
					if (isLeftFrom(temp, previous))
						previous.setLeft(temp.getRight());
					else
						previous.setRight(temp.getRight());
				}
				if (hasTwoChildren(temp))
				{
                    toBeDeleted = temp;
                    temp2 = temp.getRight();
                    previous = getSecondFarthestLeft(temp2);
                    temp2 = getFarthestLeft(temp2);

                    int x = toBeDeleted.getInfo();
                    toBeDeleted.setInfo(temp2.getInfo());
                    temp2.setInfo(x);
                    previous.setLeft(temp2.getRight());
                    temp = toBeDeleted;
                    return;
				}
			}
		}
		
		System.out.println("deleted " + num);
	}
	
	public void inorder()
	{
		do_inorder(root);
		System.out.println();
	}
	
	public void preorder()
	{
		do_preorder(root);
		System.out.println();
	}
	
	public void postorder()
	{
		do_postorder(root);
		System.out.println();
	}
	
	private void do_inorder(TreeNode t)
	{
		if (t != null)
		{
			do_inorder(t.getLeft());
			System.out.print(t.getInfo() + "\t");
			do_inorder(t.getRight());
		}
	}
	
	private void do_preorder(TreeNode t)
	{
		if (t != null)
		{
			System.out.print(t.getInfo() + "\t");
			do_preorder(t.getLeft());
			do_preorder(t.getRight());
		}
	}
	private void do_postorder(TreeNode t)
	{
		if (t != null)
		{
			do_postorder(t.getLeft());
			do_postorder(t.getRight());
			System.out.print(t.getInfo() + "\t");
		}
	}
	
	private boolean isEmpty()
	{
		if (root == null)
			return true;
		return false;
	}
	
	private boolean hasNoChildren(TreeNode meh)
	{
		if (meh.getRight() == null && meh.getLeft() == null)
			return true;
		return false;
	}
	
	private boolean hasOneChildRight(TreeNode meh)
	{
		if (meh.getRight() != null && meh.getLeft() == null)
			return true;
		return false;
	}
	
	private boolean hasOneChildLeft(TreeNode meh)
	{
		if (meh.getRight() == null && meh.getLeft() != null)
			return true;
		return false;
	}
	
	public boolean hasTwoChildren(TreeNode meh)
	{
		if (meh.getRight() != null && meh.getLeft() != null)
			return true;
		return false;
	}
	
	private boolean isRightFrom(TreeNode meh, TreeNode bleh) //if meh to the right of (bigger than) bleh
	{
		if (meh.getInfo() > bleh.getInfo())
			return true;
		return false;
	}
	
	private boolean isLeftFrom(TreeNode meh, TreeNode bleh) //if meh is to the left of (less than) bleh
	{
		if (meh.getInfo() < bleh.getInfo())
			return true;
		return false;
	}
	
	private TreeNode getFarthestLeft(TreeNode meh)
	{
		boolean done = false;
        if(meh != null) {
            while (!done) {
                if (meh.getLeft() != null)
                    meh = meh.getLeft();
                else {
                    done = true;
                    return meh;
                }
            }
        }
		return meh;
	}

    private TreeNode getSecondFarthestLeft(TreeNode meh)
    {
        boolean done = false;
        if (meh != null) {
            while (!done) {

                if (meh.getLeft() != null && meh.getLeft().getLeft() != null) {
					meh = meh.getLeft();
				}
				else {
                    done = true;
                    return meh;
                }
            }
        }
        return meh;
    }
}