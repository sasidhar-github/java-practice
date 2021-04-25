package com.test.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

        String str ="Hello Optional";
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent());
        System.out.println(opt.orElse("This is orElse Optional value"));
        opt = Optional.of(str);
        System.out.println(opt.get());
	}

}
