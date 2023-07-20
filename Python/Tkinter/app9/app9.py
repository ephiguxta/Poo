from tkinter import *

def conversor():
    fahrenheit = float(txt_f.get())

    celsius = ((fahrenheit - 32) / 9) * 5

    final.set(str(round(celsius, 1))  + " graus Celsius.")

#GUI
root = Tk()
root.title("Conversor de F para C")

prog = Frame(root)

final = StringVar()

#Label e entradas
lb = Label(prog, text="Inserir Fahrenheit:")
txt_f = Entry(prog)
lb_resposta = Label(prog, textvariable=final)
btn = Button(prog, text="Executar", command=conversor)

#Grid
lb.grid(row=0, column=0)
txt_f.grid(row=1, column=0)
lb_resposta.grid(row=2, column=0)
btn.grid(row=3, column=0)
prog.grid()


root.mainloop()