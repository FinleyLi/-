using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Console_GetArea
{
    class Program
    {
        class Rectangle
        {
            //member variables
            private double length;
            public double width;

            public void Acceptdetails()
            {
                Console.WriteLine("Emter Length: ");
                length = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Width: ");
                width = Convert.ToDouble(Console.ReadLine());
            }

            //計算平行四邊形面積: 長*寬 (平方單位)
            public double GetArea()
            {
                return length * width;
            }
            public void Display()
            {
                Console.WriteLine("Length: {0}", length);
                Console.WriteLine("Width: {0}", width);
                Console.WriteLine("Area: {0}", GetArea());
            }
        }//end class Rectangle

        class ExecuteRectangle
        {
            static void Main(string[] args)
            {
                Rectangle r = new Rectangle();
                //r.length = 4.5;
                //r.width = 3.5;
                r.Acceptdetails();
                r.Display();
                Console.Read();

                Console.Clear();
                Console.WriteLine("Width: {0}", r.width);//public
                Console.WriteLine("Hello, World!");
                Console.ReadKey();//Any key

                /*

                Console.Clear();
                Console.WriteLine("Hello, World!");
                Console.ReadKey();

                */
            }
        }

    }
}
