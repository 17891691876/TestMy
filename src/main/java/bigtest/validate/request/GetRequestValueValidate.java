package bigtest.validate.request;

import com.hupu.ad.foundation.constants.HupuAdType;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Slf4j
@Component  //声明一个组件
public class GetRequestValueValidate {
    public static void getRequestValueValidate(HttpServletRequest request){
        String hupu_ad_type = request.getParameter("hupu_ad_type");
        HupuAdType splitAdType = new HupuAdType(hupu_ad_type);
        Integer index = splitAdType.getIndex();
        String targetId = splitAdType.getTargetId();
        Integer type = splitAdType.getType();

        //_os校验
        String os = request.getParameter("_os");
        OsValidate.validate(os);

        //ios 相关参数校验
        if (os.equals("2")){
            String pxw = request.getParameter("pxw");
            String pxh = request.getParameter("pxh");
            PxwPxhValidate.validate(pxw,pxh);
//            String mac = request.getParameter("_mac");
//            MacValidate.validate(mac);
            String idfa = request.getParameter("_idfa");
            IdfaValidate.validate(idfa);
            String oid = request.getParameter("_oid");
            OidValidate.validate(oid);

        }

        //android 相关参数校验
        if (os.equals("1")){
            String imei = request.getParameter("_imei");
            ImeiValidate.validate(imei);
            String imeio = request.getParameter("_imeio");
            ImeioValidate.validate(imeio);
            String android_id = request.getParameter("android_id");
            Android_idValidate.validate(android_id);
        }

        //client校验
        String client = request.getParameter("client");
        ClientValidate.validate(client);

        //clientid校验
        String clientId = request.getParameter("clientId");
        ClientIdValidate.validate(clientId);

        //night校验
        String night = request.getParameter("night");
        NightValidate.validate(night);

        //_osv校验
        String osv = request.getParameter("_osv");
        OsvValidate.validate(osv);

        //_md校验
        String md = request.getParameter("_md");
        MdValidate.validate(md);

        //_dev校验
        String dev = request.getParameter("_dev");
        DevValidate.validate(dev);

        //_nt校验
        String nt = request.getParameter("_nt");
        NtValidate.validate(nt);

        //sw和sh校验
        String sw = request.getParameter("sw");
        String sh = request.getParameter("sh");
        SwShValidate.validate(sw,sh);

        //_o校验
        String o = request.getParameter("_o");
        OValidate.validate(o);

        //_ssid校验
//        String ssid = request.getParameter("_ssid");
//        try {
//            SsidValidate.validate(ssid);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        //fromback校验
        if (hupu_ad_type.equals("4000101")){
            String fromback = request.getParameter("fromback");
            FromBackValidate.validate(fromback);
        }

        //libra_group校验
        String libra_group = request.getParameter("libra_group");
        Libra_groupValidate.validate(libra_group);

        //sign校验
        String sign = request.getParameter("sign");
        SignValidate.validate(sign);

        //time校验
        String time = request.getParameter("time");
        TimeValidate.validate(time);

        //spm校验
        String spm = request.getParameter("spm");
        SpmValidate.validate(spm);

        //time_zone校验
        String time_zone = request.getParameter("time_zone");
        TimeZoneValidate.validate(time_zone);

        //crt校验
        String crt = request.getParameter("crt");
        CrtValidate.validate(crt);

        //label校验
        if( type == 1) {
            String label = request.getParameter("label");
            LabelValidate.validate(label);
        }
        // TODO: 2020/5/24
        //news_first_navi校验
        //first_navi_numbers校验
        //fid校验
        //topic_id校验




    }
}
