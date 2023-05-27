//Implementacao da class account

#include <iostream> //Pre-processamento de entrada e saida de dados
using std::cout;
using std::cin;
using std::endl;

#include <string> // Biblioteca para trabalhar com strings
using std::string;
using std::getline;

//biblioteca matematica
#include <cmath>

//criacao da classe Accoutn
class Accout {
public:
    void setValorDaConta(float reais) {
        saldo = reais;
    }

    void getValorDaConta() {
        cout << "O saldo da sua conta configura: " << saldo <<"R$ " << endl;
    }

    void setDeposito(float valor) {
        saldo = saldo + valor;
    }

    void setSaque(float valor) {
        if(saldo < valor){
            saldo = saldo - 5;
            return;
        }

        saldo = saldo - valor;
    }

private:
     float saldo;
};

//criacao da classe Banco
class Banco {
public:
    //Inicializando a variavel saldo das contas
    void setValorDasContas() {
        conta_corrente.setValorDaConta(0);
        conta_poupanca.setValorDaConta(0);
    }

    //Deposito
    void setDepositoB(float valor, char cat) {
        if(cat == 'c'){
            conta_corrente.setDeposito(valor);
        }
        else{
            if(cat == 's'){
                conta_poupanca.setDeposito(valor);
            }
        }
    }

    //Retirada
    void setRetirada(float valor, char cat) {
        if(cat == 'c'){
            conta_corrente.setSaque(valor);
        }
        else{
            if(cat == 's'){
                conta_poupanca.setSaque(valor);
            }
        }
    }

    //transferencia
    void setTransferencia(float valor, char cat) {
        if(cat == 'c'){
            conta_corrente.setSaque(valor);
            conta_poupanca.setDeposito(valor);
        }
        else{
            if(cat == 's'){
                conta_poupanca.setSaque(valor);
                conta_corrente.setDeposito(valor);
            }
        }
    }

    //Imprimir saldo
    void imprimirSaldo() {
        cout << "=Conta corrente=" << endl;
        conta_corrente.getValorDaConta();
        cout << endl;
        cout << "=Conta poupanca=" << endl;
        conta_poupanca.getValorDaConta();
    }

private:
    Accout conta_corrente;
    Accout conta_poupanca;
};


int main() {
    int op = -999;
    float quantia, valor;
    char cat;

    Banco bancoDoBrasil;
    bancoDoBrasil.setValorDasContas();

    while(op != 0){
        cout << "\n1 - Depositar \n2 - Retirada \n3 - Transferencia \n4 - Imprimir saldo \n0 - Para sair \nInforme sua escolha: ";
        cin >> op;

        switch (op){
        case 1:
            system("cls");
            cout << "Informe a quantia a ser depositada: ";
            cin >> valor;

            cout << "informe a categoria da conta: ";
            cin >> cat;

            bancoDoBrasil.setDepositoB(valor, cat);
            break;

        case 2:
            system("cls");
            cout << "Informe a quantia a ser retirada: ";
            cin >> valor;

            cout << "Informe a categoria da conta: ";
            cin >> cat;

            bancoDoBrasil.setRetirada(valor, cat);
            break;

        case 3:
            system("cls");
            cout << "Informe o valor da transferencia: ";
            cin >> valor;

            cout << "Informe a categoria da conta para retirar o dinheiro: ";
            cin >> cat;

            bancoDoBrasil.setTransferencia(valor, cat);
            break;

        case 4:
            system("cls");

            bancoDoBrasil.imprimirSaldo();
            break;
        }
    }

    return 0;
}
