#include "pico/stdlib.h"

void blinkS( uint ledOut );         // Função para piscar a letra S
void blinkO( uint ledOut );         // Função para piscar a letra O
void blinkLetterInterval( void );   // Função para intervalo entre letras

#define ledOutBlue 12       // Pino de saída do LED azul

int main()
{
    stdio_init_all();                       // Inicializa a comunicação serial   
    gpio_init( ledOutBlue);                 // Inicializa o pino de saída do LED azul
    gpio_set_dir(ledOutBlue, GPIO_OUT);     // Define o pino do LED azul como saída

    while (true) {                      // Loop infinito
        blinkS( ledOutBlue );           // Piscar a letra S
        blinkLetterInterval();          // Intervalo entre letras
        blinkO( ledOutBlue );           // Piscar a letra O 
        blinkLetterInterval();          // Intervalo entre letras
        blinkS( ledOutBlue );           // Piscar a letra S
        sleep_ms( 3000 );               // Intervalo final
    }
}

void blinkS( uint ledOut ){             // Função para piscar a letra S
    for (uint i = 0; i < 3; i++){       // Loop para piscar a letra S
        gpio_put(ledOut, true);         // Acende o LED indicado
        sleep_ms(200);                  // Aguarda 200ms
        gpio_put(ledOut, false);        // Apaga o LED indicado
        if ( i != 2 )                   // Se não for a última repetição da letra
            sleep_ms(125);              // Aguarda 125ms //
    }
}

void blinkO ( uint ledOut ){            // Função para piscar a letra O
    for ( uint i = 0; i < 3; i++ ){     // Loop para piscar a letra O
        gpio_put(ledOut, true);         // Acende o LED indicado
        sleep_ms(800);                  // Aguarda 800ms
        gpio_put(ledOut, false);        // Apaga o LED indicado
        if ( i != 2 )                   // Se não for a última repetição da letra
            sleep_ms(125);              // Aguarda 125ms
    }
}

void blinkLetterInterval( void ){       // Função para intervalo entre letras
    sleep_ms(250);                      // Aguarda 250ms
}