package co.com.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

import java.awt.font.TextAttribute;

public class UserInterfacesClass {
    private UserInterfacesClass(){

    }
    public static final Target BTNAMOR= Target.the("Elemento para seleccionar la categoria amor").locatedBy("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[2]/a[1]");
    public static final Target BTNFIRSTPRODUCT = Target.the("Elemento de categoria amor").locatedBy("//figure/a/img[@src=\"https://www.floristeriamundoflor.com/wp-content/uploads/2019/02/IMG_1459-427x546.jpg\"]");
    public static final Target IMGFIRSTPRODUC= Target.the("Imagen de primer producto").locatedBy("//a[@href=\"https://www.floristeriamundoflor.com/wp-content/uploads/2019/02/IMG_1459.jpg\"]");
    public static final Target LBLNAMEPRODUCT= Target.the("Nombre del primer producto").locatedBy("//div/h1[contains(text(),'MDF 0001')]");
    public static final Target LBLCANTIDAD= Target.the("Cantidad a agregar de producto").locatedBy("//div/input[@class=\"input-text qty text\"]");
    public static final Target BTNADDTOCART= Target.the("Agregar al carrito de compras").locatedBy("//form/button[@name=\"add-to-cart\"]");
    public static final Target LBLAMOUNT= Target.the("Elemento de cantidad de valor").locatedBy("/html[1]/body[1]/div[2]/div[6]/section[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/span[1]/bdi[1]");
    public static final Target BTNCUMPLEANOS= Target.the("Botón de cumpleaños").locatedBy("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[3]/a[1]");
    public static final Target BTNPRODUCCUMPLEANOS= Target.the("Producto de cumpleaños").locatedBy("//figure/a[@href=\"https://www.floristeriamundoflor.com/product/mdf-00012/\"]");
    public static final Target IMGSECONDPRODUCT= Target.the("Imagen de producto de cumpleaños").locatedBy("//a[@href=\"https://www.floristeriamundoflor.com/wp-content/uploads/2019/02/IMG_1431.jpg\"]");
    public static final Target LBLNAMEPRODUCTCUMPLEANOS= Target.the("Nombre del producto cumpleaños").locatedBy("//div/h1[contains(text(),'MDF 00012')]");
    public static final Target LBLAMOUNTSECONDPRODUCT= Target.the("Valor de segundo producto, cumpleaños").locatedBy("/html[1]/body[1]/div[2]/div[6]/section[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]/bdi[1]");
    public static final Target LBLNOMBRECANTIDAD= Target.the("Elemento para hacer scroll en los productos").locatedBy("//div[contains(text(),'“MDF 00012” se ha añadido a tu carrito.')]");
    public static final Target BTNDELETEPRODUCT= Target.the("Botón de eliminar producto").locatedBy("/html[1]/body[1]/div[2]/div[6]/section[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]/i[1]");
}
