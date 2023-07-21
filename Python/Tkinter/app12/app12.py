from tkinter import *

#GUI
root = Tk()
root.title("App12")

#Widgets0
fnome = Frame(root)
fmorada =Frame(root)

lb_nome = Label(fnome, text="Nome: ")
lb_apelido = Label(fnome, text="Apelido: ")
lb_rua = Label(fmorada, text="Morada: ")
lb_cidade = Label(fmorada, text="Cidade: ")

txt_nome = Entry(fnome)
txt_apelido = Entry(fnome)
txt_rua = Entry(fmorada)
txt_cidade = Entry(fmorada)

btn = Button(root, text="Salvar")


#Layout
lb_nome.grid(row=0, column=0)
lb_apelido.grid(row=1, column=0)
txt_nome.grid(row=0, column=1)
txt_apelido.grid(row=1, column=1)

lb_rua.grid(row=0, column=0)
lb_cidade.grid(row=1, column=0)
txt_rua.grid(row=0, column=1)
txt_cidade.grid(row=1, column=1)

fnome.grid(row=0, column=0)
fmorada.grid(row=0, column=1)


btn.grid(columnspan=2)

root.mainloop()