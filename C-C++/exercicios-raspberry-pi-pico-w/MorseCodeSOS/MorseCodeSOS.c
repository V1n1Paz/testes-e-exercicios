#include "pico/stdlib.h"

void blinkS( uint ledOut );
void blinkO( uint ledOut );
void blinkLetterInterval( void );

#define ledOutBlue 12

int main()
{
    stdio_init_all();
    gpio_init( ledOutBlue);
    gpio_set_dir(ledOutBlue, GPIO_OUT);

    while (true) {
        blinkS( ledOutBlue );
        blinkLetterInterval();
        blinkO( ledOutBlue );
        blinkLetterInterval();
        blinkS( ledOutBlue );
        sleep_ms( 3000 );
    }
}

void blinkS( uint ledOut ){
    for (uint i = 0; i < 3; i++){
        gpio_put(ledOut, true);
        sleep_ms(200);
        gpio_put(ledOut, false);
        if ( i != 2 )
            sleep_ms(125);
    }
}

void blinkO ( uint ledOut ){
    for ( uint i = 0; i < 3; i++ ){
        gpio_put(ledOut, true);
        sleep_ms(800);
        gpio_put(ledOut, false);
        if ( i != 2 )
            sleep_ms(125);
    }
}

void blinkLetterInterval( void ){
    sleep_ms(250);
}