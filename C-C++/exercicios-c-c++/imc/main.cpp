#include <iostream>
using namespace std;
int main()
{
    float imc, altura, peso;
    cout << "Insira a sua altura: ";
    cin >> altura;
    cout << "Insira o seu peso ";
    cin >> peso;
    imc = peso / (altura*altura);
    cout << "O seu IMC eh: " << imc << endl;
    if (imc < 18.5)
        cout << "Voce esta abaixo do peso";
    else if (imc < 25)
        cout << "Voce tem um peso normal";
    else if (imc < 30)
        cout << "Voce esta em sobrepeso";
    else
        cout << "Voce esta obeso";
    return 0;
}
