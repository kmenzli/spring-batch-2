package org.training.spring;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] springConfig  =
                {
                        "classpath:job-hello-world.xml"
                };

        ApplicationContext context =
                new ClassPathXmlApplicationContext(springConfig);
    }
}
