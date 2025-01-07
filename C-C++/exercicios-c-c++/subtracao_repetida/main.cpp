#include <iostream>

using namespace std;

int main()
{
    setlocale(LC_ALL,"");
    float n1, n2;
    for (int cont = 1; cont <= 3; cont++)
    {
        cout << cont << "ª subtração.\nInsira dois números.\n";
        cin >> n1 >> n2;
        cout << "A diferença entre esses dois numeros é: " << n1 - n2 << "\n\n-----------------------------------------------------\n\n";
    }
    return 0;
}

