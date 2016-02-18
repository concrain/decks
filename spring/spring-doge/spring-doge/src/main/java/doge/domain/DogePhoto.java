/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package doge.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.util.Assert;

/**
 * A Doge submitted by a {@link User}.
 *
 * @author Josh Long
 * @author Phillip Webb
 */
public class DogePhoto {

	@Id
	private String id;

	@DBRef(lazy = true)
	private User user;

	private String fileRef;

	public DogePhoto(User user, String fileRef) {
		Assert.notNull(user, "User must not be null");
		Assert.notNull(fileRef, "FileRef must not be null");
		this.user = user;
		this.fileRef = fileRef;
	}

	public String getId() {
		return this.id;
	}

	public String getFileRef() {
		return this.fileRef;
	}

}
