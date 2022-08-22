package me.saransh13.web;

import lombok.extern.log4j.Log4j2;
import me.saransh13.service.DemoEdmProvider;
import me.saransh13.service.DemoEntityCollectionProcessor;
import org.apache.olingo.commons.api.edmx.EdmxReference;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataHttpHandler;
import org.apache.olingo.server.api.ServiceMetadata;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
@Log4j2
public class DemoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        try {
            // create odata handler and configure it with CsdlEdmProvider and Processor
            OData odata = OData.newInstance();
            ServiceMetadata edm = odata.createServiceMetadata(new DemoEdmProvider(), new ArrayList<EdmxReference>());
            ODataHttpHandler handler = odata.createHandler(edm);
            handler.register(new DemoEntityCollectionProcessor());

            // let the handler do the work
            handler.process(req, resp);
        } catch (RuntimeException e) {
            log.error("Server Error occurred in ExampleServlet", e);
            throw new ServletException(e);
        }
    }
}

