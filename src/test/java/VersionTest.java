import jdk.jfr.Name;
import org.classes.Version;
import org.junit.Assert;
import org.junit.Test;

import static org.classes.Version.checkIfArraysElementsIsNumeric;
import static org.classes.Version.equalizeArraysSize;

public class VersionTest {

    @Test
    @Name("Проверка создания объекта версии")
    public void testCheckVersionsConstructor() {
        new Version("1.2.1.1");
    }

    @Test
    @Name("Проверка сообщения об ошибке конструктора версии")
    public void testCheckConstructorErrorMassage() {
        boolean flag = true;
        try {
            Version version = new Version("1. f. 5. 9");
        } catch (NumberFormatException e) {
            flag = false;
        }finally {
            Assert.assertFalse(flag);
        }
    }

    @Test
    @Name("Проверка элементов массива на то что они число")
    public void testCheckIfArraysElementsIsNumeric() {
        String[] arrayWithElements = new String[]{"1", "12", "5", "9"};
        Assert.assertTrue(checkIfArraysElementsIsNumeric(arrayWithElements));
    }

    @Test
    @Name("Проверка элементов массива на то в них есть буквенные символы")
    public void testCheckIfArrayElementsHasLiteral() {
        String[] arrayWithElements = new String[]{"1", "12", "f", "9"};
        Assert.assertFalse(checkIfArraysElementsIsNumeric(arrayWithElements));
    }

    @Test
    @Name("Проверка элементов массива на то в них есть спецсимволы")
    public void testCheckIfArrayElementsHasSymbols() {
        String[] arrayWithElements = new String[]{"1", "12", "!", "9"};
        Assert.assertFalse(checkIfArraysElementsIsNumeric(arrayWithElements));
    }

    @Test
    @Name("Проверка на уравнивание размера ArrayList при длине первого массива, больше чем второго")
    public void testEqualizeArraysSizeFirstVersionBiggerThanSecond() {
        Version v1 = new Version("1.0.12.15.1.1.0.0.12");
        Version v2 = new Version("1.0.12.15");
        equalizeArraysSize(v1.getNumberArray(), v2.getNumberArray());
        Assert.assertTrue("",
                v1.getNumberArray().size() == v2.getNumberArray().size());
    }

    @Test
    @Name("Проверка на уравнивание размера ArrayList при длине второго массива, больше чем первого")
    public void testEqualizeArraysSizeSecondVersionBiggerThanFirst() {
        Version v1 = new Version("1.0.12.15");
        Version v2 = new Version("1.0.12.15.1.1.0.0.12");
        equalizeArraysSize(v1.getNumberArray(), v2.getNumberArray());
        Assert.assertTrue("",
                v1.getNumberArray().size() == v2.getNumberArray().size());
    }

    @Test
    @Name("Проверка на уравнивание размера ArrayList при одинаковой длине массивов")
    public void testEqualizeArraysSizeEqualse() {
        Version v1 = new Version("1.0.12.15");
        Version v2 = new Version("1.0.3.1");
        equalizeArraysSize(v1.getNumberArray(), v2.getNumberArray());
        Assert.assertTrue("",
                v1.getNumberArray().size() == v2.getNumberArray().size());
    }

}
