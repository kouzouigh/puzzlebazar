package com.puzzlebazar.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {
  
  @Source("logo.png")
  ImageResource logo();
  
  @Source("Puzzlebazar.css")
  Style style();

  @Source("defines.css")
  Defines defines();

  public interface Style extends CssResource {
    String username();
    String formMargin();
    String errorText();
  }  

  public interface Defines extends CssResource {
    String darkPanelColor();
    String lightPanelColor();
    String titleFontWeight();
    String titleFontSize();
    String titleColor();
    String formLineSpacing();
  }  

}
