package org.cansezer.gui.factory;

import org.cansezer.gui.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
