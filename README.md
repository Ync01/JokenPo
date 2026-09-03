JoKenPo

Aplicativo Android de JoKenPo (Pedra, Papel e Tesoura), desenvolvido em Kotlin como projeto de estudo para praticar conceitos de desenvolvimento mobile.

Sobre o projeto

O aplicativo permite que o usuário escolha entre Pedra, Papel ou Tesoura. Após a escolha, o computador realiza uma jogada aleatória e o aplicativo informa o resultado da partida.

O projeto foi desenvolvido com foco na prática de conceitos fundamentais do desenvolvimento Android e da linguagem Kotlin.

Funcionalidades
Escolha entre Pedra, Papel e Tesoura
Jogada aleatória do computador
Exibição da escolha do computador
Identificação do resultado da partida
Interface simples e intuitiva
Tecnologias
Kotlin
Android
Android SDK
XML
Gradle
Estrutura
JokenPo/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── br/gov/sp/etec/jokenpo/
│           │       └── MainActivity.kt
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   ├── mipmap/
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts

Como executar
Pré-requisitos
Android Studio
Android SDK
JDK compatível com o projeto
Instalação

Clone o repositório:

git clone https://github.com/Ync01/JokenPo.git


Entre no diretório do projeto:

cd JokenPo


Abra o projeto no Android Studio, aguarde a sincronização do Gradle e execute o aplicativo em um emulador ou dispositivo Android.

Regras do jogo
Jogada do jogador	Jogada do computador	Resultado
Pedra	Tesoura	Vitória
Tesoura	Papel	Vitória
Papel	Pedra	Vitória
Pedra	Pedra	Empate
Papel	Papel	Empate
Tesoura	Tesoura	Empate
Pedra	Papel	Derrota
Papel	Tesoura	Derrota
Tesoura	Pedra	Derrota
Objetivo

O objetivo do projeto é praticar:

Desenvolvimento de interfaces Android
Programação em Kotlin
Manipulação de eventos de clique
Uso de valores aleatórios
Estruturas condicionais
Organização de um projeto Android
Melhorias futuras
Sistema de pontuação
Contador de vitórias e derrotas
Histórico de partidas
Animações
Efeitos sonoros
Modo melhor de três
Melhorias na interface
Testes automatizados
Autor

Ync01

Repositório

O código-fonte está disponível no GitHub:

https://github.com/Ync01/JokenPo
