#include <iostream>
using namespace std;

int main()
{
    int num, sum = 0;
    cout << "Enter a number: ";
    cin >> num;

    for (int i = 1; i <= num; i++)
    {
        if (i % 2 != 0)
        {
            sum += i;
        }
    }
    cout << "Sum of first " << num << " odd numbers is " << sum;

    return 0;
}
