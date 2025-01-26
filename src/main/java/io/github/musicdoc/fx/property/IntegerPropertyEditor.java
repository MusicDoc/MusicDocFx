package io.github.musicdoc.fx.property;

import io.github.mmm.property.number.integers.IntegerProperty;
import javafx.scene.control.TextField;

/**
 * TODO hohwille This type ...
 *
 */
public class IntegerPropertyEditor extends PropertyEditor<Integer, TextField, IntegerProperty> {

  /**
   * The constructor.
   *
   * @param property the {@link IntegerProperty} to edit.
   */
  public IntegerPropertyEditor(IntegerProperty property) {

    super(property, new TextField());
  }

}
