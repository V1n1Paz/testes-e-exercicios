#include <iostream>

using namespace std;

int main()
{
    setlocale(LC_ALL,"");
    float n1, n2;
    for (int cont = 1; cont <= 3; cont++)
    {
        cout << cont << "� subtra��o.\nInsira dois n�meros.\n";
        cin >> n1 >> n2;
        cout << "A diferen�a entre esses dois numeros �: " << n1 - n2 << "\n\n-----------------------------------------------------\n\n";
    }
    return 0;
}

