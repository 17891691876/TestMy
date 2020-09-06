package bigtest.service;

import bigtest.entity.Requestid_num;
import org.springframework.stereotype.Service;


public interface Requestid_numService {
    Requestid_num findByrequestid(String requestid);

    Requestid_num saveRequestidnum(Requestid_num requestid_num);

    Requestid_num updateRequestidnum(Requestid_num requestid_num);


}