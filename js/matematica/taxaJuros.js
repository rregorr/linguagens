/* . Taxa de Juros Nominal
 A taxa de juros nominal é aquela que é expressa em um determinado período de tempo, mas cujo
 período de capitalização dos juros é diferente do período de tempo a que a taxa se refere.
 Geralmente, ela não reflete o custo real do dinheiro, pois não considera a frequência da
 capitalização.
 */




 /* Taxa de Juros Efetiva
 A taxa de juros efetiva é aquela que considera a capitalização dos juros em um determinado período
 de tempo.  Ela reflete o custo real do dinheiro, pois leva em conta a frequência com que os juros são  
 capitalizados. 
 */ 
function taxaJurosEfetiva (N, i, t) {
    let taxaEfetiva = (1 + i) ** t - 1;
    return taxaEfetiva;
}       
let taxaEfetiva = taxaJurosEfetiva(1000, 0.01, 12);
console.log(`\nTaxa de Juros Efetiva: ${taxaEfetiva.toFixed(4)}`);  

function conversaoAparenteReal(Ia, Inf) {
    /*
    Ia: Taxa de juros aparente
    Iinf: Taxa de inflação
    Ir: Taxa de juros real
    */
    //(1+Ia) = (1+Inf)*(1+Ir);
    let Ir = ((Ia - Inf) / (1 + Inf));
    return Ir;
}
console.log("\nTaxa de Juros Real: " + conversaoAparenteReal(0.8, 0.2));    

function conversaoRealAparente (Ir, Inf) {
    let Ia = 2 + Ir + Inf + (Ir * Inf);
    return Ia;  
}
console.log("\nTaxa de Juros Aparente: " + conversaoRealAparente(0.8, 0.2));

function taxaEfetiva2 (i_nominal, n) {
    //let i_efetiva = (1 + i_nominal / n)**n - 1;
    (1 + In)**t == (1 + Ie)**t;
    return In;
}
console.log("\nTaxa de Juros Efetiva: " + taxaEfetiva2(0.2, 12).toFixed(2));