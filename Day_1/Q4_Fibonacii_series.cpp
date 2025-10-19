#include <iostream>
using namespace std;

int main()
{
    int first = 0;
    int second = 1;
    int temp = 0;

    int num = 0;

    cout << "Enter the number : ";
    cin >> num;

    cout << "First " << num << " Fibonacii numbers are" << endl;
    for (int i = 1; i <= num; i++)
    {
        cout << first << " ";
        temp = first + second;
        first = second;
        second = temp;
    }

    return 0;
}
