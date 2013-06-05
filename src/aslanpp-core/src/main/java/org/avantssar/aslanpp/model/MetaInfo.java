// Copyright 2010-2013 (c) IeAT, Siemens AG, AVANTSSAR and SPaCIoS consortia.
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.avantssar.aslanpp.model;

public class MetaInfo {

	public static final String OFMC = "ofmc";
	public static final String SATMC = "satmc";
	public static final String CLATSE = "clatse";
	public static final String MODELER = "modeler";
	public static final String VERBATIM = "verbatim";

	private final String tag;
	private final String value;

	private final String repr;

	protected MetaInfo(String tag, String value) {
		this.tag = tag;
		this.value = value;
		this.repr = "@" + tag + "(" + value + ")";

	}

	public String getTag() {
		return tag;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return repr;
	}

}