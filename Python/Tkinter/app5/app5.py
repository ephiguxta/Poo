from tkinter import *

def main():
    menu_inicial = Tk()
    menu_inicial.title("App5")
    menu_inicial.geometry("700x350+300+300")

    l = Label(menu_inicial, text = "Titulo l", font = "Verdana 20", bg = "gray")
    l2 = Label(menu_inicial, text = "Titulo ll", font = "Verdana 20", bg = "yellow")
    l3 = Label(menu_inicial, text = "Titulo l3", font = "Verdana 20", bg = "yellow")

    l.grid(row = 0, column =0)
    l2.grid(row = 1, column = 1)
    l3.pack()
    
    menu_inicial.mainloop()

main()