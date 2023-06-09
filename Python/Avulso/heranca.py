import conta

class ContaConjunta(conta.Conta):

    def __init__(self, titular = '', saldo = 0, titular2 = ''):

        #Super() é uma função para inicializar um método da super classe
        super().__init__(titular, saldo)

        self.__titular2 = titular2

    #Sobrecarga de métodos
    def getTitular(self):
        titular1 = super().getTitular()
        titulares = f"O primeiro titular se chama {titular1} e o segundo {self.__titular2}"
        return titulares

cc = ContaConjunta('Aroldo', 555, 'Fabio')

print(cc.getTitular())
print(cc.getSaldo())

