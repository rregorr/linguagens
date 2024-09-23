# O Máximo Divisor Comum (MDC) de dois ou mais números inteiros, positivos e diferentes de zero é o maior (máximo) número inteiro que divide simultaneamente esses dois ou mais números. Os exemplos a seguir ilustram o cálculo do MDC.
# Item 1: Descreva em português, sucinta e precisamente, o passo a passo de um algoritmo eficiente que calcula o MDC de dois números inteiros, positivos e diferentes de zero.
# a) deve respeitar rigorosamente a especificação; b) deve ser claro e organizado; c) não deve conter comentários e/ou justificativas; d) não deve incluir trechos que estejam fora
#  do escopo da solução

# Passo 1: Receber os dois números inteiros, positivos e diferentes de zero. 
# Passo 2: Determinar o maior e o menor dentre eles. 
# Passo 3: Obter o módulo da divisão do número maior pelo número menor, que é o resto. Quando o resto for igual a zero, o valor do número maior será o MDC.

def MDCmulti():
    a = int(input("Forneça o primeiro número: "))
    b = int(input("Forneça o segundo número: "))

    while (b != 0):
        resto = a % b 
        a = b
        b = resto
    
    print(f"O MDC é {a}")

MDCmulti()

# Item 2
# # Codifique um(a) método/função intitulado(a) MDCmulti que calcule e retorne o MDC de um conjunto de números, ou seja, o maior (máximo) número que divide simultaneamente 
# todos os números do conjunto fornecido. A função, ou método, recebe apenas um parâmetro, na forma de um array, contendo dois ou mais números inteiros, positivos e diferentes 
# de zero. Esse parâmetro não deve ser validado, pois supostamente estará sempre correto. Uma dica útil: MDC(a,b,c) = MDC(MDC(a,b), c).
# # O código deve ser integralmente codificado numa única linguagem, que pode ser Java ou JavaScript. Nenhuma outra será aceita.
# # • Caso a linguagem escolhida for JavaScript, basta codificar uma função (function); eventuais funções auxiliares devem adotar o mesmo padrão;
# # • Caso a linguagem escolhida for Java, basta codificar um método (static), não sendo necessário apresentar as demais declarações que constituem a classe; eventuais 
# métodos auxiliares devem adotar o mesmo padrão.
# # • Para facilitar a codificação, é permitido supor, e utilizar opcionalmente, um(a) método/função preexistente, intitulado(a) MDCdue, que retorna o MDC de dois números 
# inteiros, a e b, positivos e diferentes de zero, recebidos como parâmetros de acordo com os modelos a seguir. O método/ função MDCdue pode ser invocado(a) no código apresentado 
# sem necessidade de codificar sua implementação, e o resultado retornado é suposto correto. Nenhum(a) outro(a) método/função adicional, oriundos de bibliotecas, módulos ou 
# frameworks, e afins, pode ser empregado(a) no código apresentado.

# O plano de trabalho elaborado pelo servidor com base em situações similares de requisição de trabalho remoto na unidade (arquivo) foi submetido aos gestores da SESUP, porém, 
# ainda está em discussão. Mesmo assim, submeto o plano de trabalho em questão no PROAD, ficando aberto a alterações, caso a gestão assim entenda necessário. 



