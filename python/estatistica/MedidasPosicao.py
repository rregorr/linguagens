lista = []

while(True):
  numeros = int(input("Informe os números. Digite -1 se quiser sair: "))
  if (numeros == -1):
    break;
  lista.append(numeros)
 # print("Numeros adicionados: ", lista)

print(lista)

for i in range(len(lista) - 1):
  for j in range(len(lista) - i - 1):
    if (lista[j] > lista[j + 1]):
      temp = lista[j]
      lista[j] = lista[j+1]
      lista[j+1] = temp

print("Lista ordenada:", lista)