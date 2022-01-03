import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Servlet"}, description = "prikupljanje podataka")

public class Servlet extends HttpServlet {

    protected void dataProccesing(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String streetName = request.getParameter("streetName");
        String streetNumber  =(request.getParameter("streetNo"));
        String profession = request.getParameter("profesija");

        //PojoClass pc = new PojoClass(firstName,lastName,streetName,profession,streetNumber);

        try(PrintWriter out  = response.getWriter()){


            out.println("First Name : "+ firstName+"" );
            out.println("Last Name : "+ lastName+"" );
            out.println("Street Name : "+ streetName+"" );
            out.println("Profession : "+ profession+"" );
            out.println("Street Number : "+ streetNumber+"" );

          //  System.out.println(pc.toString());


        }catch (Exception exception){

            exception.printStackTrace();

        }

    }

    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
        dataProccesing(request,respons);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
        dataProccesing(request,respons);
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}
