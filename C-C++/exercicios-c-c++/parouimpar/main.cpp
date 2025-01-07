#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Insira um numero natural: ";
    cin >> n;
    if (n % 2 == 0)
        cout << "Esse numero eh par";
    else
        cout << "Esse numero eh impar";
    return 0;
}
