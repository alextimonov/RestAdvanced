package ua.timonov.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.Date;

@Path("test")
//@Path("{pathParam}/test")
//@Singleton
public class MyResource {
    /*private int count;
    @PathParam("pathParam") private String pathParamExample;
    @QueryParam("query") private String queryParamExample;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod() {
        count++;
        return "It works! This method was called " + count + " time(s). Path param used " + pathParamExample +
                " and Query param used " + queryParamExample;
    }*/

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Date testMethod() {
        return Calendar.getInstance().getTime();
    }
}
