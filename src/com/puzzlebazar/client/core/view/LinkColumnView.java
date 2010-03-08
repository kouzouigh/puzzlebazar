package com.puzzlebazar.client.core.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.puzzlebazar.client.core.presenter.LinkColumnPresenter;

public class LinkColumnView implements LinkColumnPresenter.MyDisplay {

  interface Binder extends UiBinder<Widget, LinkColumnView> { }
  protected static final Binder binder = GWT.create(Binder.class);
  private final Widget widget;
  @Override public Widget asWidget() {
    return widget;
  }
  
  @Inject
  public LinkColumnView() {
    widget = binder.createAndBindUi(this);
  }

}
