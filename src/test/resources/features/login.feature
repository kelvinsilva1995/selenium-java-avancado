# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    @login-sucesso
    Cenário: Login com sucesso
      Dado que estou na tela de login
      Quando preencho login "eduardo.finotti@qazando.com" e senha "123456"
      E clico em Login
      Então vejo mensagem de login com sucesso

    @email-invalido
    Cenário: Campo e-mail inválido
      Dado que estou na tela de login
      Quando preencho login "emailinvalido" e senha "123456"
      E clico em Login
      Então vejo mensagem "E-mail inválido." de campo não preenchido

    @email-vazio
    Cenário: Campo e-mail vazio
      Dado que estou na tela de login
      Quando preencho login "" e senha "123456"
      E clico em Login
      Então vejo mensagem "E-mail inválido." de campo não preenchido

    @senha-invalida
    Cenário: Campo senha inválida
      Dado que estou na tela de login
      Quando preencho login "eduardo.finotti@qazando.com" e senha "000"
      E clico em Login
      Então vejo mensagem "Senha inválida." de campo não preenchido


    @senha-vazia
    Cenário: Campo senha vazia
      Dado que estou na tela de login
      Quando preencho login "eduardo.finotti@qazando.com" e senha ""
      E clico em Login
      Então vejo mensagem "Senha inválida." de campo não preenchido