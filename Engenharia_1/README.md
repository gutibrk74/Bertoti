 <h1 align = center >Resumos<h1>
  
# Atividade 1

## Texto 1 - Definindo Engenharia de Software
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

1. -> A engenharia de software envolve mais do que apenas escrever código. Ela inclui a criação de sistemas complexos e confiáveis, utilizando princípios de engenharia. Embora o termo "programação" tenha sido usado de forma intercambiável com "engenharia de software" ao longo do tempo, há uma diferença importante. A programação se concentra na criação de código, enquanto a engenharia de software abrange todo o processo de desenvolvimento de um sistema, desde o planejamento até a manutenção.

### Resumo:
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

2. -> A engenharia de software vai além da simples escrita de código. Ela envolve todos os processos e ferramentas utilizadas para construir e manter o código ao longo do tempo. A principal questão aqui é como garantir que o código seja valioso a longo prazo, sustentável e capaz de se adaptar às mudanças. Um ponto fundamental abordado no livro é a ideia de que a engenharia de software pode ser vista como "programação integrada ao longo do tempo". O código precisa ser sustentável, reagindo de forma eficaz às mudanças necessárias durante seu ciclo de vida, desde sua concepção até sua descontinuação.

### Três Princípios Fundamentais:
1. **Tempo e Mudança**: O código precisa ser adaptável ao longo do tempo.
2. **Escala e Crescimento**: A organização precisa evoluir à medida que o software cresce.
3. **Compensações e Custos**: A organização deve equilibrar decisões com base nos princípios de tempo, mudança, escala e crescimento.

### Resumo:
O texto destaca que a engenharia de software envolve mais do que escrever código, incluindo a manutenção e adaptação do código ao longo do tempo. O Google compartilha sua experiência para ajudar a tornar o código mais sustentável. Os três princípios principais são: adaptar o código às mudanças, crescer conforme a organização evolui e tomar decisões equilibrando custos e trade-offs.

---
# Atividade 3

## Trade-offs (Compensações)

Durante o desenvolvimento de software, os engenheiros precisam tomar decisões que envolvem trade-offs, isto é, escolher entre opções que trazem diferentes benefícios e desafios. Aqui estão alguns exemplos de trade-offs comuns:

### 1. Linguagem de Programação:
- **Exemplo**: Python é mais fácil de aprender e programar, mas Java oferece melhor desempenho.
  - **Trade-off**: Facilitar a aprendizagem pode comprometer a performance a longo prazo, enquanto optar por uma linguagem de alto desempenho pode ser mais difícil de aprender.

### 2. Segurança:
- **Exemplo**: Aplicar fortes medidas de segurança pode dificultar a experiência do usuário.
  - **Trade-off**: A segurança mais robusta reduz o risco de ataques, mas pode tornar o sistema menos acessível ou intuitivo para os usuários.

### 3. Custo vs Qualidade:
- **Exemplo**: Reduzir custos pode ser vantajoso no curto prazo.
  - **Trade-off**: No longo prazo, isso pode resultar em mais problemas técnicos, que terão um custo maior para corrigir.

---

## Conclusão

A engenharia de software é uma disciplina complexa e em evolução. A chave para garantir que o software seja sustentável e adaptável ao longo do tempo é a integração de práticas rigorosas e o equilíbrio entre as compensações que surgem no desenvolvimento de sistemas. O Google, com sua experiência em ambientes de grande escala, oferece uma valiosa perspectiva sobre como navegar essas questões. O importante é ter um sistema de ponto a ponto simples (sistema completo) de começo e não partes de um sistema e "juntar". 

---

## Resumo do Slide 57 do arquivo Engenharia de Software

![Image](https://github.com/user-attachments/assets/5ab9b1d3-e89d-4976-903f-67df7ae7a317)

# Uma boa explicação para a relação demonstrada na imagem é o MVP (Minimum Viable Product), ou em português, Produto Viável Mínimo, que serve para gerenciar um produto de forma que ele sempre atenda ao seu propósito principal, mesmo sendo a versão mais simples daquele produto.
Como o exemplo na imagem de um carro, que serve para se locomover, se visarmos apenas a construção de nosso produto (o carro) e não a resolução do problema principal de nossos clientes (se locomover), estaríamos perdendo clientes, já que levaríamos mais tempo construindo um veículo do que atualizando um já existente para que, ao final, cheguemos ao produto final. Dessa forma, é possível que nosso cliente já consiga resolver seu problema enquanto o produto ainda está em desenvolvimento.
