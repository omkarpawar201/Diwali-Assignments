#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int fact = 1;

    if (num == 0)
    {
        cout << "Factorial of 0 is 0";
    }
    else
    {
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        cout << "Factorial of " << num << " is " << fact;
    }

    return 0;
}
