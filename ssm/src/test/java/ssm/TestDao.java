package ssm;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestDao {
	
	private static final Logger log4j = Logger.getLogger(TestDao.class);
	
	@Test
	public void testDao(){
		String randomNumeric = RandomStringUtils.randomNumeric(6);
		log4j.debug(randomNumeric);
	}
}
