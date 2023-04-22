package com.redhat.demo.socket;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.*;

/**
 * Camel route definitions.
 */
public class Routes extends RouteBuilder {
   
    public Routes() {

        /* Let's add some initial data/variables stuff ... */
        
    }

    @Override
    public void configure() throws Exception {

        /* from("netty4:tcp://localhost:32080?sync=true")
                .process(
                        new Processor() {
                                public void process(Exchange exchange) throws Exception {
                                        String response = (String) exchange.getIn().getBody();
                                        System.out.println("Respuesta desde Server: "+response);
                                        exchange.getOut().setBody(response);
                                }
                        }
                );
        */

        /** Consumer **/
        from("netty:tcp://localhost:3001?keepAlive=true&sync=true")
           .process(
                new Processor() {
                        public void process(Exchange exchange) throws Exception {
                                String response = (String) exchange.getIn().getBody();
                                System.out.println("Respuesta desde Server: "+response);
                                exchange.getOut().setBody(response);
                        }
                }
           )
           .to("rest:post:process?host=localhost:8080/api");
        
        /** Producer  **/
        from("timer://foo?fixedRate=true&period=1000")
        .setBody(simple("Hello Testing socket!"))
        .to("netty:tcp://localhost:3001?keepAlive=true&sync=true");

    }
}