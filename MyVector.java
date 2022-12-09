public class MyVector<T> 
{
    private int ArrLen;
    private int num = 9;
    private int count = 0;
    private Object[] Array;

    MyVector(){}

    MyVector(int ArrLen) 
    {
        this.ArrLen = ArrLen;
    }

    public int size() 
    {
        return count;
    }

    public void ArrWeight(int ArrLen) 
    {
        this.ArrLen = ArrLen;
        Array = new Object[ArrLen];
    }

    private void SetSize(int NewSize) 
    {
        Object[] newArray = new Object[NewSize];
        System.arraycopy(Array, 0, newArray, 0, count);
        Array = newArray;
    }

    public void printElement(int index) 
    {
        var element = Array[index];
        System.out.println(element+"\n");
    }

    public void addElement(T element) 
    {
        if (count == Array.length - 1) 
        {
            SetSize(Array.length * 3);
        }
        Array[count++] = element;
    }

    public void rmElementByIndex(int index) 
    {
        try
        {
            if (index>Array.length) 
            {
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }
            for (int i = index; i < count; i++) 
            {
                Array[i] = Array[i + 1];
            }
            Array[count] = null;
            count--;
            if (Array.length > ArrLen && count < Array.length / num) 
            {
                SetSize(Array.length / 3);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Index out of range");
        }
    }

    public void printArray() 
    {
        for (int i = 0; i < count; i++) 
        {
            System.out.println(Array[i]+"\n");
        }
    }

    public void addByIndex(T element, int index) 
    {
        if (count == Array.length - 1) 
        {
            SetSize(Array.length * 3);
        }

        try 
        {
            if (count<index) 
            {
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }

            for (int i = count - 1; i >= index; i--)   
            {   
                Array[i + 1] = Array[i];   
            }   

            Array[index] = element;   
            count++;   
   
        }

        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Index out of first range");
        }
    }

    public void clear() 
    {
        for (int i = 0; i < Array.length; i++) 
        {
            Array[i] = null;
        }
        count = 0;
        
        if (Array.length > ArrLen && count < Array.length / num) 
        {
            SetSize(Array.length / 3);
        }
    }

    public void rmLast() 
    {
        Array[count] = null;
        count--;
        if (Array.length > ArrLen && count < Array.length / num) 
        {
            SetSize(Array.length / 3);
        }
    }
}