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
