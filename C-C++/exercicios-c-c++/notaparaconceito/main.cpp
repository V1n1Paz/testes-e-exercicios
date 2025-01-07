#include <iostream>

using namespace std;

int main()
{
    float nota;
    cout << "Inisira a nota: ";
    cin >> nota;
    if (nota < 6)
        cout << "Insuficiente";
    else if (nota < 7)
        cout << "Regular";
    else if (nota < 8)
        cout << "Bom";
    else if (nota < 9)
        cout << "Otimo";
    else
        cout << "Excelente";
    return 0;
}
