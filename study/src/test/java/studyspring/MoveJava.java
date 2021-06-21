package studyspring;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class MoveJava {
	
	Logger logger = LoggerFactory.getLogger(MoveJava.class);

	@Inject
	SqlSession sqlSession;
	@Test
	public void testQuery() throws Exception{
		logger.info(sqlSession.selectList("topMenuMapper.selectMenu").toString());
	}
	
	@Test
	public void testLogger() throws Exception {
		logger.info("테스트확인");
	}
}
