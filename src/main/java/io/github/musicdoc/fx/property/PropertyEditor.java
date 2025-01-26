package io.github.musicdoc.fx.property;

import io.github.mmm.property.WritableProperty;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Abstract base class for a UI component that allows to view and edit the value of a single {@link WritableProperty
 * property}.
 *
 * @param <V> type of the {@link WritableProperty#get() property value} to edit.
 * @param <W> type of the JavaFx widget used to edit the value.
 * @param <P> type of the {@link WritableProperty} containing the value.
 */
public abstract class PropertyEditor<V, W extends Node, P extends WritableProperty<V>> extends VBox {

  private final Label label;

  private final W widget;

  /**
   * The constructor.
   */
  public PropertyEditor(P property, W widget) {

    super();
    getStyleClass().add("editor");
    this.label = new Label();
    // TODO nls
    String text = property.getName();
    this.label.setText(text);
    if (property.isMandatory()) {
      this.label.getStyleClass().add("mandatory");
    }
    this.widget = widget;
  }
}
