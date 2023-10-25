#Sequência para upar uma alteração (1 - git add, 2 - git commit 3 - git push)
#Desempacotando coleções - permite extrair valores de coleções em variáveis
frutas = ["Morango", "Maças", "Laranjas"]
x, y, z = frutas

print(x)
print(y)
print(z)

#https://www.w3schools.com/python/python_variables_global.asp
def myfunc():
  global p
  p = "Rogerio"

myfunc()

print("Python é do: " + p)

#https://www.w3schools.com/python/python_numbers.asp
import random
print(random.randrange(1,10))

#https://www.w3schools.com/python/python_casting.asp
i = 5
print(type(i))
j = float(i)
print(type(j))
#str() - constructs a string from a wide variety of data types, including 
# strings, integer literals and float literals
k = str(j)
print(type(k))

print(type(float("4")))

#https://www.w3schools.com/python/python_strings.asp
nome = "Rogerio"
for i in nome:
  print(i)
print()