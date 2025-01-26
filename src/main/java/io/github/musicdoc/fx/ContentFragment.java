package io.github.musicdoc.fx;

import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * {@link ScreenFragment} acting as a placeholder (also called slot) for the main content in the UI screen layout. It
 * allows to show a single {@link ScreenFragment} via {@link #setContent(ScreenFragment)}.
 */
public class ContentFragment extends StackPane implements ScreenFragment {

  /**
   * The constructor.
   */
  public ContentFragment() {

    super();
    VBox.setVgrow(this, Priority.ALWAYS);
  }

  /**
   * @param child the {@link ScreenFragment} to show as the new content. Will remove the previous content.
   */
  public void setContent(ScreenFragment child) {

    getChildren().clear();
    if (child != null) {
      getChildren().add(child.asNode());
    }
  }

}
