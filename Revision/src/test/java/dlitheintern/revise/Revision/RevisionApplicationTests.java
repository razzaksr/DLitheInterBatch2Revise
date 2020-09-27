package dlitheintern.revise.Revision;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
class RevisionApplicationTests 
{
	@Mock
	RepoResource repo;
	
	@Autowired
	ResourceService serv;
	
	@Test
	public void testInsert()
	{
		Resource r1=new Resource("Mohamed","Vostro1014",32400.7);
		Resource r2=new Resource("Sabari","Lenevo1014",27400.7);
		when(repo.save(r1)).thenReturn(r1);
		assertSame(r2, serv.add(r2));
	}

}

