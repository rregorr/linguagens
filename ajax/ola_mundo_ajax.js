/*Seleciona o elemento HTML com o ID loadButton e adiciona um ouvinte de eventos que aguarda o 
evento de clique. Quando o botão é clicado, a função anônima fornecida é executada. */
document.getElementById('botao').addEventListener('click', function() {

  /*Cria um novo objeto XMLHttpRequest, que é o coração da funcionalidade AJAX. Este objeto p
  ermite fazer pedidos HTTP para o servidor sem recarregar a página.*/
  var xhr = new XMLHttpRequest();

 // Define uma função que será chamada sempre que o estado do XMLHttpRequest mudar.
  xhr.onreadystatechange = function() {

    //Verifica se a operação do pedido está completa (XMLHttpRequest.DONE é igual a 4).
    /*readyState: armazena o status do XMLHttpRequest.
    0: Requisição não iniciada;
    1: Conexão com servidor estabelecida;
    2: Requisição recebida;
    3: Requisição processada;
    4: Requisição finalizada e resposta pronta.
*/

      if (xhr.readyState == XMLHttpRequest.DONE) {
        //Se o pedido estiver completo, verifica se o status HTTP é 200, o que significa que 
        //o pedido foi bem-sucedido.
          if (xhr.status == 200) { //Diferente de 200 seria 404:página não encontrada
            //Se o pedido foi bem-sucedido, ele pega a resposta do servidor, que é o texto 
            //"Hello World", e define o texto interno do elemento div com ID message para esse 
            //texto, tornando-o visível na página.
              document.getElementById('message').innerText = xhr.responseText;

              //Se o status HTTP não for 200, significa que houve um problema com o pedido, e uma 
              //mensagem de alerta é mostrada ao usuário.
          } else {
              alert('There was a problem with the request.');
          }
      }
  };

  //Inicia um pedido GET para o recurso hello.txt. O terceiro parâmetro true especifica que o 
  //pedido deve ser feito de forma assíncrona.
  xhr.open('GET', 'ola_mundo.txt', true);

  //Envia o pedido ao servidor.
  xhr.send();
});
