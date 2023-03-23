package CaiDatCayTimKiemNhiPhan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    // cài đặt lớp TreeNode
    public TreeNode(E e) {
        element = e;
    }
}
