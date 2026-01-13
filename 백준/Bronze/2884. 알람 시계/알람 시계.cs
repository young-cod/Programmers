using System;

class program{
    static void Main(string[] args){
        string input = Console.ReadLine();

if (input == null) return;

string[] numbers = input.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

int hour = int.Parse(numbers[0]);
int minute = int.Parse(numbers[1]);

if (minute - 45 < 0)
{
    hour--;
    minute = 60 + (minute - 45);
    if (hour < 0) hour = 23;
}
else
{
    minute -= 45;
}

Console.WriteLine($"{hour:0} {minute:0}");
    }
}