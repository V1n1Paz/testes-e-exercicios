#include <iostream>

using namespace std;

int main()
{
    setlocale(LC_ALL,"");

    int tamanho_lista, numero, menor = 2147483647;
    cout << "Insira o tamanho da lista: ";
    cin >> tamanho_lista;

    for (int cont = 0; cont < tamanho_lista; cont++)
    {
        cout << "Insira o " << cont + 1 << "� item da lista: ";
        cin >> numero;
        if (numero < menor)
            menor = numero;
    }

    cout << "\n\n    O menor n�mero da sua lista �: " << menor << "\n\n";
    return 0;
}
