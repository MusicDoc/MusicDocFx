package io.github.musicdoc.fx.song.view;

import io.github.musicdoc.fx.ScreenFragment;
import io.github.musicdoc.song.Song;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * {@link ScreenFragment} to view a single {@link Song}.
 */
public class SongViewFragment extends VBox implements ScreenFragment {

  private final Label label;

  /**
   * The constructor.
   */
  public SongViewFragment() {

    super();
    this.label = new Label();
    getChildren().add(this.label);
  }

  /**
   * @param song the selected {@link Song}.
   */
  public void setSong(Song song) {

    this.label.setText(song.Title().get());
  }

}
