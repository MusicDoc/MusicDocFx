package io.github.musicdoc.fx.song.list;

import java.util.Comparator;
import java.util.List;

import io.github.mmm.event.EventBusAccess;
import io.github.musicdoc.fx.ScreenFragment;
import io.github.musicdoc.fx.song.SongSelectionEvent;
import io.github.musicdoc.song.Song;
import io.github.musicdoc.song.SongModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * {@link ScreenFragment} that displays the list of {@link Song}s.
 */
public class SongListFragment extends VBox implements ScreenFragment {

  private final TextField searchField;

  private final SongList songList;

  private Comparator<Song> comparator;

  private SongModel songModel;

  /**
   * The constructor.
   */
  public SongListFragment() {

    super();
    this.searchField = new TextField();
    this.searchField.setPromptText("Search for");
    this.searchField.getStyleClass().add("search");
    this.searchField.setOnKeyTyped(this::onSongFilter);
    HBox.setHgrow(this.searchField, Priority.ALWAYS);
    getChildren().add(this.searchField);
    this.songList = new SongList();
    getChildren().add(this.songList);
    this.comparator = SongModel.SORT_BY_TITLE;
    VBox.setVgrow(this, Priority.ALWAYS);
    this.songList.setOnMouseClicked(this::onSelectSong);
  }

  public void setSongModel(SongModel model) {

    this.songModel = model;

    List<Song> songs = this.songModel.getSongs(null, this.comparator);
    ObservableList<Song> items = FXCollections.observableList(songs);
    this.songList.setItems(items);
  }

  private void onSelectSong(MouseEvent e) {

    if (e.getButton() != MouseButton.PRIMARY) {
      return;
    }
    Song song = this.songList.getSelectionModel().getSelectedItem();
    EventBusAccess.get().sendEvent(new SongSelectionEvent(song));
  }

  private void onSongFilter(KeyEvent e) {

    String text = this.searchField.getText();
  }

}
