package main;


import h2o.common.Tools;

public class MainApp {
	public static void main(String[] args) throws Exception{
		job test = new job();
		Tools.log.info("邮件程序开始");
		test.go();
	}
}
