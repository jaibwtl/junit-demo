/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecondTest {

	@Test
	void mySecondTest() {
		assertEquals(1, 1, "1 is not equal to 1");
	}

	@Test
	@Tag("slow")
	void aSlowTest() throws InterruptedException {
		Thread.sleep(1000);
	}
}
