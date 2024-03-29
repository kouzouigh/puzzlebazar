/**
 * Copyright 2010 Philippe Beaudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.puzzlebazar.client.core.presenter;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.puzzlebazar.client.CurrentUser;

/**
 * This event is sent to the {@link EventBus} when the current user
 * information has changed. For example, if the user logged in or
 * logged out.
 *
 * @author Philippe Beaudoin
 */
public class CurrentUserChangedEvent extends GwtEvent<CurrentUserChangedHandler> {

  private static final Type<CurrentUserChangedHandler> TYPE = new Type<CurrentUserChangedHandler>();

  public static Type<CurrentUserChangedHandler> getType() {
    return TYPE;
  }

  public static void fire(HasHandlers source, CurrentUser currentUser) {
    source.fireEvent(new CurrentUserChangedEvent(currentUser));
  }

  private final CurrentUser currentUser;

  public CurrentUserChangedEvent(CurrentUser currentUser) {
    this.currentUser = currentUser;
  }

  /**
   * Access the current user attached to this event.
   *
   * @return The {@link CurrentUser} describing the currently logged in user.
   */
  public CurrentUser getCurrentUser() {
    return currentUser;
  }

  @Override
  protected void dispatch(CurrentUserChangedHandler handler) {
    handler.onCurrentUserChanged(this);
  }

  @Override
  public Type<CurrentUserChangedHandler> getAssociatedType() {
    return getType();
  }
}
