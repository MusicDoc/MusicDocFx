package io.github.musicdoc.fx.property;

import io.github.mmm.property.string.StringProperty;
import javafx.scene.control.TextField;

/**
 * TODO hohwille This type ...
 *
 */
public class StringPropertyEditor extends PropertyEditor<String, TextField, StringProperty> {

  /**
   * The constructor.
   *
   * @param property
   */
  public StringPropertyEditor(StringProperty property) {

    super(property, new TextField());
  }

}
