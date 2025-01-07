#include <iostream>

using namespace std;

int main()
{
    int dias_de_atraso;
    float valor_da_multa;
    cout << "Insira a quantidade de dias de atraso:  ";
    cin >> dias_de_atraso;
    switch(dias_de_atraso)
    {
        case 1:
        case 2:
        case 3:
            valor_da_multa = dias_de_atraso*0.5;
            break;
        case 4:
        case 5:
            valor_da_multa = dias_de_atraso;
            break;
        default:
            valor_da_multa = dias_de_atraso*2;
            break;
    }
    cout << "Para " << dias_de_atraso<< " o valor da multa eh de R$" << valor_da_multa << ".";
    return 0;
}
