class carro:
    def __init__(self, cor, valor, flex):
        self.cor = cor 
        self.valor = valor
        self.flex = flex

    def ligar(self):
        print("ligando")

c1 = carro("amarelo", 100000, "sim")
c2 = carro("cinza", 500000, "não")

print(c1)