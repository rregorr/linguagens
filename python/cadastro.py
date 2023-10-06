# todas as variaveis primitivas
nome = "Josias Souza"
idade = 20
estudante = False

# criar e operar em listas - uma lista tem métodos de alteração, como adicionar/remover itens.
gostos = ["Rock", "MPB", "Classic", "Valsa", "Tango", "House"]
print('A lista foi criada. Ela está assim:\n {}'.format(gostos), '\n')

gostos.append("Forro") #insere item na última posicao da lista
print('Foi adicionado o item {} usando o método append(). A lista agora é essa:\n {}'.format("Forro", gostos),'\n')

gostos.insert(1, "Samba Raiz") #insere item na posicao indicada, o item que existia é "arrastado" pra direita.
print("Foi adicionado o item {} usando o método insert() na posição {}. A lista agora está assim:\n {}".format("Futebol", 1, gostos), '\n')

gostos.remove("MPB") # remove item com base no valor (e não na posição) - remove apenas a 1a ocorrencia
print("Foi removido o item {} usando o método remove(). A lista agora está assim:\n {}".format("MPB", gostos), '\n')

gostos.pop() # remove item do topo
print("Foi removido último item da lista usando o método pop(). A lista agora está assim:\n {}".format(gostos), '\n')

del gostos[0] #remove item na posição indicada
print("Foi removido o item da posicao 0 usando o método del. A lista agora está assim:\n {}".format(gostos), '\n')

# criar e operar em tuplas
filhos = ("Maria", "Joao") # filhos não tem métodos de adicionar/remover já que é estático.
print('Foi criada a tupla filhos. A tupla está assim:\n {}'.format(filhos))

# criar e operar em dicionário
bens = {
    "carro" : ["fiat", "renault"],
    "casa" : ["cor", "valor", {"bairro": ["Brooklyn", "São Paulo", {"profissao":["Analista", "Zebuc"]}]}]
}

print('Foi criado o dicionario bens. O dicionário está assim:\n {}'.format(bens), '\n')
print("Acessando o primeiro item do dicionário bens:  {}".format(bens["carro"][0]),'\n')
print("Acessando elementos aninhado do dicionário bens:  {}".format(bens["casa"][2]["bairro"][2]["profissao"][1]),'\n')

print("Agora vamos iterar na lista gostos. Os gostos agora, são:")
#for
for gosto in gostos:
    print(f'{gosto}')

#if
if (nome == "Josias Soza"):
    print("Seu nome é {}".format(nome))
else:
    print("Seu nome não é {}".format(nome))

#while
while(idade <= 18):
    print(f"Vc tem menos de 18 anos, e não pode beber.")
    idade += 1

#do while não existe em python, mas o mesmo efeito é conseguido com while-if

#fatiamentos de lista - incluir números negativos
print("\n--------Trabalhando com fatiamentos:--------\n")
print("Os primeiros 3 elementos da lista, são: {}".format(gostos[0:3]))
print(f"Os elementos do 2o ao 5o elemento da lista, são: {gostos[1:4]}")

#fatiar dicionario



