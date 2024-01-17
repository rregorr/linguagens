//Resolver as questões: Aula01: 5, 15,20,21,22
 /*A Elasticidade-preço da Demanda compara a variação percentual na quantidade demandada
    com a variação percentual do preço. v0: valor inicial do bem; v1: valor final; p1: preço inicial
    A elasticidade-preço da demanda tem relação com a receita-total do produtor e, ao mesmo
    tempo, com a despesa total do produtor com determinado bem. Se a EPD é unitária, significa
    que uma variação no preço leva a uma variação igual, em termos proporcionais, na quantidade
    demandada. Por isso, o gasto total do consumidor não se alterada. 
    perfeitamente elástica. Grafico: seu formato é horizontal, demonstrando que qualquer mudança 
    no preço levará a uma alteração total na quantidade demandada. valor tende ao infinito. 
       
    |p
    |--------
    |__.__.__ q 

   Ex: o consumidor desiste de comprar se o preço tiver qualquer aumento ou a demanda for horizontal.
   
 /*Variação na quantidade demandada do bem X dividido pela variação do preço do bem Y.
    A elasticidade preço cruzada positiva é sinal de bens substitutos: o preço de um sobe, a
    demanda do outro aumenta, e o preço de um cai, a demanda do outro cai. Já bens como complementares: 
    aumenta o preço de um, cai a demanda do outro. Faz sentido, afinal, são consumidos juntos.Se a 
    elasticidade preço cruzada entre os bens A e B é negativa, então tais bens são complementares.
    
    Elasticidade renda da demanda: (variação % da quantidade demandada )/(Variação % renda)
    Ela nos diz quanto vai variar a demanda do bem diante de um aumento ou redução da renda do consumidor. 
    Pode ser positiva(caso dos bens normais), nula (bens de consumo saciado) ou negativa (bens inferiores). 
    No caso dos bens de Giffen, erd pode ser positiva. Ou seja, quando aumentar o preço, a quantidade 
    demandada também aumenta. 
    
    Demanda infinitamente elástica, na qual uma alteração qualquer no preço tem um efeito extremo na 
    quantidade demandada.

    Bens de Giffen: são Bens cuja curva de demanda tem inclinação ascendente. Ou seja, a relação entre demanda 
    e preço é positiva (se aumentarmos o preço do Bem de Giffen, teremos aumento da quantidade demandada!). 
    Como quantidade demandada e preços variam no mesmo sentido, então a elasticidade preço da demanda de um Bem 
    de Giffen é POSITIVA! Por exemplo, carnes de qualidade secundária e um pouco de carnes “premium”. 
    Se há um aumento do preço da carne de baixa qualidade, pode ser que o consumidor não tenha mais espaço 
    no seu orçamento para consumir carnes “premium”

 */
public class Elasticidade {
  //epd = variação % qtde demandada / variação % preço;
  public static float ElasticidadePrecoDemanda(int q1, int q0, float p1, float p0) {
       
    float epd = (float)(q1 - q0) / q0 / ((float)(p1 - p0) / p0);
    if (epd == 0) { //o consumidor compra a mesma quantidade, não importando o preço. Ex: insulina    
      System.out.println("Perfeitamente inelástica. Alterações no preço não irão alterar a quantidade" 
      + " demandada.");
    }
    else if (epd > 0 && epd < 1) {//Se preço de um bem com demanda inelástica aumenta, a receita total aumenta. A demanda é inelástica, então o aumento do preço vai reduzir a quantidade demanda, mas em menor proporção, ou seja, a receita total vai aumentar.         
      System.out.println("Demanda é Inelástica. Alterações no preço provocam variação proporcionalmente menores na" 
      + " quantidade demandada.");
    }
    else if (epd == 1) {
      System.out.println("Elasticidade unitária. Preço e quantidade variam na mesma proporação.");
    }
    else if (epd > 1){ //epd > 1. Qualquer valor superior a 1 indica uma demanda elástica.
      System.out.println("Oferta Elástica. Variação percentual do preço, leva a uma variação percentual da oferta,"+ 
      "maior que a do preço.");
    }
    else if (p1 > p0 || p1 < p0) {
        System.out.println("Infinitamente inelástica. Se o preço aumentar, a demanda vai para" + 
            "zero. Se o preço diminuir, a demanda vai para infinito.");
    }
    return epd;
  }
  public static float ElasticidadePrecoCruzadaDemanda(int q1x, int q0x, float p1y, float p0y) {
    //(Variação % da quantidade demandada do bem X)/(Variação % no preço do bem Y)
    float epcd = (float)(q1x-q0x)/q1x/((float)(p1y - p0y)/p0y);
    
    if (epcd < 0) {
      System.out.println("Bens Complementares: Quando o preço de um bem sobe, a\n" + 
          "quantidade demanda do outro cai.\n" + //
          "(Automóvel e gasolina)"); 
  }

  else if (epcd > 0) {
    System.out.println("Bens substitutos: Quando o preço de um bem sobe, a\n" + //
        "quantidade demanda do outro sobe\n" + //
        "também. (Coca-Cola e Pepsi)");
  }
  
    return epcd;
  }
   
public static float ElasticidadeRendaDemanda (int q1, int q0, float r1, float r0) {
  float erd = (float)(q1 - q0) / q0 / ((float)(r1 - r0)/r0);

  if (erd < 0) {
    System.out.println("Trata-se de um bem inferior: Renda e quantidade demanda variam em\n" + //
        "direções opostos. Se a renda aumenta, a\n" + //
        "quantidade demanda diminui.");
  }
  else if (erd >= 0 && erd <1) {
    System.out.println("Trata-se de um Bem Normal: Se a renda aumenta, a quantidade\n" + //
        "demanda aumenta em menor proporção.");
  }
  else {
    System.out.println("Bem Normal (alguns\n" + //
        "chamam de Bem de\n" + //
        "Luxo/Supérfluo)Se a renda aumenta, a quantidade\n" + //
        "demanda aumenta em maior proporção.");
  }
  return erd;
}

public static float ElasticidadePrecoOferta (int o1, int o0, float p1, float p0) {//Variação % da quantidade ofertada / Variação % do preço
  float epo = (float)(o1 - o0)/o0/((float)(p1-p0)/p0);

  if (epo == 0) { //o consumidor compra a mesma quantidade, não importando o preço. Ex: insulina    
      System.out.println("Oferta Totalmente inelástica. Alterações no preço não irão alterar a quantidade" 
      + " ofertada.");
    }
    else if (epo > 0 && epo < 1) {//Se preço de um bem com demanda inelástica aumenta, a receita total aumenta. A demanda é inelástica, então o aumento do preço vai reduzir a quantidade demanda, mas em menor proporção, ou seja, a receita total vai aumentar.         
      System.out.println("Oferta Inelástica. variação percentual do preço leva a uma variação percentual da" +
      "oferta, menor que a do preço");
    }
    else if (epo == 1) {
      System.out.println("Elasticidade unitária. Variação percentual do preço leva a uma variação percentual" +
      " da oferta, igual ao do preço.");
    }
    else if (epo > 1){ //epd > 1. Qualquer valor superior a 1 indica uma demanda elástica.
      System.out.println("Elástica. Alterações no preço provocam variação proporcionalmente maiores na quantidade demandada.");
    }
    else if (p1 > p0 || p1 < p0) {
        System.out.println("Infinitamente inelástica. Se o preço aumentar, a demanda vai para" + 
            "zero. Se o preço diminuir, a demanda vai para infinito.");
    }
  return epo;
}

  public static void main(String[] args) {
    float resultadoEpd = ElasticidadePrecoDemanda(870,1000,330,300);
    float resultadoErd = ElasticidadeRendaDemanda(0, 0, resultadoEpd, resultadoEpd);
    float resultadoEpcd = ElasticidadePrecoCruzadaDemanda(0, 0, resultadoEpd, resultadoErd);
    float resultadoEpo = ElasticidadePrecoCruzadaDemanda(0, 0, resultadoEpd, resultadoErd);
    System.out.println("Elasticidade Preço Demanda é: " + Math.abs(resultadoEpd));
    System.out.println("Elasticidade Renda Demanda é: " + Math.abs(resultadoErd));
    System.out.println("Elasticidade-Preço Cruzada Demanda é: " + Math.abs(resultadoEpcd));
  }
}