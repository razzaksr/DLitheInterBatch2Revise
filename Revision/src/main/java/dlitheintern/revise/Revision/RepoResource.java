package dlitheintern.revise.Revision;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoResource extends JpaRepository<Resource, Integer>
{

}
