package org.example.s2_tomcat.server;

import org.example.s2_tomcat.http.request.HttpRequest;
import org.example.s2_tomcat.http.response.HttpResponse;
import org.example.s2_tomcat.web.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ClientHandler implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(ClientHandler.class);

    private final Socket socket;
    private final Map<String, Controller> controllerMap;

    public ClientHandler(Socket socket, Map<String, Controller> controllerMap) {
        this.socket = socket;
        this.controllerMap = controllerMap;
    }

    @Override
    public void run() {
        try (socket;
             var in = new BufferedReader(new InputStreamReader(socket.getInputStream(), UTF_8));
             var out = new DataOutputStream(socket.getOutputStream())) {

            // 1. 요청 파싱
            HttpRequest request = new HttpRequest(in);
            HttpResponse response = new HttpResponse(out);

            // 2. GET만 처리
            if (!request.isGetRequest()) {
                log.warn("Unsupported method: {}", request.getRequestLine().getMethod());
                return;
            }

            // 3. 라우팅
            Controller controller = controllerMap.get(request.getPath());
            if (controller == null) {
                log.warn("No controller found for path {}", request.getPath());
                // TODO: 404 응답 처리 가능
                return;
            }

            // 4. 컨트롤러 호출
            controller.handle(request, response);

        } catch (IOException e) {
            log.error("Client handling error: ", e);
        }
    }
}
