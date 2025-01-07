#include <iostream>

using namespace std;

int fatorial(int n)
{
    int factorial = 1;
    for ( n; n > 1; n--)
    {
        factorial *=n;
    }
    return factorial;
}

int main()
{
    int n;
    setlocale(LC_ALL,"");
    cout << "Insira um número inteiro positivo: ";
    cin >> n;
    cout <<"O fatorial desse número é:  "<< fatorial(n);
    return 0;
}

