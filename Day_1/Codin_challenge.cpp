#include <iostream>
using namespace std;

int main()
{
    int n;
    int temp = 0;
    int max = 0;

    cout << "Enter number of strings : ";
    cin >> n;

    string arr[n];

    cout << "Enter array strings" << endl;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++)
    {
        temp = arr[i].length();

        if (temp > max)
        {
            max = temp;
        }
    }

    cout << "Length of the longest string: " << max;

    return 0;
}
