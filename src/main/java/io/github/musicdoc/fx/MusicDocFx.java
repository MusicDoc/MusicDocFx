package io.github.musicdoc.fx;

import io.github.mmm.event.EventBus;
import io.github.mmm.event.EventBusAccess;
import io.github.musicdoc.fx.menu.MenuFragment;
import io.github.musicdoc.fx.song.SongLoader;
import io.github.musicdoc.fx.song.SongSelectionEvent;
import io.github.musicdoc.fx.song.list.SongListFragment;
import io.github.musicdoc.fx.song.view.SongViewFragment;
import io.github.musicdoc.song.SongModel;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * JavaFx {@link Application} for MusicDoc as desktop application.
 */
public class MusicDocFx extends Application {

  private SongModel model;

  private MenuFragment menu;

  private SongListFragment songList;

  private SongViewFragment songView;

  private ContentFragment content;

  public static void main(String[] args) {

    Application.launch(MusicDocFx.class, args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();
    primaryStage.setWidth(bounds.getWidth());
    primaryStage.setHeight(bounds.getHeight());
    primaryStage.setTitle("MusicDocFx");
    VBox root = new VBox();
    this.menu = new MenuFragment();
    root.getChildren().add(this.menu);
    this.content = new ContentFragment();
    root.getChildren().add(this.content);
    this.songList = new SongListFragment();
    this.model = new SongLoader().load();
    this.songList.setSongModel(this.model);
    this.content.setContent(this.songList);
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
    EventBus eventBus = EventBusAccess.get();
    eventBus.addListener(SongSelectionEvent.class, this::onSongSelection);
  }

  private void onSongSelection(SongSelectionEvent e) {

    if (this.songView == null) {
      this.songView = new SongViewFragment();
    }
    this.songView.setSong(e.getSong());
    this.content.setContent(this.songView);
  }
}
