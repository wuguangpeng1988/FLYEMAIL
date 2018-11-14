package main;
public final class CONSTANTS {

	    private CONSTANTS() {
	    }

	    public static class CONTANT {
	    	
	    	//邮箱excel存放位置
//	        public static final String MAILEXCEL="mail\\file\\test.xls";
	    	public static final String MAILEXCEL = System.getProperty("user.dir") + "\\file\\MailReceiver.xls";    
	        //要发邮件模板位置
//	        public static final String MAILFILE="mail\\file\\file.txt";
	    	public static final String MAILFILE = System.getProperty("user.dir") + "\\file\\MailContent.txt";    
//	        //邮件发送人邮箱
//	        public static final String MAINMAILACCTNO="wuguangpeng1988@126.com";
//	        //邮件发送人邮件密码
//	        public static final String MAINMAILPWD="4812712peng";
//	        //发送邮件host
//	        public static final String MAINMAILHOST="smtp.126.com";
//	        //邮件发送人简称
//	        public static final String MAILFORM="某公司产品";
//	        //邮件主题
//	        public static final String MAILSUBJECT="产品介绍";

	    }

}
