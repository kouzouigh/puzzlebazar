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

package com.puzzlebazar.client;

import com.philbeaudoin.gwtp.mvp.client.proxy.PlaceImpl;

/**
 * A secured {@link Place} that can only be accessed when the user
 * is logged in.
 * 
 * @author Philippe Beaudoin
 */
public class LoggedInSecurePlace extends PlaceImpl {  
  
  private final CurrentUser currentUser;

  public LoggedInSecurePlace(
      final String nameToken,
      final CurrentUser currentUser ) {
    super(nameToken);
    this.currentUser = currentUser;
  }

  @Override
  public boolean canReveal() {
    return currentUser.isLoggedIn();
  }
  
}