#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;

    cout << "Prime numbers upto " << num << " are" << endl;
    for (int j = 2; j <= num; j++)
    {
        int count = 0;

        for (int i = 2; i < j; i++)
        {
            if (j % i == 0)
            {
                count++;
                break;
            }
        }

        if (count == 0)
        {
            cout << j << " ";
        }
    }

    return 0;
}
