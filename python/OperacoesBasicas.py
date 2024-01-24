class OperacoesBasicas:
    def soma(self, a, b):
        return a + b

    def a_potencia_b(self, a, b):
        a_potencia_b = a**b
        return a_potencia_b

# Crie uma instância da classe
operacoes_basicas = OperacoesBasicas()
# Chame os métodos usando a instância
resultado_soma = operacoes_basicas.soma(4, 5)
resultado_potencia = operacoes_basicas.a_potencia_b(4, 4)

print(resultado_soma)  # Irá imprimir 9
print(resultado_potencia)  # Irá imprimir 16
