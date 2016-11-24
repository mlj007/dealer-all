import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller 
public class Test {
	@Resource
//	private static  MongoCarDao mongoCarDao;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String resource = "configuration.xml";  
//	        Reader reader;
//	        SqlSession session = null;
//			try {
//			reader = Resources.getResourceAsReader(resource);
//	        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);  
//	        session = ssf.openSession();  
//		
//	        MongoCar user = (MongoCar) session.selectOne("getMongoCarById", 2);  
//	         System.out.println(user);  
//	        } catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (Exception e) {  
//	            e.printStackTrace();  
//	        } finally {  
//	            session.close();  
//	        }  
		
//		MongoCar user =mongoCarDao.getMongoCarById(Long.parseLong("2"));
//		 System.out.println(user);  
	}

}
