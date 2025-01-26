package io.github.musicdoc.fx.song.list;

import io.github.musicdoc.song.Song;
import javafx.scene.control.ListView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * {@link ListView} to display the songs.
 */
public class SongList extends ListView<Song> {

  /**
   * The constructor.
   */
  public SongList() {

    super();
    VBox.setVgrow(this, Priority.ALWAYS);
    setCellFactory(this::newCell);
  }

  private SongListCell newCell(ListView<Song> list) {

    return new SongListCell();
  }

}
