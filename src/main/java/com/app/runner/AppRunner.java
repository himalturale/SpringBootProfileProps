package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
 import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
@Value("${my.message}")
private String message;
@Value("${my.code}")
private String code;
@Value("${my.mode}")
private String mode;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println(this);
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}

public AppRunner() {
	super();
}

@Override
public String toString() {
	return "AppRunner [message=" + message + ", code=" + code + ", mode=" + mode + "]";
}

}
