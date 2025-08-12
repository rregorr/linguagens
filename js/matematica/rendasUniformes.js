/* . Rendas Uniformes
 As rendas uniformes, ou anuidades uniformes, são caracterizadas por pagamentos ou
 recebimentos de valores iguais que ocorrem em intervalos de tempo regulares. São as mais
 comuns e fáceis de calcular, sendo a base para muitos produtos financeiros.
 Existem dois tipos principais de rendas uniformes:
 - Rendas Postecipadas (ou Ordinárias)
 Neste tipo de renda, os pagamentos ou recebimentos ocorrem no final de cada período. É o caso
 mais comum em financiamentos e empréstimos, onde a primeira parcela é paga um período após
 a liberação do capital
  Valor Presente de uma Renda Uniforme Postecipada: PV = PMT * [ (1 - (1 + i)^-n) / i ]
   Onde: * 
PV = Valor Presente (valor atual da série de pagamentos) * 
pagamento/recebimento * 
PMT = Valor de cada
 i = Taxa de juros por período * n = Número de períodos

 */
function rendaUniformePostecipada(PMT, i, n) {
   let PV = PMT * ((1 - (1 + i)^(n-1)) / i);
   return PV;
}

rupa = rendaUniformePostecipada(500, 0.01, 12);
console.log(`\nValor Presente de uma Renda Uniforme Postecipada: ${rupa}`);