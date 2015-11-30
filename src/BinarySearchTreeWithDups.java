import java.util.*;

public class BinarySearchTreeWithDups<T extends Comparable<? super T>> extends BinarySearchTree<T>
		implements SearchTreeInterface<T>, java.io.Serializable {

	public BinarySearchTreeWithDups() {
		super();
	}

	public BinarySearchTreeWithDups(T rootEntry) {
		super(rootEntry);
		setRootNode(new BinaryNode<T>(rootEntry));
	}

	@Override
	public T add(T newEntry)
    {
		T result = null;
		if (isEmpty())
			setRootNode(new BinaryNode<T>(newEntry));
		else
			result = addEntryHelper(newEntry);
		return result;
	}

	// ??? IMPLEMENT THIS METHOD
	private T addEntryHelper(T newEntry) {

        BinaryNodeInterface<T> currentNode = getRootNode();
        assert currentNode != null;
        boolean found = false;

        while (!found)
        {
            T currentEntry = currentNode.getData();
            int comparison = newEntry.compareTo(currentEntry);

            if (comparison >= 0)
            {
                //then check currentEntry for rightChild
                if(currentNode.hasRightChild())
                {
                    currentNode = currentNode.getRightChild();
                }
                else //currentNode does not have a rightChild so create binaryNode and add data to newBinary Node
                {
                    found = true;
                    currentNode.setRightChild(new BinaryNode<T>(newEntry));
                }
            } else
            {
                if (currentNode.hasLeftChild())
                {
                    currentNode = currentNode.getLeftChild();
                }
                else
                {
                    found = true;
                    currentNode.setLeftChild(new BinaryNode<T>(newEntry));
                } // end if
            }
        }
        return null;
	}



    public void print(String str)
    {
        System.out.print(str);
    }


	// ??? IMPLEMENT THIS METHOD
	public ArrayList<T> getAllEntriesIterative(T searchVal) {
		// this initial code is meant as a suggestion to get your started- feel
		// free to use it or delete it!
		BinaryNodeInterface<T> currentNode = getRootNode();
		ArrayList<T> entryList = new ArrayList<T>();

		// while(currentNode!=null) {
		// }
		
		return entryList;
	}

	// ??? IMPLEMENT THIS METHOD
	public ArrayList<T> getAllEntriesRecursive(T searchVal) {
		// this initial code is meant as a suggestion to get your started- feel
		// free to use it or delete it!
		BinaryNodeInterface<T> rootNode = getRootNode();
		ArrayList<T> entryList = new ArrayList<T>();
		// getAllEntriesHelper(searchVal, rootNode, entryList);
		
		return entryList;
	}

	// ??? IMPLEMENT THIS METHOD
	public ArrayList<T> getAllEntriesLessThanIterative(T searchVal) {
		// this initial code is meant as a suggestion to get your started- feel
		// free to use it or delete it!
		ArrayList<T> entryList = new ArrayList<T>();

		// Hint: consider using a stack to mimic recursion!
		// Stack<BinaryNodeInterface<T>> nodeStack = new
		// Stack<BinaryNodeInterface<T>>();
		// nodeStack.push(getRootNode());

		// while(!nodeStack.isEmpty()) {
		// }
		
		return entryList;
	}

	// ??? IMPLEMENT THIS METHOD
	public ArrayList<T> getAllEntriesLessThanRecursive(T searchVal) {
		// this initial code is meant as a suggestion to get your started- feel
		// free to use it or delete it!
		BinaryNodeInterface<T> rootNode = getRootNode();
		ArrayList<T> entryList = new ArrayList<T>();
		// getAllEntriesLessThanHelper(searchVal, rootNode, entryList);
		
		return entryList;
	}



}