/*
 * Copyright 2012-2015 the original author or authors.
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

package sample.undertow.web;

import java.util.concurrent.Callable;

import sample.undertow.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("/")
	public String helloWorld() {
		return this.helloWorldService.getHelloMessage();
	}

	@RequestMapping("/async")
	public Callable<String> helloWorldAsync() {
		return new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "async: "
						+ SampleController.this.helloWorldService.getHelloMessage();
			}

		};

	}

}
