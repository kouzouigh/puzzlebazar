package com.puzzlebazar.client.core.presenter;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.philbeaudoin.gwt.presenter.client.Display;
import com.philbeaudoin.gwt.presenter.client.PresenterImpl;
import com.philbeaudoin.gwt.presenter.client.EventBus;
import com.philbeaudoin.gwt.presenter.client.proxy.Place;
import com.philbeaudoin.gwt.presenter.client.proxy.SetContentEvent;
import com.philbeaudoin.gwt.presenter.client.proxy.TabContentProxy;
import com.puzzlebazar.client.core.proxy.UserSettingsTabProxy;

/**
 * This is the presenter of the general tab in the user settings page.
 * 
 * @author Philippe Beaudoin
 */
public class UserSettingsGeneralPresenter 
extends PresenterImpl<UserSettingsGeneralPresenter.MyDisplay, UserSettingsGeneralPresenter.MyProxy> {

  public interface MyDisplay extends Display { }

  public interface MyProxy extends TabContentProxy<UserSettingsGeneralPresenter>, Place {}

  @Inject
  public UserSettingsGeneralPresenter(final EventBus eventBus, 
      final Provider<MyDisplay> display, 
      final MyProxy proxy ) {
    super(eventBus, display, proxy );
  }

  @Override
  protected void setContentInParent() {
    SetContentEvent.fire(eventBus, UserSettingsTabProxy.TYPE_SetTabContent, this);
  }
}
