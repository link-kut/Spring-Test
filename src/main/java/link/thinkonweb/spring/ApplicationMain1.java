package link.thinkonweb.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationMain1 {
	public static void main(String[] args) {
		String[] configLocations = new String[]{"link/thinkonweb/ipybook/aopConfig.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		
		WriteArticleService writeArticleService = context.getBean("writeArticleServiceImpl", WriteArticleService.class);
		writeArticleService.write(new Article());
	}
}
