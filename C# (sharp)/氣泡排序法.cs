using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Console_BubbleSort
{
    class Program
    {
        public static void BubbleSort(int[] list)
        {
            int len = list.Length;
            for(int i=1; i<=len; i++)//執行的回數
                for (int j=1; j<=len-i; j++)//執行的次數
                {
                    if (list[j] < list[j-1])
                    {
                        //二數交換
                        int temp = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = temp;
                    }
                }
        }

        static void Main(string[] args)
        {
            int[] list = { 2, 3, 1, 6, 2, 9, 4, 1, 7 };
            Console.WriteLine("排序數列");
            for (int i = 0; i < list.Length; i++)
                Console.Write(list[i] + "");

            //氣泡排序
            BubbleSort(list);

            Console.WriteLine("\r\n排序後數列");
            for (int i = 0; i < list.Length; i++)
                Console.Write(list[i] + "");
            Console.ReadLine();
        }
    }
}
