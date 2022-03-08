package com.hugus.fundamental.String;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName StringBuilderDemo
 * @Description API For StringBuilder
 * @Author hugus
 * @Date 2022/3/6 10:08
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2022/3/6 10:08     V1.0           Initial class
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		char[] chs = new char[]{',','I','\'','m',' ','L','e','e'};
		sb.append(chs);
		System.out.println(sb.toString());

		int capacity = sb.capacity();
		System.out.println(capacity);

		char charAt = sb.charAt(10);
		System.out.println(charAt);

		System.out.println(sb.length());

		sb.append(",Hahahaha");
		System.out.println(sb);

		sb.delete(14,16);
		System.out.println(sb.toString());

		sb.deleteCharAt(14);
		System.out.println(sb.toString());

		System.out.println(sb.indexOf(","));

		sb.insert(14,"nice to meet you,");
		System.out.println(sb.toString());

		sb.reverse();
		System.out.println(sb.toString());

		sb.reverse().setCharAt(5,'!');
		System.out.println(sb.toString());

		String substring = sb.substring(5, 30);
		System.out.println(substring);


	}
}

