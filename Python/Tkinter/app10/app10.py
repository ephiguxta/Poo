from tkinter import *

#Funcao imprimir
def imprimir():
    nome = txt.get()
    resultado.set(nome)

#GUI
root = Tk()
root.title("App10")

resultado = StringVar()

lb = Label(root, text="Informe seu nome: ")
txt = Entry(root)
bt = Button(root, text="Imprimir", command=imprimir)
lb_resposta = Label(root, textvariable=resultado)

#Grid
lb.grid()
txt.grid()
lb_resposta.grid()
bt.grid()

root.mainloop()