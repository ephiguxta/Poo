from tkinter import *

root = Tk()
root.title("App13")

def apresentar():
    print(valor_check.get())

#Variável que retorna o valor da check [0/1]
valor_check = IntVar()

#Check box
check = Checkbutton(root, text="Esta é uma checkbox", variable=valor_check, command=apresentar).pack()


root.mainloop()
