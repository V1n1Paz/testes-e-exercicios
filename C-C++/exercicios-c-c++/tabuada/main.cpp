#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Insira um numero inteiro: ";
    cin >> n;
    for (int cont = 1; cont <=10; cont++)
    {
        cout << n <<" x " << cont << "  =  " << n*cont << endl;
    }
    return 0;
}
