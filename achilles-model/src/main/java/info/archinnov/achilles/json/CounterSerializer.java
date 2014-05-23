/*
 * Copyright (C) 2012-2014 DuyHai DOAN
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package info.archinnov.achilles.json;

import info.archinnov.achilles.type.Counter;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class CounterSerializer extends JsonSerializer<Counter> {

	@Override
	public void serialize(Counter value, JsonGenerator generator, SerializerProvider provider) throws IOException {
		String serializedValue = "";
		if (value != null) {
			Long counterValue = value.get();
			if (counterValue != null) {
				serializedValue = counterValue.toString();
			}
		}
		generator.writeString(serializedValue);
	}

}
