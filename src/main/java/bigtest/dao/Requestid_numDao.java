package bigtest.dao;
import bigtest.entity.Requestid_num;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Requestid_numDao extends JpaRepository<Requestid_num,Integer> {
    Requestid_num findByrequestid(String requestid);
}