//Implementacao da class account

#include <iostream> //Pre-processamento de entrada e saida de dados
using std::cout;
using std::cin;
using std::endl;

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
        getValorDaConta();
    }

    void setSaque(float valor) {
        if(saldo < valor){
            saldo = saldo - 5;
            getValorDaConta();
            return;
        }

        saldo = saldo - valor;

        getValorDaConta();
    }

    void jurosAno() {
        int i = 1;
        float temp = saldo;

        while(temp < (2 * saldo)) {
            temp = saldo * pow((1 + 0.005), i);
            i = i + 1;
        }

        cout << "Voce ira ter o dobro do dinheiro em " << (i / 12) << " anos! " << endl;
    }


private:
     float saldo;
};

int main() {
    int op;
    float quantia, valor;
    Accout User1;

    cout << "Informe o valor inicial da sua conta: ";
    cin >> quantia;

    system("cls");

    User1.setValorDaConta(quantia);
    User1.getValorDaConta();

    cout << "\nInforme a operacao a ser realizada: \n1 - Para Depositar \n2 - Sacar \nopcao: ";
    cin >> op;

    cout << endl;

    switch(op) {
    case 1:
        cout << "Informe o valor de deposito: ";
        cin >> valor;

        User1.setDeposito(valor);
        break;

    case 2:
        cout << "Informe o valor a ser retirado: ";
            cin >> valor;

            User1.setSaque(valor);
            break;
    }

    return 0;
}
