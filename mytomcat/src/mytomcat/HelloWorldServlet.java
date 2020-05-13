package mytomcat;

import java.io.IOException;

/**
 * <h3>mytomcat</h3>
 * <p>servlet实现类</p>
 *
 * @author : hkzhao
 * @date : 2020-05-13 16:55
 **/
public class HelloWorldServlet extends MyServlet {
    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("post world...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try{
            myResponse.write("get world...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
