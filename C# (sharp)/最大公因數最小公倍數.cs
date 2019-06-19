using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Console_GCDandLCM
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("Enter First Number : ");
                int fa = Convert.ToInt32(Console.ReadLine());
                Console.Write("Enter Second Number : ");
                int fb = Convert.ToInt32(Console.ReadLine());
                int gcd = GCD(fa, fb);
                int lcm = gcd * (fa / gcd) * (fb / gcd);
                Console.WriteLine("GCD({0},{1}) = {2} , LCM({3},{4}) = {5}", fa, fb, gcd, fa, fb, lcm);
            }
        }

        private static int GCD(int a, int b)
        {
            if (a % b == 0)
                return b;
            else
                return GCD(b, a % b);
        }
    }
}
