 /*   package com.codigo.msregistro.infraestructure.config;


    import com.github.tomakehurst.wiremock.WireMockServer;

    import static com.github.tomakehurst.wiremock.client.WireMock.*;

    public class WireMockConfig {
        private static WireMockServer wireMockServer;

        public static void start() {
            wireMockServer = new WireMockServer(8080);
            wireMockServer.start();
        }

        public static void stop() {
            wireMockServer.stop();
        }

        public static void configureStub(String url, String response) {
            stubFor(get(urlMatching(url))
                    .willReturn(aResponse()
                            .withStatus(200)
                            .withBody(response)));
        }
    }
*/