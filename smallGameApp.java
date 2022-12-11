import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

import static util.config.*;

public class smallGameApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(WINDOW_WIDTH);
        settings.setHeight(WINDOW_HEIGHT);
        settings.setTitle("SMALL game");
        settings.setVersion("420.69.0");
        settings.setMainMenuEnabled(true);
        
    }

    private void initBackground() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}