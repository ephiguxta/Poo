class Conta:
    def __init__(self, titular = '', saldo = 0):
        self.__titular = titular
        self.__saldo = saldo
    
    def sacar(self, valor):
        self.__saldo += valor
    
    def depositar(self, valor):
        self.__saldo += valor
    
    def getTitular(self):
        return self.__titular

    def getSaldo(self):
        return self.__saldo