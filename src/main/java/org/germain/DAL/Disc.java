package org.germain.DAL;


public class Disc {

  private long discId;
  private String discTitle;
  private long discYear;
  private String discPicture;
  private String discLabel;
  private String discGenre;
  private double discPrice;
  private long artistId;
  private String artistName;

  @Override
  public String toString() {
    return discTitle
            ;
  }

  public Disc(long discId, String discTitle, long discYear, String discPicture, String discLabel, String discGenre, double discPrice, long artistId) {
    this.discId = discId;
    this.discTitle = discTitle;
    this.discYear = discYear;
    this.discPicture = discPicture;
    this.discLabel = discLabel;
    this.discGenre = discGenre;
    this.discPrice = discPrice;
    this.artistId = artistId;
  }

  public Disc(String discTitle, String discPicture, String artistName) {
    this.discTitle = discTitle;
    this.discPicture = discPicture;
    this.artistName = artistName;
  }

  public long getDiscId() {
    return discId;
  }

  public void setDiscId(long discId) {
    this.discId = discId;
  }


  public String getDiscTitle() {
    return discTitle;
  }

  public void setDiscTitle(String discTitle) {
    this.discTitle = discTitle;
  }


  public long getDiscYear() {
    return discYear;
  }

  public void setDiscYear(long discYear) {
    this.discYear = discYear;
  }


  public String getDiscPicture() {
    return discPicture;
  }

  public void setDiscPicture(String discPicture) {
    this.discPicture = discPicture;
  }


  public String getDiscLabel() {
    return discLabel;
  }

  public void setDiscLabel(String discLabel) {
    this.discLabel = discLabel;
  }


  public String getDiscGenre() {
    return discGenre;
  }

  public void setDiscGenre(String discGenre) {
    this.discGenre = discGenre;
  }


  public double getDiscPrice() {
    return discPrice;
  }

  public void setDiscPrice(double discPrice) {
    this.discPrice = discPrice;
  }


  public long getArtistId() {
    return artistId;
  }

  public void setArtistId(long artistId) {
    this.artistId = artistId;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }
}
