package link.thinkonweb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

 public static void main(String[] args) {
  ApplicationContext ctx = new ClassPathXmlApplicationContext("link/thinkonweb/ipybook/aopConfig.xml");
  PersonPlayer cmkim = (PersonPlayer) ctx.getBean ("cm");
  //System.out.println ( "[name ="+ cmkim.getName () + "]");
  cmkim.listenMusic ();
 }

}