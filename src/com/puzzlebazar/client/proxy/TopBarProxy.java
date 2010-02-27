/**
 * 
 */
package com.puzzlebazar.client.proxy;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.philbeaudoin.gwt.presenter.client.EventBus;
import com.philbeaudoin.gwt.presenter.client.proxy.BasicProxy;
import com.puzzlebazar.client.presenter.TopBarPresenter;

public class TopBarProxy extends BasicProxy<TopBarPresenter> implements TopBarPresenter.Proxy {
  @Inject
  public TopBarProxy(EventBus eventBus, Provider<TopBarPresenter> presenter) {
    super(eventBus, presenter);
  }
}