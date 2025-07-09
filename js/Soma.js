function somar(a, b) {
    return a + b;
}

function subtrair(a, b) {
    return a - b;
}

function multiplicar(a, b) {
    return a * b;
}

function dividir(a, b) {
    if (b === 0) {
        return "Erro: divisão por zero";
    }
    return a / b;
}

const prompt = require('prompt-sync')();
let a = parseFloat(prompt("Digite o primeiro número:"));
let b = parseFloat(prompt("Digite o segundo número:"));

while (true) {
    let operacao = prompt("Informe a operação (+, -, *, /) ou 'x' para sair:");

    if (operacao === "+") { //(comparação estrita) Compara valores e tipos. Só retorna true se ambos forem idênticos em valor e tipo. Ex: 5 é diferente de "5"
        let resultado = somar(a, b);
        console.log(`${a} + ${b} = ${resultado}`);
    }
    else if (operacao === "-") {
        let resultado = subtrair(a, b);
        console.log(`${a} - ${b} = ${resultado}`);
    }
    else if (operacao === "*") {
        let resultado = multiplicar(a, b);
        console.log(`${a} * ${b} = ${resultado}`);
    }
    else if (operacao === "/") {
        let resultado = dividir(a, b);
        console.log(`${a} / ${b} = ${resultado}`);
    }
    else if (operacao === "x") {
        console.log("A aplicação será encerrada!");
        break;
    }
    else {
        console.log("Operação inválida! Tente novamente.");
    }
}

//Lista
fruits = ["oranges", "apples", "grapes"]
console.log(fruits)
typeof(fruits)