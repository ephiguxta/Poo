import csv

def main():
    
    #Abrindo arquivo com o with
    with open("advertising.csv", "r") as arquivo:
        #Tratando o arquivo
        arquivo_csv = csv.reader(arquivo, delimiter = ",")
        
        #Exibe linha do arquivo
        for linha in arquivo_csv:
            print(linha)

main()