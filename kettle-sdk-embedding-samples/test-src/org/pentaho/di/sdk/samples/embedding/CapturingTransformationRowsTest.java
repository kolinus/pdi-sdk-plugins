/*! ******************************************************************************
*
* Pentaho Data Integration
*
* Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
*
*******************************************************************************
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
******************************************************************************/

package org.pentaho.di.sdk.samples.embedding;


import java.util.List;

import junit.framework.TestCase;

public class CapturingTransformationRowsTest extends TestCase {

	public void testRows(){

		CapturingTransformationRows.main(new String[0]);
		List<Object[]> rows = CapturingTransformationRows.instance.capturedRows;

		// make sure some rows were collected
		assertTrue(rows.size() > 0);
		
	}
	
}
