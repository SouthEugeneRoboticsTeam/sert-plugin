import com.google.common.collect.ImmutableList;
import data.type.TextBoxType;
import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import widget.TextBoxWidget;

import java.util.List;
import java.util.Map;

@Description(
        group = "org.sert2521",
        name = "SERTPlugin",
        version = "2019.1.2",
        summary = "A plugin that adds various dashboard functionality"
)
public final class SERTPlugin extends Plugin {
    @Override
    public List<DataType> getDataTypes() {
        return ImmutableList.of(TextBoxType.Instance);
    }

    @Override
    public List<ComponentType> getComponents() {
        return ImmutableList.of(WidgetType.forAnnotatedWidget(TextBoxWidget.class));
    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return Map.of(TextBoxType.Instance, WidgetType.forAnnotatedWidget(TextBoxWidget.class));
    }
}
