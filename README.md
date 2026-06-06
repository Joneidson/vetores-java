# 📦 Vetores Java

Exercicios de fixacao sobre vetores e arrays em Java.
Parte da trilha de estudos de **POO com Java**.

---

## 🧠 O que estou praticando

```
Vetores (arrays)
├── Declaracao e instanciacao
├── Preenchimento com for
├── for tradicional vs for-each
├── Vetores de primitivos (int, double)
├── Vetores de objetos (Numero, Produto...)
└── Filtros, somas, medias e comparacoes
```

---

## 📋 Exercicios

| # | Problema | Conceito principal | Status |
|---|---|---|---|
| 01 | negativos | filtro com `if` + for-each | ✅ |
| 02 | soma_vetor | soma e media | ✅ |
| 03 | numeros_pares | filtro de pares + contador | ✅ |
| 04 | maior_posicao | maior valor com vetor de objetos | ✅ |
| 05 | soma_vetores | dois vetores → terceiro | ⏳ |
| 06 | abaixo_da_media | comparar com media | ⏳ |
| 07 | media_pares | media condicional | ⏳ |
| 08 | mais_velho | dois vetores paralelos | ⏳ |
| 09 | aprovados | tres vetores paralelos | ⏳ |
| 10 | alturas | multiplos dados por pessoa | ⏳ |
| 11 | dados_pessoas | maior, menor, media por genero | ⏳ |

---

## 🗂️ Estrutura

```
vetores-java/
├── VetorNegativo/
│    └── src/
│         └── Main.java
├── VetorSimples/
│    └── src/
│         └── Main.java
├── VetorProduto/
│    └── src/
│         ├── Main.java
│         └── entidade/
│              └── Produto.java
├── VetorSoma/
│    └── src/
│         └── Main.java
├── Vetor_numeros_Pares/
│    └── src/
│         └── Main.java
├── Vetor_Maior_Posicao/
│    └── src/
│         ├── Main.java
│         └── entidade/
│              └── Numero.java
└── README.md
```

---

## 💡 Conceitos chave

**For tradicional vs For-each**
```java
// usar quando precisa do indice (preenchimento)
for (int i = 0; i < vetor.length; i++) {
    vetor[i] = sc.nextInt();
}

// usar quando so precisa do valor (leitura/filtro)
for (int num : vetor) {
    System.out.println(num);
}
```

**Vetor de primitivos vs vetor de objetos**
```java
// primitivo — posicoes ja prontas com valor padrao
int[] numeros = new int[5];

// objeto — cada posicao comeca null, precisa instanciar
Produto[] produtos = new Produto[5];
produtos[0] = new Produto("TV", 900.0);
```

**Achar o maior valor**
```java
Numero maior = vect[0]; // assume o primeiro como maior

for (Numero n : vect) {
    if (n.getValor() > maior.getValor()) {
        maior = n; // atualiza se achar um maior
    }
}
```

**Filtrar com contador**
```java
int contador = 0;
for (int num : vect) {
    if (num % 2 == 0) {   // verifica condicao
        System.out.print(num + " ");
        contador++;        // conta os que passaram
    }
}
```

---

## 👨‍💻 Autor

Feito por **Joneidson Victor** como parte da trilha de estudos Java — Vetores e Arrays.