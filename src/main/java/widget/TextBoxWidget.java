package widget;

import data.TextBoxData;
import edu.wpi.first.shuffleboard.api.widget.*;
import javafx.beans.binding.ObjectBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

@Description(name = "Text Box", dataTypes = TextBoxData.class)
@ParametrizedController("TextBoxWidget.fxml")
public class TextBoxWidget extends ComplexAnnotatedWidget<TextBoxData> {
    @FXML
    private Pane root;
    @FXML
    private Label textLabel;

    @FXML
    private void initialize() {
        root.backgroundProperty().bind(dataOrDefault.map(TextBoxData::getBackgroundColor).map(this::createSolidColorBackground));
        textLabel.textProperty().bind(dataOrDefault.map(TextBoxData::getText));
        textLabel.textFillProperty().bind(dataOrDefault.map(TextBoxData::getTextColor).map(this::createColor));

        textLabel.setFont(Font.font(null, 26.0));
    }

    private Color createColor(String color) {
        try {
            return Color.web(color);
        } catch (Exception e) {
            return Color.web("ffffff00");
        }
    }

    private Background createSolidColorBackground(String color) {
        return new Background(new BackgroundFill(createColor(color), null, null));
    }

    @Override
    public Pane getView() {
        return root;
    }
}
