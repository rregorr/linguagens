function juros_simples (c, i, t) {
    let juros = c * i * t;
    let montante = c + juros;
    return {juros, montante};
}

let resultado = juros_simples(1000, 1, 12); 
console.log(`---Resumo---\nMontante Simples: ${resultado.montante}, \nJuros Simples: ${resultado.juros}`); 

function juros_compostos (c, i, t) {
    let montante = c * (1 + i) ** t;
    return montante;
}

//juros_compostos(1000, 0.01, 12);
let montanteComposto = juros_compostos(5000,0.01, 6);
let jurosComposto = montanteComposto - 5000;
console.log(`\nMontante Composto: ${montanteComposto} \nJuros Compostos: ${jurosComposto}`);

/*
 Capitalização e desconto são operações financeiras fundamentais que envolvem a movimentação
 de valores no tempo. A capitalização trata do processo de levar um valor presente para um valor
 futuro, considerando a incidência de juros. O desconto, por sua vez, é o processo inverso, ou seja,
 trazer um valor futuro para o presente, retirando os juros.
 */

 function desconto_simples (N, i, t) {
    let desconto = N * i * t;
    let valor_presente = N - desconto;
    return {desconto, valor_presente};
 }
let resultadoDesconto = desconto_simples(1000, 0.02, 3);
console.log(`\n---Resumo Desconto Simples---\nValor Presente: ${resultadoDesconto.valor_presente}, \nDesconto Simples: ${resultadoDesconto.desconto}`);

 /*Fórmula do Valor Atual (Valor Líquido) com Desconto Composto:
 A = N / (1 + i)^t
 Onde: * A = Valor Atual (valor presente) * N = Valor Nominal (valor futuro do título) * i = Taxa de
 desconto (em forma decimal) * t = Tempo (período de antecipação)
 Fórmula do Desconto Composto:
 D = N - A
 */
function descontoComposto (N, i, t) {
    let valor_presente = N / (1 + i) ** t; //A
    let desconto = N - valor_presente
    return {desconto, valor_presente};
}
let resultadoDescontoComposto = descontoComposto(1000, 0.02, 3);
console.log(`\n---Resumo Desconto Composto---\nValor Presente: ${resultadoDescontoComposto.valor_presente}, \nDesconto Composto: ${resultadoDescontoComposto.desconto}`);