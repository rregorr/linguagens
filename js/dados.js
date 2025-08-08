//listas
const lista1 = ["joão",11,3]
let lista2 = [3,2,1]

const matriz = [[1,2],
                [3,4]]
                
const grafo = {
    a: ['a', 'b'],
    b: ['c', 'd']
}

const { a = 1 } = {};

console.log(matriz)
console.log(grafo)

const x = 0;
const y = "i";

if (x == y) {
    console.log("Apenas os valores são iguais");
}
if (x === y) {
    console.log("Os valores e tipos são iguais");
}

else if (x != y) {
    console.log("Os valores são diferentes");
}

console.log("for..of percorre os valores da lista, que são: ");
for (let i of lista2) {
    console.log(i);
}

console.log("for..in percorre os índices da lista, que são: ");
for (let i in lista2) {
    console.log(i);
}

let soma = lista2.reduce((ac, val) => ac + val, 0); //val, valor inicial, 0! vai iterando na lista2 e acumulando
//em ac
console.log("Valor final do acumulador: " + soma);