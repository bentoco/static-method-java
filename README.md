# static-method-java

Alguns exercícios com métodos e atributos estáticos Java.

Características que anotei:
- método ou variável static pertence a classe e não ao objeto
- não pertence a programação não orientada a objeto
- disponíveis em memória antes de estanciarmos a classe
- não é necessário estanciar o objeto quando o método é static
- são utilizados quando não precisamos acessar o estado de um objeto
- quando estamos dentro de um método estático e tentamos acessar algum objeto, método ou atributo não estático um erro será apresentado.
- muito úteis para métodos utilitários, exemplos: realizar uma ordenação, uma lista em um set, gerador de senha, variáveis globais.
- quando dependemos do estado do objeto dependemos da orientação orientado a objetos
- variaveis non-statics não poderão ser utilizados em métodos statics.
- variaveis statics utilizadas em métodos non-statics se faz necessário estanciar o objeto. visto que métodos statics são disponibilizados em mémoria logo quando a aplicação sobe, conforme dito acima.
