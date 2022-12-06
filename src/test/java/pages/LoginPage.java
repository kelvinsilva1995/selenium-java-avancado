package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class LoginPage extends RunCucumber {

    // elementos
    private String URL = "http://automationpratice.com.br/";
    private By botaoAcessarLogin = By.cssSelector(".right_list_fix > li > a > .fa-user");
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoFazerLogin = By.id("btnLogin");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        String browser = System.getProperty("browser");
        getDriver(browser).get(URL);
    }

    public void acessarTelaLogin() {
        clickElement(botaoAcessarLogin);
    }

    public void preencheEmail(String email){
        fillField(campoEmail,email);
    }

    public void preencherSenha(String senha){
        fillField(campoSenha,senha);
    }

    public void clicarLogin(){
        clickElement(botaoFazerLogin);
    }

    public void verificaLoginSucesso(){
        waitElementBeVisible(By.id("swal2-title"), 10);
        String textoLoginSucesso = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Login realizado", textoLoginSucesso);
    }

    public void verificaCampoVazio(String message){
        String textError = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals(message, textError);
    }

    public void acessarTelaCadastro(){
        clickElement(botaoAcessarCadastro);
    }

}
