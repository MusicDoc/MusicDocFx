package io.github.musicdoc.fx.genre;

import io.github.musicdoc.genre.Genre;
import io.github.musicdoc.genre.Genres;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

/**
 * Editor for {@link Genre}.
 */
public class GenreTreeEditor extends VBox {

  private final Genres genres;

  private final ScrollPane scollPane;

  private final TreeView<Genre> tree;

  /**
   * The constructor.
   */
  public GenreTreeEditor(Genres genres) {

    super();
    this.genres = genres;
    Genre audio = this.genres.findByPk(Genre.PK_AUDIO);
    assert (audio != null);
    TreeItem<Genre> root = new TreeItem<>(audio);
    this.tree = new TreeView<>(root);
    this.scollPane = new ScrollPane(this.tree);
    this.scollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
    this.scollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
    getChildren().add(this.scollPane);
  }

}
