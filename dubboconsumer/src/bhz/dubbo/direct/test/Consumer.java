package bhz.dubbo.direct.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bhz.dubbo.direct.provider.DirectService;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "direct-consumer.xml" });
		context.start();
			
		DirectService directService = (DirectService) context.getBean("directService");
		String ret = directService.direct();
		System.out.println(ret);
		
		System.in.read();
	}

}