package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication /*essa anotação combina as anotações: @Configuration, que indica que a classe 
é uma classe de configuração do Spring, @EnableAutoConfiguration, que Habilita a configuração automática 
no aplicativo Spring Boot, assim vocâ não precisa configurar manualmente bancos de dados etc.
@ComponentScan: Indica ao Spring Boot onde procurar componentes gerenciados pelo Spring, como controladores, 
serviços e repositórios. Por padrão, ele procura componentes no mesmo pacote onde a classe 
@SpringBootApplication está localizada e em subpacotes desse pacote.

 */
@RestController /*define uma classe como um controlador do Spring MVC; a classe irá lidar com as 
solicitações HTTP e retornar respostas, geralmente em formato JSON. */
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }

    /*@GetMapping é usada para mapear este método hello a solicitações HTTP GET para o caminho /ola. 
    Ou seja, quando você acessar /ola em um navegador, o método hello será executado e retornará uma resposta. */
    @GetMapping("/ola")
   
    /*Agora, imagine que você digita a seguinte URL no seu navegador: http://localhost:8080/ola?name=John
    Você está acessando o endpoint /ola no seu aplicativo e passando um parâmetro de consulta chamado name 
    com o valor John. @RequestParam no código serve para pegar esse parâmetro de consulta da URL e usá-lo 
    no método. No exemplo acima, o valor John passado como parâmetro de consulta será atribuído à 
    variável name no método hello. O resultado será uma resposta com a saudação "Olá, John!". 
    Se você não passar nenhum parâmetro de consulta, a anotação @RequestParam usará o valor padrão "World",
    como definido aqui:*/
    public String hello(@RequestParam(value = "name", defaultValue = "Heitor") String name) {
      return String.format("Olá, %s!", name);
    }
}

/*
 * CLASSES NAO USADAS NO CODIGO
 * A anotação @Service é usada para marcar uma classe como um serviço Spring. Um serviço é normalmente usado
 * para conter a lógica de negócios do aplicativo. No seu código atual, não há um serviço explicitamente
 * definido, mas a anotação @Service pode ser usada em uma classe que contém funcionalidades de negócios 
 * mais complexas.
 * 
 * A anotação @Repository é usada para marcar uma classe como um repositório Spring. Em geral, um repositório 
 * é usado para acessar e persistir dados em um banco de dados.
 * 
 *A anotação @Autowired é usada para injetar dependências automaticamente em classes, métodos ou construtores 
 * 
 * @Componente:  é usada para marcar uma classe como um componente gerenciado pelo Spring.Isso significa 
 * que o Spring Boot gerenciará e criará uma instância de MyService, tornando-a disponível para ser
 * injetada em outras partes do aplicativo
 * 
 * @Configuration
 * 
 * A anotação @Value é usada para injetar valores de propriedade do arquivo de configuração, como 
 * application.properties ou application.yml, em campos ou métodos. Isso permite que você configure 
 * dinamicamente propriedades do aplicativo a partir de um arquivo de configuração externo, tornando-o 
 * mais flexível e configurável.
 * @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PathVariable
 * 
 * A anotação @CrossOrigin é usada para configurar a política de controle de acesso a recursos de origens 
 * diferentes (CORS - Cross-Origin Resource Sharing). No exemplo acima, adicionamos 
 * @CrossOrigin(origins = "http://localhost:8081") ao método permitido. Isso permite solicitações de 
 * origens específicas, neste caso, apenas do domínio http://localhost:8081.

O CORS é importante para a segurança dos navegadores, pois ajuda a evitar solicitações maliciosas de origens não autorizadas.
 * 
 * 
 * 
 * 
 * Resposta: E

Principais coisas a saber

@Controller

É a principal anotação para definir uma classe como um Controller do Spring MVC. O Controller é responsável por mapear e receber as requisições enviadas pelo cliente. 

@RestController

Define uma classe como um Controller REST do Spring MVC. A principal diferença para o @Controller é que o RestController não procura uma página ao retornar um valor, e sim retorna exatamente aquele valor.

Exemplo: Ao retornar uma String “ralph”, o @Controller procuraria por um arquivo (HTML, JSP ou qualquer formato configurado) com esse nome. O @RestController retornaria exatamente “ralph”.

@RequestMapping

Principal anotação para definir mapeamentos. Nele é definido o método HTTP a ser utilizado, qual Path a ser chamado, qual vai ser o tipo de dados aceitos e o tipo de retorno do conteúdo.


 * 
 */