package com.redhat.demo.rest;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.*;
import com.redhat.demo.rest.model.ISO8583Bean;
import com.redhat.demo.rest.model.ResponseBean;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;

/**
 * Camel route definitions.
 */
public class Routes extends RouteBuilder {
   
    public Routes() {

        /* Let's add some initial data/variables stuff ... */
        
    }

    @Override
    public void configure() throws Exception {

        JacksonDataFormat dataFormat = new JacksonDataFormat();
        dataFormat.setAutoDiscoverObjectMapper(true);

        rest("/api")
        .post("/process")
            .outType(ResponseBean.class)
            .to("direct:process");

        from("direct:process")
                .process(
                    new Processor() {
                            public void process(Exchange exchange) throws Exception {
                                //ISO8583Bean transaction = (ISO8583Bean) exchange.getIn().getBody();
                                //if(transaction!=null)
                                //    System.out.println("Mensaje recibido.\n"+transaction.toString());
                                String mensaje = exchange.getIn().getBody(String.class);
                                System.out.println("--- Mensaje recibido:\n"+mensaje);
                                ResponseBean response = new ResponseBean();
                                response.setStatus(1);
                                response.setDescription("Transaccion exitosa!");
                                exchange.getOut().setBody(response);
                            }
                    }
               )
               .marshal(dataFormat);

    }
}