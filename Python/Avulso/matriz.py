import random, os

#Função principal
def main():    
    conotrole1 = True 
    conotrole2 = True

    #Menu
    while conotrole1:
        os.system("cls")
        ordem = int(input("Informe a ordem da sua matriz: "))
        matrix = geraMatrix(ordem)
        conotrole2 = True

        while conotrole2:
            os.system("cls")
            print("1 - Imprimir matriz \n2 - Soma diagonal principal \n3 - Gerar nova matriz \n4 - Sair ")
            opcao = int(input("Informe a operação a ser realizada: "))

            if(opcao == 1):
                os.system("cls")
                print("Sua matriz:")
                imprimeMatrix(ordem, matrix)
            
            elif(opcao == 2):
                os.system("cls")
                print(f"A soma da diagonal principal é {somaDiagonalPrincipal(ordem, matrix)}")

            elif(opcao == 3):
                conotrole2 = False
            
            else:
                conotrole1 = conotrole2 = False
            
            os.system("pause")

#Cria a matriz
def geraMatrix(ordem):
    m = []

     #Linha
    for x in range(ordem):
        lista = []

        #Coluna
        for y in range(ordem):
            lista.append(random.randint(0, 9))
        
        m.append(lista)
    
    return m

#Imprime matriz
def imprimeMatrix(ordem, matriz):
    for i in range(ordem):
        for j in range(ordem):
            print(matriz[i][j], end=' ')

        print()

#Soma os elementos da diagonal principal
def somaDiagonalPrincipal(ordem, matrix):
    soma = 0

    for i in range(ordem):
        for j in range(ordem):
            if(i == j):
                soma = soma + matrix[i][j]

    return soma

main()