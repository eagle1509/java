/**
 * Created by wangce on 2017/2/12.
 */

/*public class StaticApply
{
    public static void main(String[] args)
    {
        int[] arr = {3,4,1,6,8,9,10};
        int max = getMax(arr);
        System.out.println("max="+max);
    }
    public static int getMax(int[] arr)
    {
        int max = 0;
        for(int x = 1; x<arr.length; x++)
        {
            if (arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }
}
*/

class ArrTools
{
    public static int getMax(int[] arr)
    {
    int max = 0;
    for(int x = 1; x<arr.length; x++)
        {
         if (arr[x]>arr[max])
            max = x;
         }
    return arr[max];
    }
    public static int getMin(int[] arr)
    {
        int min = 0;
        for(int x = 1; x<arr.length; x++)
        {
            if (arr[x]<arr[min])
                min = x;
        }
        return arr[min];
    }
    public static void bubbleSort(int[] arr)
    {
        for (int x = 0; x<arr.length-1; x++)
        {
            for(int y = 0; y<arr.length-x-1; y++)
            {
                if(arr[y]>arr[y+1])
                {
                    swap(arr,y,y+1);
                }
            }
        }
    }
    public void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

class ArrayToolDemo
{
    public static void main(String[] args)
    {
        int [] arr = {3,1,4,5,6};
        ArrTools tool = new ArrTool();
        int max = tool.getMax(arr);
        System.out.println("max="+max);
    }
}
