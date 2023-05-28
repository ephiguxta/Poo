#include <iostream> //Pre processamento de entrada e saida
using std::cout;
using std::cin;
using std::endl;

#include <string>
using std::string;
using std::getline;

class Pais{
public:
    Pais(string nome, int populacao, float area) {
        this->nome = nome;
        this->populacao = populacao;
        this->area = area;
    }

    void setNomeDoPais(string pnome) {
        nome = pnome;
    }

    void setPopulacao(int qtd) {
        populacao = qtd;
    }

    int getPopulacao() {
        return populacao;
    }

    string getNome() {
        return nome;
    }

    float getArea() {
        return area;
    }

private:
    string nome;
    int populacao;
    float area;
};

int main() {
    string nomePais1, nomePais2, nomePais3, nomePais4, maiorArea, paisarea, paisdensidade;
    int pop1, pop2, pop3, pop4, maior;
    float area1, area2, area3, area4, maiorarea, d1, d2, d3, d4, maiordensidade;

    //Pais 1
    cout << "Digite o nome do pais: ";
    getline(cin, nomePais1);

    cout << "Informe sua populacao: ";
    cin >> pop1;

    cout << "Informe sua area: ";
    cin >> area1;

    Pais pais1(nomePais1, pop1, area1);
    system("cls");
    fflush(stdin);


    //Pais 2
    cout << "Digite o nome do pais: ";
    getline(cin, nomePais2);

    cout << "Informe sua populacao: ";
    cin >> pop2;

    cout << "Informe sua area: ";
    cin >> area2;

    Pais pais2(nomePais2, pop2, area2);
    system("cls");
    fflush(stdin);

    //Pais 3
    cout << "Digite o nome do pais: ";
    getline(cin, nomePais3);

    cout << "Informe sua populacao: ";
    cin >> pop3;

    cout << "Informe sua area: ";
    cin >> area3;

    Pais pais3(nomePais3, pop3, area3);
    system("cls");
    fflush(stdin);

    //Pais 4
    cout << "Digite o nome do pais: ";
    getline(cin, nomePais4);

    cout << "Informe sua populacao: ";
    cin >> pop4;

    cout << "Informe sua area: ";
    cin >> area4;

    Pais pais4(nomePais4, pop4, area4);
    system("cls");
    fflush(stdin);

    //Maior populacao
    maior = pais1.getPopulacao();
    maiorArea = pais1.getNome();
    if(pais2.getPopulacao() > maior){
        maior = pais2.getPopulacao();
        maiorArea = pais2.getNome();
    }

    if(pais3.getPopulacao() > maior){
        maior = pais3.getPopulacao();
        maiorArea = pais3.getNome();
    }

    if(pais4.getPopulacao() > maior){
        maior = pais4.getPopulacao();
        maiorArea = pais4.getNome();
    }

    cout << "O pais com maior populacao tem " << maior << " habitantes e se chama "<< maiorArea << endl;


    //Maior Area
    maiorarea = pais1.getArea();
    paisarea = pais1.getNome();
    if(pais2.getArea() > maiorarea){
        maiorarea = pais2.getArea();
        paisarea = pais2.getNome();
    }

    if(pais3.getArea() > maiorarea){
        maiorarea = pais3.getArea();
        paisarea = pais3.getNome();
    }

    if(pais4.getArea() > maiorarea){
        maiorarea = pais4.getArea();
        paisarea = pais4.getNome();
    }

    cout << "O pais com maior area tem " << maiorarea << " metros quadrados e se chama "<< paisarea << endl;


    //Densidade populacional
    d1 = pais1.getPopulacao() / pais1.getArea();
    d2 = pais2.getPopulacao() / pais2.getArea();
    d3 = pais3.getPopulacao() / pais3.getArea();
    d4 = pais4.getPopulacao() / pais4.getArea();

    maiordensidade = d1;
    paisdensidade = pais1.getNome();

    if(d2 > maiordensidade){
        maiordensidade = d2;
        paisdensidade = pais2.getNome();
    }

    if(d3 > maiordensidade){
        maiordensidade = d3;
        paisdensidade = pais3.getNome();
    }

    if(d4 > maiordensidade){
        maiordensidade = d4;
        paisdensidade = pais4.getNome();
    }

    cout << "O pais com maior densidade populacional tem " << maiordensidade << " hab/km2 e se chama " << paisdensidade << endl;

    return 0;
}
