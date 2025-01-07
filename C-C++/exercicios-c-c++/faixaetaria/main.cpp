#include <iostream>

using namespace std;

int main()
{
    int idade;
    cout << "Insira a sua idade: ";
    cin >> idade;
    if (idade < 12)
        cout << "Voce eh uma crianca";
    else if (idade < 18)
        cout << "Voce eh um adolescente";
    else if (idade < 60)
        cout << "Voce eh um adulto";
    else
        cout << "Voce eh um idoso";


    return 0;
}
