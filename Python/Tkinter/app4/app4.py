from tkinter import *

def main():
    menu_inicial = Tk()
    menu_inicial.title("App4")
    menu_inicial.geometry("400x400+300+300")

    #Personalizando label
    label1 = Label(menu_inicial,
                    text = "Título l",
                    fg = "black",
                    font= "Verdana 20",
                    height=4,
                    width=8,
                    anchor=E,
                    bd=1,
                    relief="solid")
    
    label1.pack()

    label2 = Label(menu_inicial,
                   text = "Botão",
                   font = "Verdana 20",
                   bd = 1,
                   relief = "solid")
    label2.pack()

    menu_inicial.mainloop()

main()