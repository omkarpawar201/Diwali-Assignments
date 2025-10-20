// Given an integer x, return true if x is a palindrome, and false otherwise.

#include <iostream>
using namespace std;

int main()
{
    int num, temp = 0, num2 = 0;

    cout << "Enter a number : ";
    cin >> num;

    int org_num = num;

    while (num != 0)
    {
        temp = num % 10;
        num2 = num2 * 10 + temp;
        num = num / 10;
    }

    if (org_num == num2)
    {
        cout << "The number is palindrome";
    }
    else
    {
        cout << "The number is not palindrome";
    }
}