package com.chenwan.access;

import static com.chenwan.util.Utils.*;
class Soup {
	private Soup() {
		print("Soup initialize");
	}

	public static Soup makeSoup() {
		return new Soup();
	}
}