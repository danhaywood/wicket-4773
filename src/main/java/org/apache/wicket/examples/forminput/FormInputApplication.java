/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.examples.forminput;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.examples.WicketExampleApplication;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.settings.IRequestCycleSettings.RenderStrategy;


/**
 * Application class for form input example.
 * 
 * @author Eelco Hillenius
 */
public class FormInputApplication extends WicketExampleApplication
{

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends Page> getHomePage()
	{
		return FormInput.class;
	}

	/**
	 * @see org.apache.wicket.protocol.http.WebApplication#newSession(org.apache.wicket.request.Request,
	 *      org.apache.wicket.request.Response)
	 */
	@Override
	public Session newSession(Request request, Response response)
	{
		return new WebSession(request);
	}

	/**
	 * @see org.apache.wicket.protocol.http.WebApplication#init()
	 */
	@Override
	protected void init()
	{
		super.init();

		// uncomment this ... the ComponentFeedbackPanel fails to render.
		//getRequestCycleSettings().setRenderStrategy(RenderStrategy.REDIRECT_TO_RENDER);

	}
}
