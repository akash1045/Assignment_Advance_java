package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.TextEditor;

public class MainApp {

	public static void main(String[] args) {
	  ApplicationContext context=new ClassPathXmlApplicationContext("my-spring-confg.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();

	}

}
