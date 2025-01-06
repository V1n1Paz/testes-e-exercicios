import pygame
import time
import random

pygame.init()
#variaveis numéricas
pixel = 50
fps=5
largura_tela = pixel *21
altura_tela = pixel*15
cabeca_x = largura_tela/2 - pixel/2
cabeca_y = altura_tela/2 - pixel/2
pontos = 0
vidas = 3


#variaveis de cor
preto = (00,00,00)
cinza = (50, 50, 50)
vermelho = (255, 00, 00)
verde = (0, 255, 00)
azul = (0, 0, 255)
roxo = 2629344
branco = (255, 255, 255)
cor_quadrado = verde

#variaveis booleanas
jogo_acabou = False
dev = False
ctrl_pressionada = False
tela_game_over = False
tela_start = True

#outras variaveis
direcao = None
tela = pygame.display.set_mode((largura_tela, altura_tela))     #define a tela
pygame.display.set_caption('Snake')     #define o nome da tela
relogio = pygame.time.Clock()   #define o objeto Clock
cobra = [(largura_tela/2 - pixel/2, altura_tela/2 - pixel/2)]   #define a cobra inicial
comida = (random.randint(0, 20) * pixel, random.randint(2, 14) * pixel)     #define a comida inicial
comida_x, comida_y = comida
fundo = pygame.image.load('fundo.png')
timer_fundo = time.time()
    #define a fonte padrão para texto


while not jogo_acabou:  #loop principal
    relogio.tick(fps)
    if tela_game_over:
        tela.fill(cinza)



        fonte = pygame.font.SysFont('8-BIT WONDER', 100)
        texto_game_over = fonte.render("GAME OVER", False, branco)
        tela.blit(texto_game_over, (largura_tela / 2 - pixel / 2 - 180, altura_tela / 2 - pixel / 2))


        fonte = pygame.font.SysFont('8-BIT WONDER', 50, True)
        texto_pontos = fonte.render('Score:  {}'.format(pontos * 100), False, branco)
        tela.blit(texto_pontos, (largura_tela/2 - pixel/2 - 80, altura_tela/2 - pixel/2 +150 ))

        fonte = pygame.font.SysFont('8-BIT WONDER', 40, True)
        texto_pontos = fonte.render('[Pressione Space para tentar novamente]'.format(pontos * 100), False, branco)
        tela.blit(texto_pontos, (250, 700))


    else:


        if time.time() - timer_fundo <= 1:
            tela.fill(preto)

        elif time.time() - timer_fundo <= 2:
            tela.blit(fundo, (0, 0))
        else:
            tela.fill(preto)
            timer_fundo = time.time()



        if tela_start:
            fonte = pygame.font.SysFont('8-BIT WONDER', 50, True)
            texto_pontos = fonte.render('PRESSIONE UMA SETA PARA COMEÇAR', False, branco)
            tela.blit(texto_pontos, (175, 50))



        if pontos >0:
            tamanho_cobra = pontos + 1
        else:
            tamanho_cobra = 1
        if direcao == 'cima' and not tela_game_over:
            cabeca_y -= pixel
            cobra.append((cabeca_x, cabeca_y))
        elif direcao == 'baixo' and not tela_game_over:
            cabeca_y += pixel
            cobra.append((cabeca_x, cabeca_y))
        elif direcao == 'esquerda' and not tela_game_over:
            cabeca_x -= pixel
            cobra.append((cabeca_x, cabeca_y))
        elif direcao == 'direita' and not tela_game_over:
            cabeca_x += pixel
            cobra.append((cabeca_x, cabeca_y))
        if tamanho_cobra < len(cobra):
            for i in range(len(cobra) - tamanho_cobra):
                try:
                    cobra.remove(cobra[0])
                except:
                    pass

        try:
            corpo = cobra[:-1]
            cabeca = cobra[-1]
            cabeca_x, cabeca_y = cabeca
        except:
            pass
        if cabeca in corpo:
            tela_game_over = True

        if cabeca_x < 0 or cabeca_x > largura_tela - pixel or cabeca_y < 0 or cabeca_y > altura_tela - pixel:
            direcao = None
            tela_game_over = True


        if cabeca == comida:
            pontos += 1
            fps = fps*1.1
            comida = (random.randint(0, 20) * pixel, random.randint(0, 14) * pixel)
            if comida in cobra:
                comida = (random.randint(0, 20) * pixel, random.randint(0, 14) * pixel)
        comida_x, comida_y = comida
        comida_quadrado = pygame.draw.rect(tela, vermelho, (comida_x, comida_y, pixel, pixel))



        for pos_x, pos_y in cobra:
            pygame.draw.rect(tela, cor_quadrado, (pos_x, pos_y, pixel, pixel))

    fonte = pygame.font.SysFont('Arial', 25)
    texto_pontos = fonte.render(str(pontos * 100), False, branco)
    tela.blit(texto_pontos, (25, 25))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:  #verifica se o jogo foi fechado
            jogo_acabou = True
        if event.type == pygame.KEYDOWN:

            if pygame.key.get_mods() & pygame.KMOD_LCTRL: #verifica se a tecla ctrl foi pressionada
                t0_ctrl = time.time()
                if event.key == pygame.K_a and time.time() - t0_ctrl < 0.5: #verifica combo ctrl + a
                    dev = not dev
            if event.key == pygame.K_UP and direcao!= "baixo": #verifica seta pra baixo
                direcao = 'cima'
                tela_start = False
            if event.key == pygame.K_DOWN and direcao!= "cima": #verifica seta pra cima
                direcao = 'baixo'
                tela_start = False
            if event.key == pygame.K_LEFT and direcao!= "direita":    #verifica seta pra esquerda
                direcao = 'esquerda'
                tela_start = False
            if event.key == pygame.K_RIGHT and direcao!= 'esquerda':    #verifica seta pra esquerda
                direcao = 'direita'
                tela_start = False
            if event.key == pygame.K_SPACE and tela_game_over:

                cobra = [(largura_tela / 2 - pixel / 2, altura_tela / 2 - pixel / 2)]
                cabeca_x, cabeca_y = cobra[-1]
                pontos = 0
                fps = 5
                comida = (random.randint(0, 20) * pixel, random.randint(2, 14) * pixel)
                comida_x, comida_y = comida
                tela_game_over = False


            if dev and event.key == pygame.K_1:
                pontos += 1
            if dev and event.key == pygame.K_2:
                pontos -= 1

    if dev:
        cor_quadrado = roxo
        print('snake:   ', cobra)
        print('food:   ', comida)
        print('point:   ', pontos)
    else:
        cor_quadrado = verde

    pygame.display.flip()