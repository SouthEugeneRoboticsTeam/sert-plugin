package data;

import com.google.common.collect.ImmutableMap;
import edu.wpi.first.shuffleboard.api.data.ComplexData;

import java.util.Map;
import java.util.Objects;

public final class TextBoxData extends ComplexData<TextBoxData> {
    private final String text;
    private final String textColor;
    private final String backgroundColor;

    public TextBoxData(String text, String textColor, String backgroundColor) {
        this.text = text;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    public TextBoxData(Map<String, Object> map) {
        this(
            (String) map.getOrDefault("Text", ""),
            (String) map.getOrDefault("TextColor", "000000"),
            (String) map.getOrDefault("BackgroundColor", "ffffff00")
        );
    }

    @Override
    public Map<String, Object> asMap() {
        return ImmutableMap.of("Text", text, "TextColor", textColor, "BackgroundColor", backgroundColor);
    }

    public String getText() {
        return text;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String toString() {
        return String.format("TextBoxData(text=%s, textColor=%s, bgColor=%s)", text, textColor, backgroundColor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextBoxData that = (TextBoxData) obj;
        return text.equals(that.text) && textColor.equals(that.textColor) && backgroundColor.equals(that.backgroundColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text + textColor + backgroundColor);
    }

    @Override
    public String toHumanReadableString() {
        return text;
    }
}
