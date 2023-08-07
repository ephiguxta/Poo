import customtkinter
from tkinter import *

janela = customtkinter.CTk()

def vcEhGay():
    print("GAY!")

#Classe tela principal
class Application():
    def __init__(self):
        self.janela = janela
        self.tema()
        self.tela()
        self.telaOpcoes()
        janela.mainloop()

    #Define o tema
    def tema(self):
        customtkinter.set_appearance_mode("dark")
        customtkinter.set_default_color_theme("dark-blue")

    #Ajusta a tela
    def tela(self):
        janela.title("Gerenciador de Garagem")
        #Dimensão da janela
        altura = 600
        largura = 700

        #Dimensão do nosso sistema
        altura_screen = janela.winfo_screenheight()
        largura_screen = janela.winfo_screenwidth()

        #Posição da janela
        posx = (largura_screen / 2) - (largura / 2)
        posy = (altura_screen / 2) - (altura / 2)

        #Definindo geometry centralizado
        janela.geometry("%dx%d+%d+%d" % (largura, altura, posx, posy))
        janela.resizable(False, False)

    #Método com as requisitos funcionais
    def telaOpcoes(self):
        #Trabalhando com a logo
        img = PhotoImage(file="logo1.png")
        label_img = customtkinter.CTkLabel(master=janela, image=img)
        label_img.place(x=-25, y=30)

        #Frame Opções
        frame = customtkinter.CTkFrame(janela, width=350, height=396)
        frame.pack(side=RIGHT)

        #Frame widget
        font = customtkinter.CTkFont(family="Roboto", size=16)

        # variáveis que serão armazenas no registro do funcionário
        nome = customtkinter.StringVar(janela)
        # ...
       
        def printnome():
            print(nome.get())


        #Tela para cadastrar Funcionario
        def telaCadastrarFuncionario():
            frame.pack_forget()

            #Frame com os dados do funcionario
            frameFuncionario = customtkinter.CTkFrame(janela, width=350, height=600)
            frameFuncionario.pack(side=RIGHT)
            
            

            label = customtkinter.CTkLabel(master=frameFuncionario,
                                           text="Cadastrar Funcionario",
                                           ).place(x=25, y=5)
            
            nomeEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Nome",
                                                      width=300,
                                                      textvariable=nome,
                                                      ).place(x=25, y=40)
            
            
    
            enderecoEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Endereço",
                                                      width=300).place(x=25, y=80)
            
            numeroEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Número",
                                                      width=300).place(x=25, y=120)
            
            bairroEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Bairro",
                                                      width=300).place(x=25, y=160)
            
            cepEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Cep",
                                                      width=300).place(x=25, y=200)
            
            telefoneEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Telefone",
                                                      width=300).place(x=25, y=240)
            
            emailEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Email",
                                                      width=300).place(x=25, y=280)
            
            cpfEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="CPF",
                                                      width=300).place(x=25, y=320)
            
            rgEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="RG",
                                                      width=300).place(x=25, y=360)
            
            dataNascimentoEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Data de Nascimento",
                                                      width=300).place(x=25, y=400)
            


            
            sexoEntry = customtkinter.CTkEntry(master=frameFuncionario,
                                                      placeholder_text="Sexo",
                                                      width=300).place(x=25, y=440)
            
            

            saveFuncionario = customtkinter.CTkButton(master=frameFuncionario, 
                                         text="Cadastrar Funcionario", 
                                         width=300, height=30,  
                                         font=("Roboto", 16),
                                         fg_color="green",
                                         hover_color="#014B05",
                                         command=printnome
                                         ).place(x=25, y=480)
            

            
            
             #Volta para tela inicial
            def back():
                frameFuncionario.pack_forget()
                frame.pack(side=RIGHT)

            voltar = customtkinter.CTkButton(master=frameFuncionario, 
                                         text="Voltar", 
                                         width=300, height=30,  
                                         font=("Roboto", 16),
                                         fg_color="gray",
                                         hover_color="#090909",
                                         command=back
                                         ).place(x=25, y=520)



        #Opções do menu
        botao1 = customtkinter.CTkButton(master=frame, 
                                         text="Cadastrar Funcionário", 
                                         width=300, height=30,  
                                         font=("Roboto", 16),
                                         command=telaCadastrarFuncionario
                                         ).place(x=25, y=60)

        botao2 = customtkinter.CTkButton(master=frame, 
                                         text="Pesquisar Funcionário", 
                                         width=300, 
                                         height=30,  
                                         font=("Roboto", 16)
                                         ).place(x=25, y=100)

        botao3 = customtkinter.CTkButton(master=frame, 
                                         text="Cadastrar Cliente", 
                                         width=300, height=30,  
                                         font=("Roboto", 16)
                                         ).place(x=25, y=140)

        botao4 = customtkinter.CTkButton(master=frame, 
                                        text="Pesquisar Cliente", 
                                        width=300, 
                                        height=30,  
                                        font=("Roboto", 16)
                                        ).place(x=25, y=180)

        botao5 = customtkinter.CTkButton(master=frame, 
                                        text="Cadastrar veículo", 
                                        width=300, 
                                        height=30,  
                                        font=("Roboto", 16)
                                        ).place(x=25, y=220)

        botao6 = customtkinter.CTkButton(master=frame, 
                                        text="Pesquisar veículo", 
                                        width=300, 
                                        height=30,  
                                        font=("Roboto", 16)
                                        ).place(x=25, y=260)

        botao7 = customtkinter.CTkButton(master=frame, 
                                        text="Histórico de vendas", 
                                        width=300, 
                                        height=30,  
                                        font=("Roboto", 16)
                                        ).place(x=25, y=300)

        botao8 = customtkinter.CTkButton(master=frame, 
                                        text="Realizar venda", 
                                        width=300, 
                                        height=30,  
                                        font=("Roboto", 16)
                                        ).place(x=25, y=340)

        

Application()
