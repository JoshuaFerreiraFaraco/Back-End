# Back-End
Readme dedicado a Avaliação 02 - Projeto Intermediário dada pelo professor Ramon.

* Funcionamento do sistema.

Primeiramente para iniciar o sistema voce deve seguir a ordem das rotas a seguir, por alguma
razao a API de gestao da tabela Fipe funciona dessa forma.

* Rotas:

1 - /getMarca

Ele ira demonstrar todas as marcas de carros existentes, demonstrando tambem o seu codigo de marca.

2 - /getCarro/{marcaResp}

Nesse GET sera necessario enviar o codigo da Marca o qual voce esta pesquisando os carros.

Por exemplo /getCarro/25 - Honda, ele ira retornar todos os carros existentes daquela marca.

3 - /getAno/{carroResp}

Nesse GET sera necessario enviar o codigo do carro o qual voce esta pesquisando os anos e gasolinas.

Por exemplo getAno/4976 - CITY Sedan LX 1.5 Flex 16V 4p Mec., ele ira retornar os anos existentes
daquele veiculo.

4 - /getFipe/{anoResp}

Nesse GET sera necessario enviar o ano do carro o qual voce esta requerindo a tabela Fipe.

Por exemplo getFipe/2013-1, ele ira retornar toda a informacao sobre o veiculo por meio da tabela Fipe.

5 - /sobre

Sendo o mesmo apenas um GET para as informacoes requisitadas.

6 - /postFipe

Este seria o POST realizado para a API para retornar os valores adequados e processar as informacoes.
Porem, infelizmente esta API nao tem um metodo POST, o funcionamento deste processo é demonstrado por meio da mensagem "Method Not Allowed".

Seu funcionamento seria da seguinte forma:

http://localhost:8080/postFipe?vehicleType=cars&brandId=25&modelId=4976&yearId=2013-1

--------------------------------------------------------------------------------------------------

Lembrando que é necessário seguir está ordem para o funcionamento do sistema.