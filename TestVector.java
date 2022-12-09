public class TestVector 
{
    public static void main(String[] args) 
    {
        var test = new MyVector<>();
        test.ArrWeight(24); //задан начальный размер массива
        test.addElement(7); //добавить элементы
        test.addElement(4.5);
        test.addElement("Chainsow");
        test.addElement(-99);
        test.addElement("Man");
        test.printArray(); //вывод массива
        System.out.println("=============================================================\n");
        test.printElement(4); //вывод по индексу
        test.printElement(3);
        test.printElement(2);
        test.printElement(1);
        test.printElement(0);
        //test.printElement(26);  //проверка Exception
        System.out.println("=============================================================");
        System.out.println("\n"+"Size is "+test.size()+"\n"); //вывод кол-ва элементов
        System.out.println("=============================================================\n");
        test.rmElementByIndex(100000); //проверка Exception
        test.printElement(1);
        System.out.println("=============================================================\n");
        test.rmElementByIndex(1); //удаление по индексу со смещением
        test.printElement(1);
        System.out.println("=============================================================\n");
        test.addElement(10);
        test.printArray();
        System.out.println("=============================================================\n");
        test.addByIndex(9, 3); //добавление по идексу со смещением
        test.printArray();
        System.out.println("=============================================================\n");
        test.rmLast(); //удаление последнего э-та
        test.printArray();
        System.out.println("=============================================================\n");
        System.out.println("Size is "+test.size()+"\n");
        test.clear(); //очистка массива
        System.out.println("=============================================================\n");
        System.out.println("After the clear() size is "+test.size()+"\n");
    }
}