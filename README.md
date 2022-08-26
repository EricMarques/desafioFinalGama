# Desafio Final QE&A Automation Academy


## Estrategia de teste ##
Proposta: Cada equipe deverá elaborar um Plano de Testes e executá-los, registrando seus resultados mais relevantes, seguindo as seguintes especificações:
1. Os testes deverão ser planejados baseados num PROJETO de camada WEB e Banco de Dados que integrem um sistema específico. O planejamento deve ter, no mínimo, 5 Casos de Testes bem delineados e descritivos contendo informações do Cenário, Tipo de Teste, Descrição, Dados de entrada/saída, resultados esperados e resultados encontrados para posterior análise.
2. Ferramentas: Jmeter, Selenium IDE e MySQL (para testes envolvendo BD)
3. Tipos de Testes: Teste de  Carga, Teste de Estresse e Teste de Usabilidade
3. Sugestões de Cenários:
 - Teste de requisições HTTPS
 - Teste de Estresse com altos volumes de dados em Banco de Dados
 - Teste de performance com API
 - Teste de Validação de login e senha

### Cenários de Teste:
#### Cenário 1
*<u>Registro de Pessoa</u>*  
Tipo de teste: Teste de Estresse  
Ferramenta: Jmeter  
Estratégia: Será realizado a inserção de vários usuários diferentes no banco e após isso será realizado update dos mesmos para encontrar o limite de atuação do banco para as atividades.

#### Cenário 2 
*<u>Requisição de API</u>*  
Tipo de teste: Teste de Integração  
Ferramenta: SOAP UI  
Estratégia: Será verificado se a requisição para busca de endereço utilizando CEP válido está retornando o resultado esperado e se ao informar um CEP invalido a mensagem de erro é apresentada.

#### Cenário 3
*<u>Compra de um item na loja</u>*  
Tipo de teste:  Teste de Interface  
Ferramenta:  Eclipse, Selenium e Cucumber  
Estratégia: Será realizado automação do processo de compra no site e uma automação buscando um caso de falha quando não aceito os termos de serviço.

**Autores**:
- Eric Felipe Barros Marques
- Mariana Ito Rusig
- Nattana Gasparim
- Rodrigo Augusto Oliveira Freitas

