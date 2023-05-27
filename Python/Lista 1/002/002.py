#Biblioteca de comandos para o sistema operacional
import os

#Conta
class Conta:

    #Função de inicialização
    def __init__(self, saldo, valor):
        self.saldo = saldo
        self.valor = valor

    #Função Deposito
    def setDeposito(self, valor):
        self.valor = valor
        print(self.valor)
        self.saldo += self.valor

    #Função Saque
    def setSaque(self, valor):
        self.valor = valor

        if(self.valor > self.saldo):
            self.saldo -= 5
            print("Saldo insuficiene, multa de R$5. Seu saldo é de R${}\n".format(self.saldo))

        else:
            self.saldo -= self.valor

    #Mostrar Saldo
    def mostrarSaldo(self):
        print("O seu saldo é de R${}.\n".format(self.saldo))

    #Função que calcula juros
    def calcularJuros(self):
        i = 1
        temp = self.saldo

        while(temp < (2 * self.saldo)):
            temp = self.saldo * ((1 + 0.005) ** i)
            i = i + 1

        print("Você irá ter o dobro de dinheiro em {:.2f} anos. \n".format(i / 12))
        

#Variavel de controle
opcao = None

#Inserindo valor do saldo
conta1 = Conta(float(input("Informe o valor do saldo: ")), 0)

#Menu
while (opcao != 0):
    opcao = int(input("1 - Depositar \n2 - Sacar   \n3 - Ver Saldo \n4 - Calcular o juros  \n0 - Sair  \nInforme sua opção: "))

    if(opcao == 1):
        os.system("cls")
        valor = float(input("Informe o valor do deposito: "))
        conta1.setDeposito(valor)
    
    elif(opcao == 2):
        os.system("cls")
        valor = float(input("Informe o valor do saque: "))
        conta1.setSaque(valor)
    
    elif(opcao == 3):
        os.system("cls")
        conta1.mostrarSaldo()

    elif(opcao == 4):
        os.system("cls")
        conta1.calcularJuros()