let ola = "Ola, " /*Variavel estática*/ 
var mundo = "mundo " //frase
var cruel: String = "cruel"
var `var` = "!"
var trabalhou, recebeu : Double
let uint = UInt8.max;
let num1 = 2e5 //2*10^5
let error = (500, "Page Not Found!", "Se ferrou!")
let num3 = true

print(ola+mundo+cruel+`var`) //usar palavras reservadas como variaveis/desaconselhável
print(uint)
print(num1)
print(error)

//ao imprimir error nao preciso de todas as mensagens
let (status, message, _) = error
print(message)

print("A ultima mensagem de error, é: \(error.2)")

//if (num1==1 ? 100 : 200)

print(num1)

