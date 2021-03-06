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

import org.avantssar.aslanpp.visitors.IASLanPPVisitor;

public class InequalityExpression extends EqualityExpression {

	protected InequalityExpression(ITerm leftTerm, ITerm rightTerm) {
		super(leftTerm, rightTerm);
	}

	@Override
	public IExpression duplicate() {
		return new InequalityExpression(getLeftTerm(), getRightTerm());
	}

	@Override
	public IExpression reduce(SymbolsState symState) {
		return new InequalityExpression(getLeftTerm().reduce(symState), getRightTerm().reduce(symState));
	}

	@Override
	public void accept(IASLanPPVisitor visitor) {
		visitor.visit(this);
	}

}
