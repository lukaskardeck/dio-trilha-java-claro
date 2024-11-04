``` mermaid
    
---
title: iPhone 2007
---
classDiagram
    class Smartphone {
        +String tamanhoTela
        +String cor

        +ligarAparelho() void
        +desligarAparelho() void
        +aumentarVolume() void
        +diminuirVolume() void
    }

    class iPhone {
        +boolean suporteMultitouch
        +boolean sincroniaITunes
        +String appleID
        +String versaoIOS
    }

    class ReprodutorMusical {
        <<Interface>>
        +tocarMusica() void
        +pausarMusica() void
        +selecionarMusica(String tituloMusica) Musica
    }

    class AparelhoTelefonico {
        <<Interface>>
        +inicarLigacao(String numero) void
        +atenderLigacao() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<Interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class Musica {
        +String titulo
        +String autor
        +String duracao

    }

    iPhone ..> ReprodutorMusical
    iPhone ..> AparelhoTelefonico
    iPhone ..> NavegadorInternet
    
    Smartphone <|-- iPhone

    Musica o-- ReprodutorMusical

```