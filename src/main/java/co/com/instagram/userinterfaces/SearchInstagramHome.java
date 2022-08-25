package co.com.instagram.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchInstagramHome {

    public static final Target TXT_SEARCH = Target.the("campo de texto para búsqueda").located(By.xpath("//input[@class='_aauy']"));
    public static final Target BTN_PUBLICATION = Target.the("boón para selecionar publicación de camisa").located(By.xpath("//div[2][@role='none']"));
}
