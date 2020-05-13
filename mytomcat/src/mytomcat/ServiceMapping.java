package mytomcat;

/**
 * <h3>mytomcat</h3>
 * <p>servlet配置</p>
 *
 * @author : hkzhao
 * @date : 2020-05-13 16:56
 **/
public class ServiceMapping {
    private String servletName;
    private String url;
    private String clazz;
    public ServiceMapping(String servletName,String url,String clazz){
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }
}
