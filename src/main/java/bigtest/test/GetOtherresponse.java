package bigtest.test;

import bigtest.bean.ProxyResponse;
import bigtest.entity.Requestid_num;
import bigtest.service.Requestid_numService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOtherresponse {

    @Autowired
    private Requestid_numService rquestid_numService;

    public  void getResponseValidate(ProxyResponse response){
        String responseMes = response.getContent();
        System.out.println(responseMes);
        String request_id = subString(responseMes,"request_id=","&cid=");
        Requestid_num requestid_num2 = new Requestid_num();
        requestid_num2.setRequestid(request_id);
        requestid_num2.setNumber(1);
        Requestid_num requestid_num = rquestid_numService.findByrequestid(request_id);
        if(requestid_num != null){
            int  number = requestid_num.getNumber();
            number ++;
            requestid_num2.setNumber(number);
        }
        Requestid_num requestid_num3 = rquestid_numService.saveRequestidnum(requestid_num2);



    }


    //找出request_id
    public static String subString(String str, String strStart, String strEnd) {

        /* 找出指定的2个字符在 该字符串里面的 位置 */
        int strStartIndex = str.indexOf(strStart);
        int strEndIndex = str.indexOf(strEnd);

        /* index 为负数 即表示该字符串中 没有该字符 */
        if (strStartIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strStart + ", 无法截取目标字符串";
        }
        if (strEndIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strEnd + ", 无法截取目标字符串";
        }
        /* 开始截取 */
        String result = str.substring(strStartIndex, strEndIndex).substring(strStart.length());
        return result;
    }
}
