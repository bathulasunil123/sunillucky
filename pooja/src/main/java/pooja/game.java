package pooja;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pooja.customer;;

public class game {

	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bn =new XmlBeanFactory(rs);
		customer c=(customer)bn.getBean("cst1");
		c.disp();

	}

}
