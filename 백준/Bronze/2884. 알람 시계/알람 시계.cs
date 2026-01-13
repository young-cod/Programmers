using System;

class program{
    static void Main(string[] args){
  string input = Console.ReadLine();

  if (input == null) return;

  string[] numbers = input.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

  int hour = int.Parse(numbers[0]);
  int minute = int.Parse(numbers[1]);

  minute -= 45;
  if (minute < 0)
  {
      hour--;
      minute += 60;
      if (hour < 0) hour = 23;
  }

  Console.WriteLine($"{hour:0} {minute:0}");
    }
}