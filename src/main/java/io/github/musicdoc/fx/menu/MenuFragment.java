package io.github.musicdoc.fx.menu;

import io.github.mmm.event.EventBusAccess;
import io.github.musicdoc.fx.ScreenFragment;
import io.github.musicdoc.fx.song.list.SongSearchEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * {@link ScreenFragment} for the menu-bar.
 */
public class MenuFragment extends HBox implements ScreenFragment {

  private final Button searchButton;

  private final Button addButton;

  private final Button editButton;

  private final Button deleteButton;

  /**
   * The constructor.
   */
  public MenuFragment() {

    super();
    this.searchButton = new Button();
    this.searchButton.getStyleClass().add("search");
    this.searchButton.setOnMouseClicked(this::onSearch);
    getChildren().add(this.searchButton);
    this.addButton = new Button();
    this.addButton.getStyleClass().add("add");
    getChildren().add(this.addButton);
    this.editButton = new Button();
    this.editButton.getStyleClass().add("edit");
    getChildren().add(this.editButton);
    this.deleteButton = new Button();
    this.deleteButton.getStyleClass().add("delete");
    getChildren().add(this.deleteButton);

  }

  private void onSearch(MouseEvent e) {

    EventBusAccess.get().sendEvent(new SongSearchEvent());
  }

}
