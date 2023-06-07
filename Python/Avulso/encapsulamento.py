#Classe
class Conta:
    

    #Atributo para evitar que se crie um dicionário para cada atributo da classe, economizando muita memória
    __slots__ = ['__numero', '__titular', '__saldo', '__limite']

    def __init__(self, numero, titular, saldo, limite = 1000.0):

        # _ para atributo protegido e __ para atributo privado
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite
    
    def set_saldo(self, saldo):
        self.__saldo = saldo
    
    def get_saldo(self):
        return self.__saldo
    
    def serie_conta():
        return Conta.total_contas
        

conta1 = Conta('123-4', 'Aroldo', 250.00)
conta2 = Conta('123-5', 'Fabio', 300.00)
    
print(conta1.get_saldo())
print(conta2.get_saldo())
