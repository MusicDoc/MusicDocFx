package io.github.musicdoc.fx.song.edit;

import java.util.HashMap;
import java.util.Map;

import io.github.mmm.property.WritableProperty;
import io.github.mmm.property.string.StringProperty;
import io.github.musicdoc.fx.property.PropertyEditor;
import io.github.musicdoc.fx.property.StringPropertyEditor;
import io.github.musicdoc.song.Song;
import javafx.scene.layout.VBox;

/**
 * TODO hohwille This type ...
 *
 */
public class SongEditFragment extends VBox {

  private final Map<String, PropertyEditor<?, ?, ?>> propertyMap;

  /**
   * The constructor.
   */
  public SongEditFragment() {

    super();
    this.propertyMap = new HashMap<>();
    Song template = Song.of();
    addString(template.Title());
    // addString(template.Album());
    addString(template.Origin());
    addString(template.Copyright());
    // addString(template.capo);
    addString(template.Tags());
  }

  private void addString(StringProperty property) {

    StringPropertyEditor editor = new StringPropertyEditor(property);
    add(property, editor);
  }

  private <V, P extends WritableProperty<V>> void add(P property, PropertyEditor<V, ?, P> editor) {

    String name = property.getName();
    PropertyEditor<?, ?, ?> duplicate = this.propertyMap.put(name, editor);
    if (duplicate != null) {
      throw new IllegalStateException("Duplicate property " + name);
    }
    getChildren().add(editor);
  }

}
