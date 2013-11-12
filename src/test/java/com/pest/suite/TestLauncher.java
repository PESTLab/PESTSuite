package com.pest.suite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLauncher {

	Launcher launcher;

	@Test
	public void testUsageMessage() {
		launcher = new Launcher(new String[] {});
		assertEquals("Usage: java -jar pestsuite-1.0-SNAPSHOT.jar", launcher.getUsageMessage());
	}
	
	@Test
	public void testProcessArgsWithEmptyArray() {
		launcher = new Launcher(null);
		assertFalse(launcher.processArgs(new String[] {}));
	}
	
	@Test
	public void testProcessArgsWithNonEmptyArray() {
		launcher = new Launcher(null);
		assertTrue(launcher.processArgs(new String[] {"ASDA"}));
	}

}
