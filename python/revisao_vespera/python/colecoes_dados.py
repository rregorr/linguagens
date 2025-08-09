import numpy as np
minha_lista = [1,2,3,4,5]

cliente = {
    "nome": "Rogerio",
    "idade": 50,
    "telefone": 123
}

print(f"\nchaves do dicionário cliente: {cliente.keys()}")
print(f"Valores do dicionário cliente: {cliente.values()}\n")
print(f"Retorna pares chave-valor do dicionário cliente: {cliente.items()}\n")
print(f"Valores update do dicionário cliente: {cliente.update()}\n")

# Numpy
print(f"1:\n {np.ones((2,3))}\n")
print(f"Numpy arange:\n {np.arange(1,20,3)}\n") #1 a 19 de 3 em 3
print(f"Numpy linspace:\n {np.linspace(1,10,3)}\n") #1 a 19 de 3 em 3

nome = "Rogerio\'"
nome_alterado = nome.replace("o", "a")
print(nome_alterado)

for i, valor in (enumerate(minha_lista)):
    print("indice {}, valores {}".format(i, valor))

# [expresséo for item in iterével]

# x = [x**x for x in minha_lista if x == 3]
#x = [x**x for x in minha_lista if x > 3]
#print(x)

def expressoes (x): 
    return x > 3

#result = expressoes()
#print(result)
minha_lista = [1, 2, 3, 4, 5]
print(list(map(expressoes, minha_lista)))
print(list(filter(expressoes, minha_lista)))

