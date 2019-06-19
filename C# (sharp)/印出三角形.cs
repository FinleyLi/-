using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Console_Trangle
{
    class Program
    {
        static void Main(string[] args)
        {
            //金字塔(pyramid)
            int num, space;

            while (true)
            {

                Console.Write("請輸入 1 到 9 之間的數字：");

                num = Convert.ToInt32(Console.ReadLine());

                space = num - 1;

                for (int i = 1; i <= num; i++)
                {
                    for (space = 1; space <= (num - i); space++)
                    {
                        Console.Write(" ");
                    }
                    for (int j = 1; j <= i; j++)
                    {
                        Console.Write(j);
                    }
                    for (int k = (i - 1); k >= 1; k--)
                    {
                        Console.Write(k);
                    }
                    Console.WriteLine();
                }
            }
            //
            /*
            //弗洛伊德的三角形(Floyd's Triangle)
            Console.Write("請輸入行數 : ");

            int rows = Convert.ToInt32(Console.ReadLine());
            int num = 1;

            for (int i = 1; i <= rows; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write(num + " ", num++);
                }
                Console.Write("\n");
            }
            */

            /*
            for (int i = 0; i <= 4; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write(" ");
                }
                for (int k = 9 - (i * 2); k >= 1; k--)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
            */

            /*
            for (int i = 2; i <= 9; i++)
            {
                for (int j = 1; j <= 9; j++)
                {
                    Console.Write(i + "*" + j + "=" + (i * j).ToString("00") + " ");
                }
                Console.Write("\r\n");
            }
            */
            Console.Write("Press any key to continue...");
            Console.ReadKey();
        }
    }
}
