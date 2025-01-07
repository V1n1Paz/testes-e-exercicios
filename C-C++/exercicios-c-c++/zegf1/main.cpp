#include <iostream>
#include <ctime>
using namespace std;

char gen();
char sel(char);
void prn();

int main()
{
    int seed = time(0);
    for (int cont = 0; cont < 5; cont++){
        srand(seed);
        cout << cont + 1 << ": " << endl;
        prn();
        seed+=rand();
    }
    return 0;
}

char gen(){

    char saida;
    int i = 1 + rand() % 5;
    switch(i){
        case 1: saida = 'A'; break;
        case 2: saida = 'E'; break;
        case 3: saida = 'I'; break;
        case 4: saida = 'O'; break;
        case 5: saida = 'U'; break;
    }
    return saida;
}

char sel(char mai){
    char minu;
    switch (mai){
        case 'A': minu = 'a'; break;
        case 'E': minu = 'e'; break;
        case 'I': minu = 'i'; break;
        case 'O': minu = 'o'; break;
        case 'U': minu = 'u'; break;
    }
    return minu;
}

void prn(){
    char letra = gen();
    cout << letra << endl << sel(letra) << "\n\n";
}
