#include <iostream>

using namespace std;

int main()
{
    string password, user;
    cout << "Insira o nome de usuário: ";
    cin >> user;
    cout << "Insira a senha: ";
    cin >> password;
    if (user != "admin")
        cout << "Login invalido";
    else if ( password !=  "admin123")
        cout << "Login invalido";
    else
        cout << "Login bem-sucedido";
    return 0;
}
