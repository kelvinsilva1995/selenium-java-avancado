# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    Contexto: Acessar tela de login
       Dado que estou na tela de login

    @login-sucesso
    Cenário: Login com sucesso
      Quando preencho login "eduardo.finotti@qazando.com" e senha "123456"
      E clico em Login
      Então vejo mensagem de login com sucesso

    @email-invalido
    Cenário: Campo e-mail inválido
      Quando preencho login "emailinvalido" e senha "123456"
      E clico em Login
      Então vejo mensagem "E-mail inválido." de campo não preenchido

    @email-vazio
    Cenário: Campo e-mail vazio
      Quando preencho login "" e senha "123456"
      E clico em Login
      Então vejo mensagem "E-mail inválido." de campo não preenchido

    @senha-invalida
    Cenário: Campo senha inválida
      Quando preencho login "eduardo.finotti@qazando.com" e senha "000"
      E clico em Login
      Então vejo mensagem "Senha inválida." de campo não preenchido


    @senha-vazia
    Cenário: Campo senha vazia
      Quando preencho login "eduardo.finotti@qazando.com" e senha ""
      E clico em Login
      Então vejo mensagem "Senha inválida." de campo não preenchido