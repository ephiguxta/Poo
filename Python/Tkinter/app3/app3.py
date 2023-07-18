from tkinter import *

def main():
    menu_inicial = Tk()
    menu_inicial.title("App 3")
    

    #Dimensão da janela
    altura = 350
    largura = 700

    #Dimensão do nosso sistema
    altura_screen = menu_inicial.winfo_screenheight()
    largura_screen = menu_inicial.winfo_screenwidth()

    #Posição da janela
    posx = (largura_screen / 2) - (largura / 2)
    posy = (altura_screen / 2) - (altura / 2)

    #Definindo geometry centralizado
    menu_inicial.geometry("%dx%d+%d+%d" % (largura, altura, posx, posy))
    menu_inicial.resizable(False, False)

    #Label
    label1 = Label(menu_inicial, text = "Este é o rótulo 1.")
    label1.pack()

    label2 = Label(menu_inicial, text = "Esse é o label 2.")
    label2.pack()

    #Botão
    btn = Button(menu_inicial, text = "Entrar")
    btn.pack()

    menu_inicial.mainloop()

main()