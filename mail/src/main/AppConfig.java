package main;

import h2o.common.util.ioc.ButterflyFactory;

/**
 * Created by wgp on 18/6/7.
 */
public abstract class AppConfig {

    private AppConfig() {}

    private static final ButterflyFactory bf = new ButterflyFactory( "profile" , "/file/profile.cfg");

    public static final String MAINMAILACCTNO = bf.get("MAINMAILACCTNO");//邮件发送人邮箱
    
    public static final String MAINMAILPWD = bf.get("MAINMAILPWD");//邮件发送人邮件密码
    
    public static final String MAINMAILHOST = bf.get("MAINMAILHOST");//发送邮件host
    
    public static final String MAILFORM = bf.get("MAILFORM");//邮件发送人简称
    
    public static final String MAILTO = bf.get("MAILTO");//邮件收件人简称
    
    public static final String MAILSUBJECT = bf.get("MAILSUBJECT");//邮件主题
    
    public static final String EXETIME = bf.get("EXETIME");//定时任务执行频率
    
    public static final String PORT = bf.get("PORT");//收款人邮箱端口
    
    
  
}
