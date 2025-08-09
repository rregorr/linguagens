<<<<<<< HEAD
def empilhar():
    fila = []
    
    while True:
        numero = input("Digite o número a ser empilhado ou 'x' para sair: ")
        if numero == 'x':
            break
        try:
            fila.append(int(numero))  # Adiciona o número a fila
            print(f"Número {numero} empilhado com sucesso!")
        except ValueError:
            print("Entrada inválida. Por favor, digite um número inteiro ou 'x' para sair.")

    return fila

fila = empilhar()   
print(f"Os números empilhados foram: {fila}")   
=======

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
>>>>>>> d7d7b56acfd08937024b92c2293bce4875d342ae
