 <h1 align = center >Resumos<h1>
  
# Atividade 1

## Texto 1 - Definindo Engenharia de Software
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

1. -> O texto aborda as distinções entre os termos "programação", "ciência da computação" e "engenharia de software", destacando que, embora muitas vezes usados como sinônimos, cada um possui um escopo específico. Programação está relacionada à escrita de código, enquanto ciência da computação foca nos fundamentos teóricos que sustentam a área. Já a engenharia de software envolve uma abordagem mais ampla e estruturada, voltada para o desenvolvimento de sistemas complexos e confiáveis com base em princípios de engenharia. O texto também enfatiza que, apesar de a engenharia de software ainda não ser tão rigorosa quanto outras engenharias tradicionais, como a aeronáutica ou civil, a crescente dependência de sistemas digitais exige práticas mais robustas e responsáveis.

### Legenda:
- **Programação**: Foco em escrever código.
- **Engenharia de Software**: Criação de sistemas robustos e sustentáveis com base em princípios de engenharia.
- **Ciência da Computação**: Fundamentos teóricos que sustentam a programação e a engenharia de software.

---
# Atividade 2

## Texto 2 - Programação ao Longo do Tempo
Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth.

2. -> A engenharia de software abrange muito mais do que apenas escrever código: ela envolve o conjunto de práticas, ferramentas e processos usados para criar, manter e evoluir sistemas ao longo do tempo. Um dos principais desafios é garantir que o código continue relevante, sustentável e adaptável diante de mudanças constantes. A experiência do Google sugere que a engenharia de software pode ser entendida como “programação integrada ao longo do tempo”, destacando a importância de práticas que assegurem a capacidade do código de evoluir durante todo seu ciclo de vida — da concepção à manutenção e eventual descontinuação.

### Três Princípios Fundamentais:
1. **Tempo e Mudança**: Que trata da necessidade de adaptar o código à medida que ele envelhece;
2. **Escala e Crescimento**: Que aborda como a organização deve evoluir junto com o sistema;
3. **Compensações e Custos**: Que envolve a tomada de decisões equilibradas com base nas consequências e exigências das mudanças e do crescimento.

---
# Atividade 3

## Trade-offs (Compensações)

Durante o desenvolvimento de software, os engenheiros precisam tomar decisões que envolvem trade-offs, isto é, escolher entre opções que trazem diferentes benefícios e desafios. Aqui estão alguns exemplos de trade-offs comuns:

### 1. Linguagem de Programação:
- **Exemplo**: Usar Python facilita o desenvolvimento e o aprendizado, mas pode comprometer o desempenho em aplicações mais exigentes.
  - **Trade-off**: Facilidade de uso vs. performance

### 2. Segurança:
- **Exemplo**: Reforçar a segurança do sistema protege contra ataques, mas pode tornar a navegação e a usabilidade mais difíceis para o usuário final.
  - **Trade-off**: Proteção do sistema vs. experiência do usuário.

### 3. Custo vs Qualidade:
- **Exemplo**: Economizar no desenvolvimento pode reduzir despesas no início, mas aumenta o risco de falhas técnicas no futuro.
  - **Trade-off**: Investimento inicial menor vs. manutenção e qualidade a longo prazo.

---

## Conclusão

A engenharia de software é uma área dinâmica que exige muito mais do que domínio técnico: ela demanda escolhas estratégicas. Durante o ciclo de vida de um sistema, os engenheiros constantemente enfrentam decisões difíceis, nas quais não é possível obter todos os benefícios ao mesmo tempo — surgem, então, os trade-offs. Saber identificar, avaliar e equilibrar essas compensações é essencial para garantir que o software seja sustentável, seguro, eficiente e adaptável no longo prazo. Com base na experiência de organizações como o Google, percebemos que boas decisões começam desde a concepção do sistema como um todo, e não apenas com partes isoladas que são conectadas depois. Um sistema bem planejado desde o início é mais fácil de manter e evoluir.

---

## Resumo do Slide 57 do arquivo Engenharia de Software

![Image](https://github.com/user-attachments/assets/5ab9b1d3-e89d-4976-903f-67df7ae7a317)

# Uma boa explicação para a relação demonstrada na imagem é o MVP (Minimum Viable Product), ou em português, Produto Viável Mínimo, que serve para gerenciar um produto de forma que ele sempre atenda ao seu propósito principal, mesmo sendo a versão mais simples daquele produto.
Como o exemplo na imagem de um carro, que serve para se locomover, se visarmos apenas a construção de nosso produto (o carro) e não a resolução do problema principal de nossos clientes (se locomover), estaríamos perdendo clientes, já que levaríamos mais tempo construindo um veículo do que atualizando um já existente para que, ao final, cheguemos ao produto final. Dessa forma, é possível que nosso cliente já consiga resolver seu problema enquanto o produto ainda está em desenvolvimento.

---

# Atividade do Codigo

## Codigo da Main.java
```Java
package at_bertoti;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto p1 = new Produto("T-72 Ural", 1010123);
        Produto p2 = new Produto("43M Turan III", 12345678);

        estoque.addProduto(p1);
        estoque.addProduto(p2);

        System.out.println("Produtos no estoque:");
        for (Produto p : estoque.getProdutos()) {
            System.out.println("Nome: " + p.getNome() + " | Código: " + p.getCodigo());
        }

        int codigoBuscado = 12345678;
        Produto encontrado = estoque.buscarProdutoCodigo(codigoBuscado);
        if (encontrado != null) {
            System.out.println("\nProduto encontrado com código " + codigoBuscado + ": " + encontrado.getNome());
        } else {
            System.out.println("\nProduto com código " + codigoBuscado + " não encontrado.");
        }
    }
}
```

## Codigo da Teste.java
```Java
package at_bertoti;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Teste {
    
    @Test
    public void teste() {
        Estoque estoque = new Estoque();
        estoque.addProduto(new Produto("T-72 Урал", 1010123));
        estoque.addProduto(new Produto("43M Turan III", 12345678));

        assertEquals(2, estoque.getProdutos().size());

        Produto produto = estoque.buscarProdutoCodigo(12345678);
        assertEquals("43M Turan III", produto.getNome());
    }
}
```

## Codigo da Produto.java
```Java
package at_bertoti;

public class Produto {
    private String nome;
    private int codigo;

    public Produto(String nome, int codigo) {
	this.nome = nome;
	this.codigo = codigo;
    }

    public String getNome() {
	return nome;
    }
    public void setNome(String nome) {
	this.nome = nome;
    }
    public int getCodigo() {
	return codigo;
    }
    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }
}
```

## Codigo da Estoque.java
```Java
package at_bertoti;

import java.util.List; import java.util.LinkedList;

public class Estoque {
    private List<Produto> produtos = new LinkedList<Produto>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProdutoCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> buscarProdutoNome(String nome) {
        List<Produto> encontrados = new LinkedList<Produto>();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(produto);
            }
        }
        return encontrados;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
```
