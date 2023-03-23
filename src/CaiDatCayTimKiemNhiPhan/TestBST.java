package CaiDatCayTimKiemNhiPhan;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree=new BST<>();
        tree.insert("Geogre");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Peter");
        tree.insert("Jones");
        System.out.println("in cái gì đây: ");
        tree.inorder();
        System.out.println("Số phần tử node : "+tree.getSize());
    }
}
