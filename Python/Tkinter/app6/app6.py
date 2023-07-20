from tkinter import *

def main():
    root = Tk()
    root.title("Login")

    #Dimensão da janela
    altura = 100
    largura = 250

    #Dimensão do nosso sistema
    altura_screen = root.winfo_screenheight()
    largura_screen = root.winfo_screenwidth()

    #Posição da janela
    posx = (largura_screen / 2) - (largura / 2)
    posy = (altura_screen / 2) - (altura / 2)

    #Definindo geometry centralizado
    root.geometry("%dx%d+%d+%d" % (largura, altura, posx, posy))
    root.resizable(False, False)

    #Label usando grid
    Label(root, text="Usuário", font="Verdana 12").grid(row=0, column=0)
    Label(root, text="Senha", font="Verdana 12").grid(row=1, column=0)

    #Caixa de texto 
    user = Entry(root).grid(row=0, column=1)
    senha = Entry(root).grid(row=1, column=1)

    cmd_login = Button(root, text="Login").grid(row=2, column=1, sticky=E)

    root.mainloop()

main()