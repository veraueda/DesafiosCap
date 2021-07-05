# prjcadanuncio
Sistema de Cadastro de Anúncios

1. Descrição do Sistema

O sistema de Cadastro de Anúncios foi desenvolvido em Java utilizando o aplicativo Apache Netbeans IDE - versão 12.1 e o Banco de Dados Relacional MySql.

Para a geração dos relatórios, foi utilizado o aplicativo Jasper Soft Studio - versão 6.17.0.

Observação: Foi possível somente implementar um relatório onde é listado todo o Cadastro de Anúncios na opção Por Cliente. 

A estrutura das pastas do Sistema de Cadastro de Anúncios ficou dividida da seguinte forma:

Pasta do Projeto: prjcadanuncio
Subpastas:
	src (source packages) --> br.com.capgemini
		dal --> ModuloConexao.java (contém informações sobre a Conexão com o Banco de Dados MySql)
		icones --> Contém os arquivos de imagens utilizados no Sistema
		rel --> RelatorioAnuncio.jrxml (contém o formulário gerado pelo Aplicativo Jasper Soft Studio)
		telas --> Contém os arquivos .form com o design das telas e .java com a programação java do Sistema.

Para a programação e funcionamento do Sistema, foi necessário importar as bibliotecas abaixo, sendo que as versões utilizadas foram as disponíveis nesse momento.
- mysql-connector-java-8.0.25.jar
- jasperreports-6.17.0.jar
- commons-beanutils-1.9.4.jar
- commons-logging-1.2.jar
- commons-collections4-4.4.jar
- commons-digester-2.1.jar

2. Como compilar e executar o programa	

- Executar o aplicativo Apache NetBeans IDE
- Selecione a opção de importar o projeto
	File --> Import Project --> From ZIP...
		Selecione o arquivo "prjcapanuncio.zip" que está no GitHub

- Abra o projeto prjcapanuncio (caso esteja fechado)
- Para compilar, selecione o projeto e com o botão direito do mouse, selecione a opção "Clean and Build".

Obs: Para a programação e funcionamento do Sistema, foi necessário importar as bibliotecas abaixo, sendo que as versões utilizadas foram as disponíveis nesse momento. Então pode ser que sejam necessárias o download das bibliotecas abaixo:
 
- mysql-connector-java-8.0.25.jar
- jasperreports-6.17.0.jar
- commons-beanutils-1.9.4.jar
- commons-logging-1.2.jar
- commons-collections4-4.4.jar
- commons-digester-2.1.jar

Para acessar o Banco de dados MySql, será necessário a criação do Banco e da tabela. Segue abaixo as informações:

Nome do Banco: db_anuncio
Tabela: tbl_anuncio
Colunas:
id_anuncio, int, chave primária
nome_anuncio, varchar(45), not null
cliente_anuncio, varchar(45), not null
dataInicio_anuncio, date, not null
dataTermino_anuncio, date, not null
investimentoDia_anuncio, decimal(10,2), not null
Login: root
Senha: Banco_21


3. Instruções de utilização

O sistema apresenta na Tela Principal um Menu na parte superior com as seguintes opções:
- Cadastro --> Cadastro de Anúncios
- Relatórios --> Por Intervalo de Tempo (não implementado)
             --> Por Cliente 
- Ajuda --> Sobre
- Opções -- > Sair

Ao selecionar a Tela de Cadastro de Anúncios, o sistema disponibiliza as seguintes operações:

- Inclusão de um Anúncio
- Consulta de um Anúncio (pesquisa pelo Código do Anúncio) 
- Alteração de um Anúncio
- Exclusão de um Anúncio

Para estas operações a conexão é realizada com o Banco de Dados MySql através o conector JDBC.
Todas as operações têm como chave primária o código do Anúncio.
Como todos os campos não podem ser nulos, o sistema obriga que todos os campos sejam preenchidos.
Existe validação em todos os campos para não ocorrer erros na efetivação de cada operação.

Exemplo para teste:

Código do Anúncio: 1
Nome do Anúncio: Anúncio 1
Nome do Cliente: Cliente XYZ
Data de início: 05/07/2021
Data de término: 05/12/2021
Investimento por dia: 1.00

Selecionar o primeiro botão com a imagem de "+" para adicionar o registro.
O Sistema vai enviar uma mensagem de "Anúncio adicionado com sucesso"

Para consultar algum anúncio, informe o código do anúncio e aperte no botão com a imagem da lupa. Se o registro existir, o sistema vai mostrar as informações na tela.

Para Alterar as informações de algum anúncio, digite os campos a serem alterados e aperte no botão com a imagem do lápis. O sistema vai enviar uma mensagem de "Anúncio alterado com sucesso"

Para Remover um Anúncio, digite o Código do Anúncio a ser excluído e aperte no botão com a imagem "X". O sistema vai perguntar se tem certeza que quer remover esse anúncio antes de ser removido.

