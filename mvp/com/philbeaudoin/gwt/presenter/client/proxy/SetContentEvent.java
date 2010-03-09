package com.philbeaudoin.gwt.presenter.client.proxy;

import com.google.gwt.event.shared.GwtEvent;
import com.philbeaudoin.gwt.presenter.client.EventBus;
import com.philbeaudoin.gwt.presenter.client.Presenter;

public class SetContentEvent extends GwtEvent<SetContentHandler<?>> {

  private final Type<SetContentHandler<?>> type;
  private final Presenter content;

  public static void fire(
      final EventBus eventBus,
      final Type<SetContentHandler<?>> type,
      final Presenter content ) {
    eventBus.fireEvent( new SetContentEvent(type, content) );
  }

  public SetContentEvent( Type<SetContentHandler<?>> type, Presenter content ) {
    this.type = type;
    this.content = content;   
  }
  
  @Override
  protected void dispatch(SetContentHandler<?> handler) {
    handler.executeSetContent( this );
  }

  @Override
  public Type<SetContentHandler<?>> getAssociatedType() {
    return type;
  }

  public Presenter getContent() {
    return content;
  }

}
