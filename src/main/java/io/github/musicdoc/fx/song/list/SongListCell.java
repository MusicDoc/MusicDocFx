package io.github.musicdoc.fx.song.list;

import io.github.musicdoc.song.Song;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;

/**
 * A {@link ListCell} of the {@link SongList}.
 */
public class SongListCell extends ListCell<Song> {

  private VBox vbox;

  private Label title;

  private Label artist;

  @Override
  public void updateItem(Song song, boolean empty) {

    super.updateItem(song, empty);
    if (song != null) {
      if (this.vbox == null) {
        this.vbox = new VBox();
        this.title = new Label();
        this.artist = new Label();
        // TODO extract Css
        this.title.setStyle("-fx-font-size: 2em;");
        this.artist.setStyle("-fx-font-size: 1em;");
        this.vbox.getChildren().add(this.title);
        this.vbox.getChildren().add(this.artist);
      }
      this.title.setText(song.Title().get());
      this.artist.setText(song.Artist().get().getTarget().Title().get());
      setGraphic(this.vbox);
    }
  }
}
