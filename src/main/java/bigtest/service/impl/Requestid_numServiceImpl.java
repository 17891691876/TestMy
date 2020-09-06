package bigtest.service.impl;

import bigtest.dao.Requestid_numDao;
import bigtest.entity.Requestid_num;
import bigtest.service.Requestid_numService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Requestid_numServiceImpl implements Requestid_numService {

    @Autowired
    private Requestid_numDao requestid_numDao;

    @Override
    public Requestid_num findByrequestid(String requestid) {
        return requestid_numDao.findByrequestid(requestid);
    }

    @Override
    public Requestid_num saveRequestidnum(Requestid_num requestid_num) {
        return requestid_numDao.save(requestid_num);
    }

    @Override
    public Requestid_num updateRequestidnum(Requestid_num requestid_num) {
        return requestid_numDao.save(requestid_num);
    }
}
