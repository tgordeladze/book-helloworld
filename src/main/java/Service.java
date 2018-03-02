import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 * Created by gordelat on 02.03.2018.
 */
@RequestScoped
@Path("/service")
public class Service {

    @GET()
    @Produces("application/json")
    public HashMap<String, String> getInsult(){
        HashMap<String,String> result = new HashMap<>();
        result.put("first","First Object");

        return result;
    }

}
