#include <iostream> //Pre processamento de entrada e saida de dados
using std::cout;
using std::cin;
using std::endl;

#include <string> //Biblioteca para trabalhar com strings
using std::string;
using std::getline;

class Estudante{
public:

    //Construtor
    Estudante() {
        this->nome = nome;
        this->pontosTotal = pontosTotal;
    }

    //Definir nome
    void setNomeScore(string aluno) {
        nome = aluno;
        pontosTotal = 0;
    }

    //Adicionar exame
    void adicionarExame(float nota) {
        pontosTotal += nota;
    }

    //Obter total de pontos
    float totalPontos() {

        cout << "Sua pontuacao total e de " << pontosTotal << " pontos! " << endl;

        return pontosTotal;
    }

    //Obter pontuacao media
    float mediaPontos(float quantidade) {
        float media;

        media = pontosTotal / quantidade;

        cout << "Sua media e de " << media << " pontos!" << endl;

        return media;
    }


    //Retornar nome
    string getNome() {
        cout << "Nome do aluno: " << nome << endl;
        return nome;
    }

private:
    string nome;
    float pontosTotal;

};

int main() {
    Estudante aluno1;
    int op = -999;
    string nome;
    float pontos;
    int exames;

    while(op != 0){

        cout << "\n1 - Para Adicionar o nome do aluno" << endl;
        cout << "2 - Obter nome do aluno" << endl;
        cout << "3 - Adicionar exame" << endl;
        cout << "4 - Para obter pontuacao total" << endl;
        cout << "5 - Obter media" << endl;
        cout << "0 - Para sair \nDigite sua opcao: ";
        cin >> op;

        switch(op) {
            case 1:
                system("cls");

                cout << "Informe o nome do aluno: ";

                //Limpa o buffer do teclado
                fflush(stdin);

                //Pega o nome do aluno com espaços
                getline(cin, nome);

                aluno1.setNomeScore(nome);
                break;

            case 2:
                system("cls");

                aluno1.getNome();
                break;

            case 3:
                system("cls");

                cout << "Informe a pontuacao do exame: ";
                cin >> pontos;

                aluno1.adicionarExame(pontos);

                cout << "Exame adicionado com sucesso!" << endl;
                break;

            case 4:
                system("cls");

                aluno1.totalPontos();
                break;

            case 5:
                system("cls");

                cout << "Informe a quantidade de exames: ";
                cin >> exames;

                aluno1.mediaPontos(exames);
                break;
        }
    }

    return 0;
}
