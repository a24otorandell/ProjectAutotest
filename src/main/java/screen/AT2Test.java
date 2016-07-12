package screen;


import core.TestDriver.TestDriver;

import java.util.Map;

/**
 * @author otorandell on 12/01/2016.
 */
public interface AT2Test {

    boolean start(TestDriver driver);

    Map<String, String> getData();
}
