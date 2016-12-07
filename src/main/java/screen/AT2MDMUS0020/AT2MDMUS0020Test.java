package screen.AT2MDMUS0020;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;

/**
 * Created by jmrios on 07/12/2016.
 */

/*      COPIADO DE AUTOTEST ANTIGUO

        Comentario de Álex en el 4.SIT de la AT2MDMUS0020:
        [SAIBSA] Alejandro Carrillo added a comment - 23/Jul/15 3:43 PM
        Autotest: este componente no tiene datos en la BBDD, comentado con Enrique Gomez y este a su vez con el equipo de Andres Llamas.
        Se tiene controlado la introducción de datos de este componente.
        Se nos pide que solo hagamos el testing de entrar y salir.*/

public class AT2MDMUS0020Test {
    protected AT2MDMUS0020Locators locators;
    protected AT2MDMUS0020Data data;

    public AT2MDMUS0020Test() {
    }
    public AT2MDMUS0020Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMUS0020Locators locators) {
        this.locators = locators;
    }
    public AT2MDMUS0020Data getData() {
        return data;
    }
    public void setData(AT2MDMUS0020Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("User");
        driver.getTestdetails().setScreen("ATLAS Monitoring");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        driver.getReport().addContent("", "br", "");
        driver.getReport().addContent("Data entry for this screen is controlled, therefore this is a log in / log out test.");
        driver.getReport().addContent("", "br", "");
        Functions.screenshot(driver);
        return false;

    }

}
