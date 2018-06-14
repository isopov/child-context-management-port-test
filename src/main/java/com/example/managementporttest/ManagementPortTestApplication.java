package com.example.managementporttest;

import com.example.managementporttest.child.ChildModule;
import com.example.managementporttest.parent.ParentModule;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ManagementPortTestApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(ParentModule.class)
				.profiles(ParentModule.PARENT_PROFILE)
				.child(ChildModule.class)
				.profiles(ChildModule.CHILD_PROFILE)
				.run(args);
	}
}
