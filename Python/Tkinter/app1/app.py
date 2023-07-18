from tkinter import *

#Cria um objeto
menu_inicial = Tk()
menu_inicial.title("Primeiro App")

#Dimensões da janela
menu_inicial.geometry("700x300+300+200")

#Configura se height e width se expande
menu_inicial.resizable(False, False)

#Define o icone
menu_inicial.iconbitmap("imagens/icon.ico")

#Botão
btn = Button(menu_inicial, text = "Executar")
btn.pack()


#Mantém a interface aberta
menu_inicial.mainloop()