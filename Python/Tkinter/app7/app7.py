from tkinter import *

def main():
    def exibir():
        l3['text'] = t1.get()

    #GUI
    root = Tk()
    root.title("App7")
    

    l1 = Label(root, text="User", padx=10, pady=10, font="Verdana 18").grid(row=0, column=0)
    l2 = Label(root, text="Senha", padx=10, pady=5, font="Verdana 18").grid(row=1, column=0)
    t1 = Entry(root)
    t1.grid()
    t2 = Entry(root, font="Verdana 18").grid(row=1, column=1)

    l3 = Label(root).grid()

    btn = Button(root, text="Login", font="Verdana 18", bg="gray", command=exibir()).grid(columnspan=2)

    root.mainloop()




main()