
def enfileirar():
    lista = []    
    #sc = int(input(""))

    while True:
        numero = input("Informe um número para adicionar à lista ou 'x' para sair: ")
        if (numero == "x"):
            print("Você digitou 'x'. O programa foi encerrado!!!")
            break
        else:
            lista.append(numero)
            print(f"O número {numero} foi adicionado à lista. A lista agora contém os seguintes números {lista} ")
    return lista


def desenfileirar(lista):
    lista.pop(0)
    print(f"Primeiro número da fila removido. A lista contém agora os seguintes elementos: {lista}")
def exibir():
    pass

lista = enfileirar()

desenfileirar(lista)