package bigtest.validate.request.pm;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmBidfloorValidate {
    public static  void pmbidfloorvalidate(String bidfloor){
        if (StringUtils.isEmpty(bidfloor)){
            log.error("bidfloor为空");
        }

    }
}
