import time

from uteis import fatorial

m = 10000
t0 = time.time()
fatorial(m)
t = time.time() - t0
print("O código durou ", t, 'segundos para rodar')
print('Isso dá {} minutos.'.format(t/60))
