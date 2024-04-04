class carro:
    #Variável de classe texto
    texto = "Gire a chave e eu ligarei!"
    giro = True
    def __init__(self, cor, ano, valor):
        self.cor = cor
        self.ano = ano
        self.valor = valor

    def ligar(self):
        #Para acessar variáveis de classe como texto dentro de um método de instância, 
        #precisa usar self.texto - ou carro.texto.
        if "Gire" in self.texto:
            #Já para acessar o atributo cor, no método ligar, deve-se usar self, porque 
            #cor é um atributo da instância, não da classe. carro.cor tentaria acessar 
            #um atributo de classe chamado cor, que não existe.
            a = "lig"+format(8) not in carro.texto
            print(a)
            print(f"A instrução para ligar o carro {self.cor} FOI FORNECIDA!")
        else:
            print(F"A instrução para ligar o carro {self.cor} NÃO foi fornecida!")    
    
c1 = carro("branco", 1984, 100000)
c1.ligar()
