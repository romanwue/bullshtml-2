/**
 * Copyright (C) 2009 JunHo Yoon
 *
 * bullshtml is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * bullshtml is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 */

package com.junoyoon;

public class SrcFunctionDecisionPoint extends SrcDecisionPoint {
	public String name;

	public SrcFunctionDecisionPoint() {
	}

	public SrcFunctionDecisionPoint(int line, DecisionCoverType decisionCoverType, DecisionType decisionType, String name) {
		super(line, decisionCoverType, decisionType);
		this.name = name;
	}

}
