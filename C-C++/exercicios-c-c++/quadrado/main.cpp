#include <iostream>

using namespace std;

void imprimir_quadrado(int lado)
{
    for (int linha = 1; linha <= lado; linha++)
    {
        for (int coluna = 1; coluna <= lado; coluna++)
            cout << " *   ";
        cout << "\n\n";

    }

}
int main()
{
    int lado;
    cout << "Insira o lado do quadrado:  ";
    cin >> lado;
    imprimir_quadrado(lado);
    return 0;
}
