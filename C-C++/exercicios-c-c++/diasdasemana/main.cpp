#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Insira um numero inteiro de 1 a 7: " ;
    cin >> n;
    switch(n)
    {
        case 7:
            cout << "Sabado";
            break;
        case 6:
            cout << "Sexta";
            break;
        case 5:
            cout << "Quinta";
            break;
        case 4:
            cout << "Quarta";
            break;
        case 3:
            cout << "Terca";
            break;
        case 2:
            cout << "Segunda";
            break;
        case 1:
            cout << "Domingo";
            break;
    }
    return 0;
}
