package co.com.instagram.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InstagramHome {

    public static final Target USERNAME = Target.the("campo de usuario").located(By.xpath("//*[@name=\"username\"]"));
    public static final Target PASSWORD = Target.the("camo de password").located(By.xpath("//*[@name=\"password\"]"));
    public static final Target BTN_GETIN = Target.the("boton de entrada").located(By.xpath("//*[@name=\"password\"]"));
}
