import funcionario

class Gerente(funcionario.Funcionario):
    def __init__(self, nome, cpf, salario, senha, qtd_gerenciados):
        super().__init__(nome, cpf, salario)
        self._senha = senha
        self._qtd_gerenciados = qtd_gerenciados

    def getNome(self):
        self.nome = super().getNome()
        return self.nome


func1 = funcionario.Funcionario('Aroldo', '050.745.691-25', 3000.0)

gerent1 = Gerente('Fabio', '050-787-555-32', 5000.0, 'Mayco', 3)

print(gerent1.getNome())
