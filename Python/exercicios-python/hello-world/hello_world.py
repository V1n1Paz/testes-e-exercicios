import os


def sprint(string = None, tempo = 0):
    import time
    string = str(string)
    tempo = float(tempo)
    txt = ''
    for i in range (len(string)):
        txt = txt + ' '
    ntxt = ''
    alf = '.:,;(!?)+-*/=1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz '
    for i, letra in enumerate(txt):
        for lettra in alf:
            os.system('cls')
            ntxt = ntxt [:i] + lettra + txt[(i+1):] 
            print(ntxt)
            time.sleep(tempo)
            if lettra == string[i]:
                break
            if ntxt[:-1] in string:
                print('')
            
sprint('Hello World', 0.001)