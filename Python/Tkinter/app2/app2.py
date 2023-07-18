from tkinter import *

def main():
    menu_inicial = Tk()
    menu_inicial.title("Segundo App")

    menu_inicial.geometry("700x300+300+250")

    #Command associa um evento a um botão
    btn = Button(menu_inicial, text = "Executar", command = ola_mundo)
    btn.pack()

    menu_inicial.mainloop()

def ola_mundo():
    print("Ola mundo!")


main()