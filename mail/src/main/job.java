package main;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

import h2o.common.Tools;

public class job {
	
	
	public void go() throws Exception {
	// 首先，必需要取得一个Scheduler的引用
			SchedulerFactory sf = new StdSchedulerFactory();
			Scheduler sched = sf.getScheduler();
//			String time = "0 0/1 0,7-23 * * ?";
			String time=AppConfig.EXETIME;
			// jobs可以在scheduled的sched.start()方法前被调用

			// job 1将每隔20秒执行一次
			JobDetail job = new JobDetail("job1", "group1", mail.class);
			CronTrigger trigger = new CronTrigger("trigger1", "group1");
			trigger.setCronExpression(time);
			Date ft = sched.scheduleJob(job, trigger);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			Tools.log.info(
					job.getKey() + " 已被安排执行于: " + sdf.format(ft) + "，并且以如下重复规则重复执行: " + trigger.getCronExpression());
			sched.start();
}
}
