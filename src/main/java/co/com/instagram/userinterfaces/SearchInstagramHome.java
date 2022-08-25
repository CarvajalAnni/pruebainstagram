package co.com.instagram.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchInstagramHome {

    public static final Target TXT_SEARCH = Target.the("campo de texto para búsqueda").located(By.xpath("//input[@class='_aauy']"));
    public static final Target BTN_CAMISA = Target.the("boón para selecionar publicación de camisa").located(By.xpath("//div[2][@role='none']/a"));
    public static final Target BTN_PUBLICATION = Target.the("boón para selecionar publicación de camisa").located(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/section/main/article/div/div/div/div/div[2]/a"));
}
