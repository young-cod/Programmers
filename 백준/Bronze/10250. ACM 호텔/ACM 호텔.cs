using System;

class Program{
    static void Main(string[] args){
         string input = Console.ReadLine();
if (int.TryParse(input, out int val))
{
    for (int i = 0; i < val; i++)
    {
        string numStrs = Console.ReadLine();
        string[] nums = numStrs.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        if (nums.Length < 3) continue;

        int h = int.Parse(nums[0]);
        int w = int.Parse(nums[1]);
        int n = int.Parse(nums[2]);

        int yy = n % h;
        int xx = (n / h) + 1;

        if (yy == 0) 
        {
            yy = h;
            xx = n / h;
        }

        Console.WriteLine($"{yy}{xx:D2}");
    }
}
    }
}