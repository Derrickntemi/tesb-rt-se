/*
 * #%L
 * Service Activity Monitoring :: Agent
 * %%
 * Copyright (C) 2011 Talend Inc.
 * %%
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
 * #L%
 */
package org.talend.esb.sam.agent.interceptor;

import org.apache.cxf.message.Message;

public interface MessageContextCodec {

	/**
	 * Decode the <b>flowId</b>.
	 * @return current value of FlowId
	*/
	String readFlowId(Message message);
	
	/**
	 * Encode the <b>flowId</b>.
	 * @param flowId new value for FlowId
	*/
	void writeFlowId(Message message, String flowId);
	
}
