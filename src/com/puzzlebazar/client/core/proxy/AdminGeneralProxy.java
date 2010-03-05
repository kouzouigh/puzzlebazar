/**
 * 
 */
package com.puzzlebazar.client.core.proxy;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.inject.Inject;
import com.philbeaudoin.gwt.presenter.client.EventBus;
import com.philbeaudoin.gwt.presenter.client.proxy.PlaceManager;
import com.puzzlebazar.client.CodeSplitProvider;
import com.puzzlebazar.client.CurrentUser;
import com.puzzlebazar.client.NameTokens;
import com.puzzlebazar.client.core.presenter.AdminGeneralPresenter;
import com.puzzlebazar.client.core.presenter.AdminPresenter;
import com.puzzlebazar.client.resources.Translations;

public class AdminGeneralProxy extends AdminTabContentProxy<AdminGeneralPresenter>
implements AdminGeneralPresenter.Proxy {
  
  @Inject
  public AdminGeneralProxy(
      final EventBus eventBus, 
      final PlaceManager placeManager,
      final AsyncProvider<AdminGeneralPresenter> presenter, 
      final CurrentUser currentUser,
      final Translations translations) {
    super(
        eventBus, 
        placeManager, 
        new CodeSplitProvider<AdminGeneralPresenter>(presenter, translations),
        AdminPresenter.TYPE_RequestTabs,
        currentUser,
        translations);
  }

  @Override
  public String getText() {
    return translations.tabGeneral();
  }
  
  @Override
  public String getNameToken() {
    return NameTokens.getAdminGeneral();
  }
  
  @Override
  public float getPriority() {
    return 0;
  }
    
}