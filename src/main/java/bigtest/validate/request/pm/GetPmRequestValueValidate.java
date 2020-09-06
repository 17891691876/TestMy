package bigtest.validate.request.pm;

import bigtest.validate.request.getother.*;
import com.hupu.ad.foundation.constants.HupuAdType;
import lombok.extern.slf4j.Slf4j;
import oracle.jvm.hotspot.jfr.JFRTypeIDs;
import org.apache.tools.ant.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Slf4j
@Component  //声明一个组件
public class GetPmRequestValueValidate {
     public static void getPmRequestValueValidate(HttpServletRequest request){
         //ad_type校验
         String ad_type=request.getParameter("ad_type");
         HupuAdType splitad_type=new HupuAdType(ad_type);
         Integer type=splitad_type.getType();
         String targetId=splitad_type.getTargetId();
         Integer position=splitad_type.getPosition();
         HupuAdTypeValidate.validate(ad_type);

         //union_name校验
         String union_name=request.getParameter("union_name");
         PmUnionnameValidate.pmunionnamevalidate(union_name);

         //_os校验
        String os = request.getParameter("os");
        PmOsValidate.pmosvalidate(os);

         //os_version校验
         String os_version=request.getParameter("os_version");
         PmOsvValidate.pmosvalidate("os_version");

         //template校验
         String template=request.getParameter("template");
         if (union_name!="adcc") {
             PmTemplateValidate.pmtemplatevalidate_case1(template);
         }
         if(type!=1){
             PmTemplateValidate.pmtemplatevalidate_case2(template);
         }

         //title,show_type,style校验
         String title=request.getParameter("title");
         String show_type=request.getParameter("show_type");
         String style=request.getParameter("style");
         if ("false".equals(template)){
             PmTitleValidate.pmtitlevalidate(title);
             PmShowtypeValidate.pmshowtypevalidate(show_type,style);

         }

         //click_url,material_url校验
         String click_url=request.getParameter("click_url");
         String material_url=request.getParameter("material_url");
         if (!"头条".equals(union_name)){
             PmMaterialUrlValidate.pmmaterialurlvalidate(material_url);
             PmclickUrlValidate.pmclickurlvalidate(click_url);
         }
         if("头条".equals(union_name)&&!"3".equals(type)){
             PmMaterialUrlValidate.pmmaterialurlvalidate(material_url);
         }

         //slotid校验
         String slot_id=request.getParameter("slot_id");
         if("头条".equals(union_name) || "广点通".equals(union_name)){
             PmSlotidValidate.pmslotidvalidate(slot_id);
         }

        //ios 相关参数校验
         if (os.equals("ios")){
           String ios_idfa=request.getParameter("ios_idfa");
           IdfaValidate.validate(ios_idfa);
         }


        //android相关参数校验
        if(os.equals("android")){
            String android_imei=request.getParameter("android_imei");
            ImeiValidate.validate(android_imei);
            String android_id=request.getParameter("android_id");
            Android_idValidate.validate(android_id);
            String oaid=request.getParameter("oaid");
            PmOaidValidate.pmoaidvalidate(oaid);
        }


         //client_id校验
         String client_id=request.getParameter("client_id");
         ClientIdValidate.validate(client_id);

         //is_fromback校验'
         String is_fromback=request.getParameter("is_fromback");
         PmIsFromback.pmisfromback(is_fromback);

         //first_navi_numbers校验
         String first_navi_numbers=request.getParameter("first_navi_numbers");
         First_navi_numbersValidate.validate(first_navi_numbers);

         //fid校验
         if (targetId.equals(34)){
             String fid=request.getParameter("fid");
             PmFidValidate.pmfidvalidate(fid);
         }

         //app_version校验
         String app_version=request.getParameter("app_version");
         PmAppversionValidate.pmappversionvalidate(app_version);



         //download校验
         String download=request.getParameter("download");
         PmDownloadValidate.pmdownloadvalidate(download);

         //libra_group校验
         String libra_group=request.getParameter("libra_group");
         Libra_groupValidate.validate(libra_group);

         //cid校验
         String cid=request.getParameter("cid");
         ClientIdValidate.validate(cid);

         //bidfloor校验
         String bidfloor=request.getParameter("bidfloor");
         PmBidfloorValidate.pmbidfloorvalidate(bidfloor);

         //list_number校验
         String list_numbers=request.getParameter("list_numbers");
         PmListnumbersValidate.pmlistnumbersvalidate(list_numbers);

         //first_navi校验
         String first_navi=request.getParameter("first_navi");
         PmFirstNaviValidate.pmfirstnavivalidate(first_navi);

         //type校验
         String pmtype=request.getParameter("type");
         PmTypeValidate.pmtypevalidate(pmtype);



         //exposure_type校验
         String exposure_type=request.getParameter("exposure_type");
         PmExposureTypeValidate.pmexposuretypevalidate(exposure_type);

         //entrances校验
         String entrances=request.getParameter("entrances");
         PmEntranceValidate.pmentrancevalidate(entrances);

         String request_id=request.getParameter("request_id");
         PmRequestidValidate.pmrequestvalidate_case1(request_id);
         if(!"adcc".equals(union_name)){
             PmRequestidValidate.pmrequestvalidate_case2(request_id);
         }

    }
    //brand_name,board_name未校验
}
