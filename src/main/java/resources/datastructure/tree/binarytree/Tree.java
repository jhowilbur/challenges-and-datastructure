package resources.datastructure.tree.binarytree;

// Type for this class are generic <T>
// same implementation as in collections API for Java
public interface Tree<T>
{
    public void traversal();
    public void insert(T data);
    public void delete(T data);
    public T getMax();
    public T getMin();
}
