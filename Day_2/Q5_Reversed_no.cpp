#include <iostream>
#include <string>
using namespace std;

int main()
{
    string num;
    string str;

    cout << "Enter a number: ";
    cin >> num;

    for (int i = num.length() - 1; i >= 0; i--)
    {
        str += num[i];
    }

    cout << "Reverse of " << num << " is " << str;

    return 0;
}
