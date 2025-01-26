package io.github.musicdoc.fx.song;

import io.github.mmm.entity.link.Link;
import io.github.musicdoc.artist.Artist;
import io.github.musicdoc.song.Song;
import io.github.musicdoc.song.SongModel;

/**
 *
 */
public class SongLoader {

  public SongModel load() {

    SongModel model = new SongModel();
    model.add(create("While my Guitar gently wheeps", "The Beatles"));
    model.add(create("Hey Jude", "The Beatles"));
    model.add(create("Let it be", "The Beatles"));
    model.add(create("Here comes the sun", "The Beatles"));
    model.add(create("Chiquitita", "ABBA"));
    model.add(create("I have a dream", "ABBA"));
    model.add(create("The winner takes it all", "ABBA"));
    model.add(create("Waterloo", "ABBA"));
    model.add(create("Super Trouper", "ABBA"));
    model.add(create("Take on me", "a-ha"));
    model.add(create("Crying in the rain", "a-ha"));
    model.add(create("Dreamer", "Supertramp"));
    model.add(create("Even in the quitest Moments", "Supertramp"));
    model.add(create("Breakfirst in America", "Supertramp"));
    model.add(create("Lord is it mine", "Supertramp"));
    model.add(create("Logical Song", "Supertramp"));
    model.add(create("Hide in your Shell", "Supertramp"));
    model.add(create("School", "Supertramp"));
    model.add(create("Sister Moonshine", "Supertramp"));
    model.add(create("Easy does it", "Supertramp"));
    model.add(create("Surely", "Supertramp"));
    model.add(create("If everyone was listening", "Supertramp"));
    model.add(create("Wish you were here", "Pink Floyd"));
    model.add(create("You", "Ten Sharp"));
    model.add(create("Lady in Black", "Uriah Heep"));
    model.add(create("Venus", "Shocking Blue"));
    model.add(create("Big in Japan", "Alphaville"));
    model.add(create("Forever Young", "Alphaville"));
    model.add(create("All of me", "John Legend"));
    model.add(create("All you Zombies", "The Hooters"));
    model.add(create("Zombie", "The Cranberries"));
    model.add(create("The Icicle melts", "The Cranberries"));
    model.add(create("Angie", "The Rolling Stones"));
    model.add(create("Paint it black", "The Rolling Stones"));
    model.add(create("My sweet Lord", "George Harrison"));
    model.add(create("My Way", "Frank Sinatra"));
    model.add(create("Skyline Pigeon", "Elton John"));
    model.add(create("Tears in Heaven", "Eric Clapton"));
    model.add(create("Bridge over troubled Water", "Simon & Garfunkel"));
    model.add(create("Sound of Silence", "Simon & Garfunkel"));
    model.add(create("La Isla bonita", "Madonna"));
    model.add(create("Like a Prayer", "Madonna"));
    model.add(create("Komoko", "The Beach Boys"));
    model.add(create("God only knows", "The Beach Boys"));
    model.add(create("Mmm Mmm Mmm Mmm", "Crash Test Dummies"));
    model.add(create("Maria", "Blondie"));
    model.add(create("Nothing else matters", "Metallica"));
    model.add(create("Moonlight Shadow", "Mike Oldfield"));
    model.add(create("Moonshadow", "Cat Stevens"));
    model.add(create("Romeo and Julia", "Dire Straits"));
    model.add(create("Only Hope", "Mandy Moore"));
    model.add(create("Leningrad", "Billy Joel"));
    model.add(create("Reality", "Richard Sanderman"));
    model.add(create("Jessie", "Joshua Kadison"));

    return model;
  }

  private static Song create(String title, String artist) {

    Song song = Song.of();
    song.Title().set(title);
    Artist songArtist = Artist.of();
    songArtist.Title().set(artist);
    song.Artist().set(Link.of(songArtist));
    return song;
  }
}