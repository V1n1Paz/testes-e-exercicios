#include <iostream>

using namespace std;

int main()
{
    int n1, n2;
    float resultado;
    char sinal;
    cout << "Numero: " ;
    cin >> n1;
    cout << "Operação( +, -, *, / ): ";
    cin >> sinal;
    cout << "Numero: " ;
    cin >> n2;
    if (sinal == '+')
    {
        resultado = n1 + n2;
        cout << "A soma eh:  " << resultado;
    }
    else if (sinal == '-')
    {
        resultado = n1 - n2;
        cout << "A diferenca eh:  " << resultado;
    }
    else if (sinal == '*')
    {
        resultado = n1 * n2;
        cout << "O produto eh:  " << resultado;
    }
    else if (sinal == '/')
    {
        resultado = n1 / n2;
        cout << "A divisao eh:  " << resultado;
    }
    return 0;
}
