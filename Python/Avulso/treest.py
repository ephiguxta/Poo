class Conta:
    def __init__(self, titular, cpf, saldo):
        self._titular = titular
        self._cpf = cpf
        self._saldo = saldo
    
    def atualiza(self, taxa):
        self._saldo = self._saldo * taxa

class ContaCorrente(Conta):
    def __init__(self, titular, cpf, saldo):
        super().__init__(titular, cpf, saldo)
    
    def atualiza(self, taxa):
        return super().atualiza(taxa) * 2
    
class ContaPoupanca(Conta):
    def __init__(self, titular, cpf, saldo):
        super().__init__(titular, cpf, saldo)
    
    def atualiza(self, taxa):
        return super().atualiza(taxa) * 3
    
c = Conta("Aroldo", "050.745.691-25", 1000.0)
cc = ContaCorrente("Aroldo", "050.745.691-25", 1000.0)
cp = ContaPoupanca("Aroldo", "050.745.691-25", 1000.0)

print(c._saldo)
print(cc._saldo)
print(cp._saldo)

c.atualiza(0.01)
cc.atualiza(0.01)
cp.atualiza(0.01)

print(c._saldo)
print(cc._saldo)
print(cp._saldo)
