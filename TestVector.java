public class TestVector 
{
    public static void main(String[] args) 
    {
        var test = new MyVector<>();
        test.ArrWeight(24);
        test.addElement(7);
        test.addElement(4.5);
        test.addElement("Chainsow");
        test.addElement(-99);
        test.addElement("Man");
        test.printArray();
        System.out.println("=============================================================\n");
        test.get(4);
        test.get(3);
        test.get(2);
        test.get(1);
        test.get(0);
        System.out.println("=============================================================");
        System.out.println("\n"+"Size is "+test.size()+"\n");
        System.out.println("=============================================================\n");
        test.rmElement(100000);
        test.get(1);
        System.out.println("=============================================================\n");
        test.rmElement(1);
        test.get(1);
        System.out.println("=============================================================\n");
        test.addElement(10);
        test.printArray();
        System.out.println("=============================================================\n");
        test.addIndex(9, 5);
        test.printArray();
        System.out.println("=============================================================\n");
        test.rmLast();
        test.printArray();
        System.out.println("=============================================================\n");
        System.out.println("Size is "+test.size()+"\n");
        test.clear();
        System.out.println("=============================================================\n");
        System.out.println("After the clear() size is "+test.size()+"\n");
    }
}