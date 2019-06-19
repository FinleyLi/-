using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Console_BinarySearch
{
    class Program
    {
        private static int binarySearch(int[] list, int SearchKey)
        {
            int left = 0;
            int right = list.Length;
            while (left <= right)
            {
                int mid = (left + right) / 2;//取中間位子當基準
                if (list[mid] == SearchKey)
                {
                    return mid;//找到的index值
                }
                else
                {
                    if (list[mid] < SearchKey)//在右邊的數列
                    {
                        left = mid + 1;
                    }
                    else//在左邊的數列
                    {
                        right = mid - 1;
                    }
                }

            }
            return -1;//找不到時
        }
        static void Main(string[] args)
        {
            int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            Console.WriteLine("原始數字串");
            for (int i = 0; i < list.Length; i++)
            {
                Console.Write(list[i] + " ");
            }
            Console.WriteLine("\r\n請輸入要查詢的數字:");
            int SearchKey = Convert.ToInt32(Console.ReadLine());
            int index = binarySearch(list, SearchKey);
            if (index == -1)
            {
                Console.WriteLine("找不到資料!");
            }
            else
            {
                Console.WriteLine("查到的索引位置:" + index);
            }
            Console.ReadLine();
        }
    }
}
