
#Classe abstrata
class Animal:
    def __init__(self, nome = '', alimento = '', tamanhoMedio = '', pesoMedio = ''):
        self.nome = nome
        self.alimento = alimento
        self.tamanhoMedio = tamanhoMedio
        self.pesoMedio = pesoMedio
    
    def getNome(self):
        return self.nome
    
    def getAlimento(self):
        return self.alimento
    
    def principalCaracteristica(self):
        print("Vazio")

#Classe especializada, polimorfismo
class Mamifero(Animal):
    def __init__(self, nome='', alimento = '',  tamanhoMedio = 0, pesoMedio = 0):
        super().__init__(nome, alimento, tamanhoMedio, pesoMedio)
    
    #Polimorfismo de sobreescrita
    def principalCaracteristica(self):
        print("Sua prinicpal característica é presença de pelo no corpo e glândulas mamárias.")

class Peixe(Animal):
    def __init__(self, nome='', alimento='', tamanhoMedio='', pesoMedio=''):
        super().__init__(nome, alimento, tamanhoMedio, pesoMedio)

    def principalCaracteristica(self):
        print("Sua prinicpal característica é respirar por branquias ou guelras e se locomever por meio de nadadeiras.")

#Função main    
def main():
    animal1 = Mamifero('Humano', 'Carnívoro', 1.70, 70)
    animal2 = Mamifero('Macaco', 'Folhas, Anfíbios, Sementes, Pássaros', 0.70, 12)
    animal3 = Peixe('Peixe', 'Plâncton', 0.40, 0.730)


    print(f"Esse animal se chama {animal1.getNome()}.")
    animal1.principalCaracteristica()

    print(f"\nEsse animal se chama {animal2.getNome()}.")
    animal2.principalCaracteristica()
    
    print(f"\nEsse animal se chama {animal3.getNome()}.")
    animal3.principalCaracteristica()

main()
