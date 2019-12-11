/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.StartTestingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTestingResponseUnmarshaller {

	public static StartTestingResponse unmarshall(StartTestingResponse startTestingResponse, UnmarshallerContext _ctx) {
		
		startTestingResponse.setRequestId(_ctx.stringValue("StartTestingResponse.RequestId"));
		startTestingResponse.setCode(_ctx.stringValue("StartTestingResponse.Code"));
		startTestingResponse.setMessage(_ctx.stringValue("StartTestingResponse.Message"));
		startTestingResponse.setHttpStatusCode(_ctx.integerValue("StartTestingResponse.HttpStatusCode"));
		startTestingResponse.setSuccess(_ctx.booleanValue("StartTestingResponse.Success"));
		startTestingResponse.setSceneId(_ctx.stringValue("StartTestingResponse.SceneId"));
		startTestingResponse.setReportId(_ctx.stringValue("StartTestingResponse.ReportId"));
	 
	 	return startTestingResponse;
	}
}