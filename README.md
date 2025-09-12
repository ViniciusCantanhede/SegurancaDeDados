# Segurança de Dados - Implementações Semanais

Este repositório é dedicado às implementações práticas e aos estudos realizados para a disciplina de Segurança de Dados. O objetivo é aplicar os conceitos teóricos de criptografia e segurança em algoritmos funcionais, acompanhando o progresso semanal do curso.

---

## 🚀 Estrutura do Projeto

O projeto está organizado em pacotes, onde cada um representa uma semana de aula com um tópico específico. Toda a codificação-fonte se encontra no diretório `src/`.

* **`src/`**: Pasta raiz que contém todos os pacotes e códigos-fonte.
    * **`Semana02_CriptografiaXOR`**: Estudo sobre a cifra de XOR e quebra de criptogramas com reutilização de chave (One-Time Pad).
    * **`Semana03_QuebraVigenere`**: Implementação e análise de frequência para a quebra da Cifra de Vigenère.
    * **`Semana04_LFSR`**: Implementação de um Gerador de Números Pseudoaleatórios usando Registrador de Deslocamento com Retroalimentação Linear (LFSR).
    * **`Semana05_CribDragging`**: Estudo da técnica de *Crib Dragging* para ataque a cifras com reutilização de chaves.
    * **`Semana06_QuebraOTP`**: Arquivo principal para a quebra da cifra de One-Time Pad.
    * **`Semana07_DES_AES`**: Implementações dos algoritmos de criptografia simétrica DES (Data Encryption Standard) e AES (Advanced Encryption Standard).
    * **`Semana08_SHA256`**: Implementação da função de hash SHA-256 e uma interface gráfica simples para visualização.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem**: Java
* **SDK**: OpenJDK 17 (ou superior)
* **IDE**: IntelliJ IDEA

---

## ⚙️ Como Compilar e Executar

É necessário ter um JDK (Java Development Kit) instalado e configurado nas variáveis de ambiente do sistema.

1.  Abra um terminal ou prompt de comando.
2.  Navegue até a pasta `src` do projeto.
3.  Para compilar um arquivo, use o comando `javac`:

    ```bash
    # Exemplo compilando o arquivo da Semana 04
    javac Semana04_LFSR/LinearFeedbackShiftRegister.java
    ```

4.  Para executar o arquivo compilado, use o comando `java` com o nome completo do pacote:

    ```bash
    # Exemplo executando o arquivo da Semana 04
    java Semana04_LFSR.LinearFeedbackShiftRegister
    ```

---

## 👨‍💻 Autor

* **Vinicius Cantanhede**
* **GitHub**: [ViniciusCantanhede](https://github.com/ViniciusCantanhede)