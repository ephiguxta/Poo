from tkinter import *

#GUI
root = Tk()
root.title("App8")

#Frame widget
frame_login = Frame(root)

label_usuario = Label(frame_login, text="Usuario")
label_senha = Label(frame_login, text="Senha")
text_usuario = Entry(frame_login)
text_senha = Entry(frame_login)
btn = Button(frame_login, text="Entrar")


#Layout
label_usuario.grid(row=0, column=0)
label_senha.grid(row=1, column=0)
text_usuario.grid(row=0, column=1)
text_senha.grid(row=1, column=1)
btn.grid(row=2, column=1)
frame_login.grid(padx=15, pady=15)

root.mainloop()
