

def dobro(n):
    '''
    retorna o dobro de um numero
    :param n: int
    :return:  2 * n
    '''
    return 2*n

def triplo(n):
    '''
    retorna o triplo de um numero
    :param n: int
    '''
    return 3*n

def fatorial(n):
    '''
    retorna o fatorial de um numero inteiro
    :param n: int
    '''
    f = 1
    for i in range(n, 1, -1):
        f *= i
    return f

def e_primo(n):
    '''
    retorna True para números primos
            False para números não primo
    :param n: int
    '''
    cont_divisores = 0
    for i in range(int(n/2)):
        if n%(i+1) == 0:
            cont_divisores +=1
        
    if cont_divisores == 1 or n == 1:
        return True
    else:
        return False

