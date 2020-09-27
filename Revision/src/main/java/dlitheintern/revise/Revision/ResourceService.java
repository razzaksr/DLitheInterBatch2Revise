package dlitheintern.revise.Revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService 
{
	@Autowired
	RepoResource repo;
	
	public Resource add(Resource res)
	{
		return repo.save(res);
	}
	
}
