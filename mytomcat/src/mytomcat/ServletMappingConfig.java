package mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>mytomcat</h3>
 * <p>config</p>
 *
 * @author : hkzhao
 * @date : 2020-05-13 16:58
 **/
public class ServletMappingConfig {
    public static List<ServiceMapping> serviceMappingList = new ArrayList<>();
    static {
        serviceMappingList.add(new ServiceMapping("findGirl","/girl","mytomcat.FindGirlServlet"));
        serviceMappingList.add(new ServiceMapping("helloWorld","/world","mytomcat.HelloWorldServlet"));
    }
}
