package io.github.musicdoc.fx;

import javafx.scene.Node;

/**
 * Abstract base class for a dialog fragment. It is a part of the UI screen responsible for a dedicated purpose. The
 * entire UI screen shows various fragments together as a composition. E.g. the menu-bar or the list of songs are
 * implemented as individual {@link ScreenFragment}s. When the user navigates and interacts a {@link ScreenFragment} may
 * become invisible and be replaced by another {@link ScreenFragment} that then is shown instead.
 */
public interface ScreenFragment {

  /**
   * @return this {@link ScreenFragment} as JavaFx {@link Node}.
   */
  default Node asNode() {

    return (Node) this;
  }

}
