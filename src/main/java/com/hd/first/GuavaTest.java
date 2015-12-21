package com.hd.first;

import com.google.common.base.Splitter;

public class GuavaTest {
	public static void main(String[] args) {
		Iterable<String> strs = Splitter.on(',').trimResults()
				.omitEmptyStrings().split("foo,bar,,   qux");
		for (String s : strs) {
			System.out.println(s);
		}
	}
}
