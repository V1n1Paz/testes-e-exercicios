
class Coffee:
    def __init__(self, status='empty'):
        self.status = status

    def situation(self):
        return self.status

    def fill(self):
        self.status = 'full'

    def sip(self):
        if self.status == 'full':
            print('yummy')
        else:
            print("it's still ok. You can take a sip.")
coffee = Coffee()



while True:
    my_coffee = coffee.situation()
    if my_coffee == 'empty':
        my_coffee = coffee.fill()
        print('my coffee is full now')
    elif my_coffee == 'full':
        my_coffee = coffee.sip()
        print('yummy')
    else:
        print("it's still ok")
        my_coffee = coffee.sip()
        print('yummy')
        
    print('gonna code')