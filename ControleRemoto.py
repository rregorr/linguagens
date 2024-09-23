#https://www.youtube.com/watch?v=gomDSZaay3E
class ControleRemoto:
    def __init__(self, cor):
        self.cor = cor

controle_remoto = ControleRemoto("preto")

controle_remoto2 = ControleRemoto("cinza")

print(f"Controle remoto: {controle_remoto.cor}")
print(f"Controle remoto: {controle_remoto2.cor}")