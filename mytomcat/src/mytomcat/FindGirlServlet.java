package mytomcat;

import java.io.IOException;

/**
 * <h3>mytomcat</h3>
 * <p>继承servlet的实现类</p>
 *
 * @author : hkzhao
 * @date : 2020-05-13 16:53
 **/
public class FindGirlServlet extends MyServlet {
    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("get girl...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("post girl...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
