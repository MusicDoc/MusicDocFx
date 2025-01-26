package io.github.musicdoc.fx.song;

import io.github.musicdoc.song.Song;

/**
 * Event notifying that a {@link Song} has been selected.
 */
public class SongSelectionEvent {

  private final Song song;

  /**
   * The constructor.
   *
   * @param song the {@link #getSong() song}.
   */
  public SongSelectionEvent(Song song) {

    super();
    this.song = song;
  }

  /**
   * @return the selected {@link Song}.
   */
  public Song getSong() {

    return this.song;
  }

}
