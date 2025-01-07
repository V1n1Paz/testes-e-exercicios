#include <iostream>

using namespace std;

int main()
{
    int idade;
    cout << "Insira a sua idade:\n";
    cin >> idade;
    if (idade >= 18)
        cout << "Voce pode votar";
    else
        cout << "Voce nao pode votar";
    return 0;
}
