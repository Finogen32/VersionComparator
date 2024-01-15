import jdk.jfr.Name;
import org.classes.Version;
import org.junit.Assert;
import org.junit.Test;

import static org.classes.CompareVersion.compareVersion;

public class ComparatorTest {
    Version v1 = new Version("10.0.12.1.3.13");
    Version v2 = new Version("10.0.13");
    Version v3 = new Version("10.0.13");

    @Test
    @Name("Проверка сравнения версий")
    public void checkComparatorVersion(){
        Assert.assertFalse(
                compareVersion(v1.getNumberArray(),v2.getNumberArray(), ">"));
        Assert.assertFalse(
                compareVersion(v1.getNumberArray(),v2.getNumberArray(), ">="));
        Assert.assertTrue(
                compareVersion(v1.getNumberArray(),v2.getNumberArray(), "<"));
        Assert.assertTrue(
                compareVersion(v1.getNumberArray(),v2.getNumberArray(), "<="));
        Assert.assertTrue(
                compareVersion(v2.getNumberArray(),v3.getNumberArray(), "="));
    }

}
