package org.apache.dubbo.common.extension;

import org.apache.dubbo.common.extension.support.PrintService;
import org.junit.jupiter.api.Test;

public class ExtentionTest {

    @Test
    public void testPrintInfo() {
        PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class).getDefaultExtension();
        printService.printInfo();
    }

}
