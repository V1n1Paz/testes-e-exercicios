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
        cout << "Insira o " << cont + 1 << "º item da lista: ";
        cin >> numero;
        if (numero < menor)
            menor = numero;
    }

    cout << "\n\n    O menor número da sua lista é: " << menor << "\n\n";
    return 0;
}
