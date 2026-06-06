# 📦 Vetores Java

Exercícios de fixação sobre vetores e arrays em Java.  
Parte da trilha de estudos de **POO com Java**.

---

## 🧠 O que estou praticando

```
Vetores (arrays)
├── Declaração e instanciação
├── Preenchimento com for
├── for tradicional vs for-each
├── Vetores de primitivos (int, double)
├── Vetores de objetos (Product, Pessoa...)
└── Filtros, somas, médias e comparações
```

---

## 📋 Exercícios

| # | Problema | Conceito principal |
|---|---|---|
| 01 | negativos | filtro com `if` + for-each |
| 02 | soma_vetor | soma e média |
| 03 | numeros_pares | filtro de pares |
| 04 | maior_posicao | achar maior valor e índice |
| 05 | soma_vetores | dois vetores → terceiro |
| 06 | abaixo_da_media | comparar com média |
| 07 | media_pares | média condicional |
| 08 | mais_velho | dois vetores paralelos |
| 09 | aprovados | três vetores paralelos |
| 10 | alturas | múltiplos dados por pessoa |
| 11 | dados_pessoas | maior, menor, média por gênero |

---

## 🗂️ Estrutura

```
vetores-java/
├── VetorSimples/
│    └── src/
│         └── Main.java
├── VetorProduto/
│    └── src/
│         ├── Main.java
│         └── entidade/
│              └── Produto.java
└── README.md
```

---

## 💡 Conceitos chave

**For tradicional vs For-each**
```java
// usar quando precisa do índice
for (int i = 0; i < vetor.length; i++) {
    vetor[i] = sc.nextInt();
}

// usar quando só precisa do valor
for (int num : vetor) {
    System.out.println(num);
}
```

**Vetor de primitivos vs vetor de objetos**
```java
// primitivo — posições já prontas
int[] numeros = new int[5];

// objeto — cada posição começa null
Produto[] produtos = new Produto[5];
produtos[0] = new Produto("TV", 900.0); // precisa instanciar
```

---

## 👨‍💻 Autor

Feito por **Joneidson Victor** como parte da trilha de estudos Java — Vetores e Arrays.