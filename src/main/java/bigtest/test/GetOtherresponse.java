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

    //存储getother中的request_id的次数和值
    public  void getResponseValidate(ProxyResponse response){
        String responseMes = response.getContent();
        String code = subString(responseMes, "\"ad_code\":", ",\"show_type\"");
        //System.out.println(responseMes);
        System.out.println(code);
        if(code.equals("1")) {
            String request_id = subString(responseMes, "request_id=", "&cid=");
            System.out.println(request_id);
            Requestid_num requestid_num2 = new Requestid_num();
            requestid_num2.setRequestid(request_id);
            requestid_num2.setNumber(1);
            requestid_num2.setPmnumber(0);
            requestid_num2.setCmnumber(0);
            requestid_num2.setXmnumber(0);
            Requestid_num requestid_num = rquestid_numService.findByrequestid(request_id);
            if (requestid_num != null) {
                int number = requestid_num.getNumber();
                number++;
                requestid_num2.setNumber(number);
            }

            Requestid_num requestid_num3 = rquestid_numService.saveRequestidnum(requestid_num2);

        }else {
            System.out.println("=============================");
        }

    }

    //根据request_id 存储pm曝光次数
    public void savePmNum(String request_id ){
        //Requestid_num requestid_num = new Requestid_num();
        Requestid_num requestid_num2 = rquestid_numService.findByrequestid(request_id);
        if(requestid_num2 != null){
//            requestid_num.setRequestid(request_id);
//            int number = requestid_num2.getNumber();
//            requestid_num.setNumber(number);
            int pmnumber = requestid_num2.getPmnumber();
            pmnumber ++;
            requestid_num2.setPmnumber(pmnumber);
        }

        Requestid_num requestid_num3 = rquestid_numService.updateRequestidnum(requestid_num2);
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
