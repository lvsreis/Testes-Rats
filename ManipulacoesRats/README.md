<h1 align="center">Relatório Manipulações Rats</h1>

## Autores

👤 **Deiverson**

* Github:[@DeiversonMAP](https://github.com/DeiversonMAP) 
* Linkedin: 

👤 **Pedro Henrique**

* Github: [@PHenriqueCEC](https://github.com/PHenriqueCEC)
* LinkedIn: [Pedro Henrique](https://www.linkedin.com/in/pedro-henrique-77baa01a9/)

👤 **Raquel**

* Github:[@rgoulart8](https://github.com/rgoulart8)
* LinkedIn: [Raquel Goulart](https://br.linkedin.com/in/rgoulart8)


# Como rodar o projeto
**Certifique-se de ter o MinGW instalado**

1. Digite o comando abaixo:
```
make run
```

## Sobre o programa

```
Manipulações Rats foi um programa feito para avaliarmos o tempo de execução de análise sintática usando a biblioteca rats.jar. O programa foi feito utilizando a linguagem Java
onde o dividimos em algumas classes. Essas classes foram utilizadas de modo a deixar o programa
mais organizado, visando sua melhor compreensão e entendimento. Além disso, foi utilizado alguns conceitos trabalhados na disciplina de Orientação a Objetos, como Interfaces.

Após a execução do programa foi gerado um arquivo de saida no formato CSV contendo os dados do tempo de execução da análise sintática. Posto a isso, foi implementado um código em Python usando uma biblioteca chamada Matplotlib. Essa biblioteca é responsável por gerar um gráfico 
com os dados do arquivo CSV a fim de facilitar a visualização dos testes feitos.

```

## Classes implementadas
• Main.java
```
A classe Main.java é a classe principal do programa. É a classe utilizada para rodar o projeto.
Além disso, é responsável por gerar o arquivo de saída em formato CSV. (Tem que completar mais coisa aqui) 

```

• ColetarArquivos.java

```
A classe ColetarArquivos.java é responsável por coletar todas as pastas e arquivos de instâncias utilizadas para fazer os testes.  
```

• RunPair.java

```
Essa classe é responsável por coletar o tempo de execução dos programas. Após a coleta, é utilizado o método AddLi(), onde passamos o tempo de execução para ser inserido na tabela
```

• CSVTable.java
```
Classe utilizada por criar a tabela CSV. Nessa classe fazemos a inserção em linha e coluna do nome da linguagem e o tempo de execução, respectivamente. Além do mais, encontramos nessa classe outros métodos que auxiliam na criação/manipulação da tabela CSV.
```
