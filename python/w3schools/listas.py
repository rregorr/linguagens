idade1 = {1, 2, 4, 5, 7}
idade2 = {2, 3, 7}

# insere os itens, mas retornar novo set
idade_union = idade1.union(idade2)
print(f"idade união: {idade_union}")

# mesmo efeito que anterior, mas precisa ser do mesmo tipo (set com set)
idade_union_barra = idade1 | idade2
print(f"idade união |: {idade_union_barra}")

#Já insere os itens, s/ retornar novo set
# Both union() and update() will exclude any duplicate items.
idade1.update(idade2)
print(f"idade1: {idade1}")

# retorna apenas os duplicados
idade_interseccao = idade1.intersection(idade2)
print(f"Interseccao: {idade_interseccao}")

idade1.intersection_update(idade2)
print(f"intersection_update: {idade1}")
