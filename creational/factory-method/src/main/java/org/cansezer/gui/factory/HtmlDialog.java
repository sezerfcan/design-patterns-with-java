package org.cansezer.gui.factory;

import org.cansezer.gui.buttons.Button;
import org.cansezer.gui.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
