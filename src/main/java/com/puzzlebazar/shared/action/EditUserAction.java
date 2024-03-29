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

package com.puzzlebazar.shared.action;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.puzzlebazar.shared.model.User;

/**
 * @author Philippe Beaudoin
 */
public class EditUserAction extends ActionImpl< NoResult > {

  private User user;
  private User previousUser;

  @SuppressWarnings("unused")
  private EditUserAction() {
    // For serialization only
  }

  public EditUserAction(User user, User previousUser) {
    this.user = user;
    this.previousUser = previousUser;
  }

  public User getUser() {
    return user;
  }

  public User getPreviousUser() {
    return previousUser;
  }
}
