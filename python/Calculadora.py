def somar(a, b):    
    return a + b

def subtrair(a, b):    
    return a - b

def multiplicar(a, b):    
    return a * b

def dividir(a, b):    
    return a / b

a = int(input("Digite o primeiro número:"))
b = int(input("Digite o segundo número:"))

while (True):
    operacao = input("Informe a operação (+, -, *, /) ou 'x' para sair: ")
    if (operacao == "+"): 
        resultado = somar(a, b)
        print(f"Seguem os resultados\n {a} + {b} = {resultado}")

    elif (operacao == "-"):
        resultado = subtrair(a, b)
        print(f"Seguem os resultados\n {a} - {b} = {resultado}")
    
    elif (operacao == "x"):
        print("A aplicação será encerrada!")
        break
