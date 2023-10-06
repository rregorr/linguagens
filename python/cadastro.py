# todas as variaveis primitivas
nome = "Josias"
idade = 20
estudante = False

# criar e operar em listas
gostos = ["Rock", "MPB", "Classic"]

# Operações na lista gostos - uma lista tem métodos de alteração, como adicionar/remover itens.
gostos.append("Forro")
print(gostos)
gostos.pop() 
print(gostos)

# criar e operar em tuplas
filhos = ("Maria", "Joao") # filhos não tem métodos de adicionar/remover já que é estático.

# criar e operar em dicionário
bens = {
    "carro" : ["fiat", "renault"],
    "casa" : ["cor", "valor", {"bairro": ["Brooklyn", "São Paulo", {"profissao":["Analista", "Zebuc"]}]}]
}

print (bens["carro"][0])
print(bens["casa"][2]["bairro"][2]["profissao"][1])

# criar e operar em filas


# criar e operar em listas


# Estruturas repetitivas 


# Fatiar dados

"""
print(bens[0][1])

for i in range(len(bens)):
    print(i)
    print(bens[0][1])

    """