package data.type;

import data.TextBoxData;
import edu.wpi.first.shuffleboard.api.data.ComplexDataType;

import java.util.Map;
import java.util.function.Function;

public final class TextBoxType extends ComplexDataType<TextBoxData> {
    public static final TextBoxType Instance = new TextBoxType();

    private TextBoxType() {
        super("TextBox", TextBoxData.class);
    }

    @Override
    public Function<Map<String, Object>, TextBoxData> fromMap() {
        return TextBoxData::new;
    }

    @Override
    public TextBoxData getDefaultValue() {
        return new TextBoxData("", "000000", "ffffff00");
    }
}

