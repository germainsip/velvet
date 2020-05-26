package org.germain.DAL;


public class Disc {

  private String discTitle;
  private String discPicture;
  private String artistName;

  @Override
  public String toString() {
    return discTitle
            ;
  }



  public Disc(String discTitle, String discPicture, String artistName) {
    this.discTitle = discTitle;
    discPicture = discPicture.replaceAll(" ","%20");
    this.discPicture = discPicture;
    this.artistName = artistName;
  }

  public String getDiscTitle() {
    return discTitle;
  }

  public void setDiscTitle(String discTitle) {
    this.discTitle = discTitle;
  }

  public String getDiscPicture() {
    return discPicture;
  }

  public void setDiscPicture(String discPicture) {
    this.discPicture = discPicture;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }
}
