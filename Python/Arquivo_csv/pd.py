import pandas as pd

def main():
    #Configurando o arquivo
    arquivo = pd.read_csv("advertising.csv", sep=",")

    print(arquivo)

    #Realizando soma de colunas
    soma = arquivo["TV"].sum()
    print(f"A soma dos investimentos feitos em Tv são de {soma} R$")



main()