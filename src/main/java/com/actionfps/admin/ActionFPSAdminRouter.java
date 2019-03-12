package com.actionfps.admin;

import com.actionfps.ActionFPSAdminInterface;
import com.actionfps.ActionFPSAdminRouterInterface;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@SuppressWarnings("unused")
public class ActionFPSAdminRouter implements ActionFPSAdminRouterInterface {
    public RouterFunction<ServerResponse> createRouter(ActionFPSAdminInterface actionFPSAdminInterface) {
        return RouterFunctions.route()
                .GET("/", accept(MediaType.TEXT_PLAIN),
                        request -> ServerResponse.ok().body(fromObject("Hello World! Version: " + actionFPSAdminInterface.version()))).build();
    }

    public ActionFPSAdminRouter() {
    }
}
