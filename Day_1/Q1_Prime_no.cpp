#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    int count = 0;

    if (num <= 1)
        count++;
    else
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                count++;
                break;
            }
        }
    }

    if (count == 0)
        cout << num << " Number is a Prime number.";
    else
        cout << num << " Number is not a Prime number.";

    return 0;
}
