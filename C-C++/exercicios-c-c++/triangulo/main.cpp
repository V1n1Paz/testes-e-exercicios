#include <iostream>

using namespace std;

int main()
{
    float a, b , c;
    cout << "Insira tres numeros" << endl;
    cin >> a >> b >> c;
    if (a > b + c)
        cout << "Com esses valores eh possivel formar um triangulo1";
    else if (b > a + c)
        cout << "Com esses valores eh possivel formar um triangulo1";
    else if (c > a + b)
        cout << "Com esses valores eh possivel formar um triangulo1";
    else
        cout << "Impossivel formar um triangulo com esses valores1";

    return 0;
}