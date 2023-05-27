#include <iostream> //Pre processamento de entrada e saida
using std::cout;
using std::cin;
using std::endl;

//Classe carro
class Carro {
public:

    //Construtor
    Carro(float tanque, float autonomia) {
        this->tanque = tanque;
        this->autonomia = autonomia;
    }

    //Km por L
    void setAutonomia(float kmPorLitro) {
        autonomia = kmPorLitro;
    }

    //Obtem o estado atual do tanque
    void getCombustivel() {
       cout << "Seu tanque possui " << tanque << " L." << endl;
    }

    //Abastece o tanque
    void abastecerTanque(float quantidade) {
        tanque += quantidade;
    }

    //Dirigir
    void dirigir(float distancia) {
        float gastoEmLitros;

        gastoEmLitros = distancia / autonomia;

        if(gastoEmLitros < tanque){
            tanque = tanque - gastoEmLitros;
        }
        else{
            cout << "Sua gasolina acabou no meio do caminho!" << endl;
            tanque = 0;
        }
    }

private:
    //Define os estados iniciais
    float tanque;
    float autonomia;
};

int main() {
    int op = -999;
    float valor;
    Carro golG1(0, 0);

    while(op != 0){

        cout << "\n1 - Para definir a autonomia do seu carro" << endl;
        cout << "2 - Abastecer o carro" << endl;
        cout << "3 - Dirigir" << endl;
        cout << "4 - Imprimir combustivel \n0 - Para sair \nEscolha: ";
        cin >> op;

        switch(op){
        case 1:
            system("cls");

            cout << "Informe a autonomia do seu carro em km/L: ";
            cin >> valor;

            golG1.setAutonomia(valor);
            break;

        case 2:
            system("cls");

            cout << "Quantidade de litros para abastecer: ";
            cin >> valor;

            golG1.abastecerTanque(valor);
            break;

        case 3:
            system("cls");

            cout << "Quantidade de km a serem percorridos: ";
            cin >> valor;

            golG1.dirigir(valor);
            break;

        case 4:
            system("cls");

            golG1.getCombustivel();
        }
    }
    return 0;
}
