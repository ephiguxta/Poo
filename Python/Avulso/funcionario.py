#Classe de funcionários

class Funcionario:

    #Construtor
    def __init__(self, nome = '', cpf = '', salario = 0):
        self._nome = nome
        self._cpf = cpf
        self._salario = salario

    #Retorna informações
    def getNome(self):
        return self._nome

    def getCpf(self):
        return self._cpf

    def getSalario(self):
        return self._salario
