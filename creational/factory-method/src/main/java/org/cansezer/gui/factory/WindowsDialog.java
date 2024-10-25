package org.cansezer.gui.factory;

import org.cansezer.gui.buttons.Button;
import org.cansezer.gui.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
