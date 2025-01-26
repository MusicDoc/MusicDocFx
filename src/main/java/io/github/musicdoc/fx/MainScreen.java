package io.github.musicdoc.fx;

import io.github.musicdoc.fx.menu.MenuFragment;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * The main screen of the application with the .
 */
public class MainScreen extends VBox {

  private final MenuFragment menu;

  private final ContentFragment content;

  /**
   * The constructor.
   */
  public MainScreen() {

    super();
    this.menu = new MenuFragment();
    getChildren().add(this.menu);
    this.content = new ContentFragment();
    VBox.setVgrow(this.content, Priority.ALWAYS);
    getChildren().add(this.content);
  }

  /**
   * @return the {@link MenuFragment} with the main menu.
   */
  public MenuFragment getMenu() {

    return this.menu;
  }

  /**
   * @return the {@link ContentFragment} as slot and placeholder for the content area.
   */
  public ContentFragment getContent() {

    return this.content;
  }

}
